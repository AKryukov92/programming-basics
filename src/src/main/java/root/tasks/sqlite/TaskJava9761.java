package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava9761 extends OneInputValLayout {
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

    @Override
    protected void logic(String trackid) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
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
            albumid = resultTrack.getInt("albumId");
            String selectAlbum = "select title from albums where albumId=?";
            statement = connection.prepareStatement(selectAlbum);
            statement.setInt(1, albumid);
            ResultSet resultAlbum = statement.executeQuery();
            if (resultAlbum.next()) {
                System.out.println("Альбом: " + resultAlbum.getString("title"));
            }
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

    public static void main(String[] args) {
        System.out.println(new TaskJava9761());
    }
}
