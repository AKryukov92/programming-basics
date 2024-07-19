package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava97612 extends OneInputValLayout {
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
        String selectTrack = "select t.Name, Composer, Milliseconds, UnitPrice, a.Title as albumName, g.Name as genreName " +
                "from tracks t " +
                "join albums a on t.AlbumId = a.AlbumId " +
                "join genres g on t.GenreId = g.GenreId " +
                "where trackid=?;";
        PreparedStatement statement = connection.prepareStatement(selectTrack);
        statement.setInt(1, Integer.parseInt(trackid));
        ResultSet resultTrack = statement.executeQuery();
        if (resultTrack.next()) {
            System.out.println("Название: " + resultTrack.getString("name"));
            System.out.println("Композитор: " + resultTrack.getString("composer"));
            System.out.println("Длительность: " + resultTrack.getString("milliseconds"));
            System.out.println("Цена: " + resultTrack.getString("unitprice"));
            System.out.println("Альбом: " + resultTrack.getString("albumName"));
            System.out.println("Жанр: " + resultTrack.getString("genreName"));
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
        System.out.println(new TaskJava97612());
    }
}
