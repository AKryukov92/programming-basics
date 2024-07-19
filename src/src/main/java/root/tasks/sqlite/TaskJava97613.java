package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TaskJava97613 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор трека(TrackId). Нужно вывести информацию о треке: Название (Name), композитор (Composer), длительность (Milliseconds), цену (UnitPrice). Также определите по AlbumId название(title) альбома(album), в который входит этот трек. Определите по GenreId название (name) жанра (genres).");
        appendCheckValuesHeader("TrackId");
        appendCheckValuesRow("91");
        appendCheckValuesRow("144");
        appendCheckValuesRow("3");
        appendCheckValuesRow("5");
        appendCheckValuesFooter();
        appendFooter();
        appendTaskDescEscaped("Эту задачу можно решить через JOIN или через отправку нескольких запросов.");
    }

    static class Album {
        private String albumId;
        private String title;
        private String artistId;

        public Album(String albumId, String title, String artistId) {
            this.albumId = albumId;
            this.title = title;
            this.artistId = artistId;
        }

        public String getArtistId() {
            return artistId;
        }

        public String getAlbumId() {
            return albumId;
        }

        public String getTitle() {
            return title;
        }
    }

    static class AlbumDataAccess {
        public static  Map<String, Album> getAlbums(Connection connection) throws SQLException {
            String selectAlbums = "select albumId, Title, artistId from albums";
            PreparedStatement statementAlbums = connection.prepareStatement(selectAlbums);
            ResultSet resultAlbums = statementAlbums.executeQuery();
            Map<String, Album> albumIdToNameMap = new HashMap<>();
            while(resultAlbums.next()) {
                String id = resultAlbums.getString("albumId");
                String title = resultAlbums.getString("Title");
                String artistId = resultAlbums.getString("artistId");
                Album a = new Album(id, title, artistId);
                albumIdToNameMap.put(id, a);
            }
            return albumIdToNameMap;
        }
    }

    @Override
    protected void logic(String trackid) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        Map<String, Album> albumIdToNameMap = AlbumDataAccess.getAlbums(connection);

        String selectTrack = "select Name, Composer, Milliseconds, UnitPrice, AlbumId, GenreId from tracks where trackid=?;";
        PreparedStatement statement = connection.prepareStatement(selectTrack);
        statement.setInt(1, Integer.parseInt(trackid));
        ResultSet resultTrack = statement.executeQuery();
        int genreId;
        int albumid;
        if (resultTrack.next()) {
            System.out.println("Название: " + resultTrack.getString("name"));
            System.out.println("Композитор: " + resultTrack.getString("composer"));
            System.out.println("Длительность: " + resultTrack.getString("milliseconds"));
            System.out.println("Цена: " + resultTrack.getString("unitprice"));
            String albumId = resultTrack.getString("albumId");
            Album a = albumIdToNameMap.get(albumId);
            System.out.println("Альбом: " + a.getTitle());

            genreId = resultTrack.getInt("genreId");
            String selectGenre = "select name from genres where genreId=?";
            statement = connection.prepareStatement(selectGenre);
            statement.setInt(1, genreId);
            ResultSet resultGenre = statement.executeQuery();
            if (resultGenre.next()) {
                System.out.println("Жанр: " + resultGenre.getString("name"));
            }
        }
    }

    static class Task97612Entry{
        String Name;
        String Composer;
        String Milliseconds;
        String UnitPrice;
        String albumName;
        String genreName;
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava97613());
    }
}
