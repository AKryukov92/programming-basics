package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava4274 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор альбома(ArtistId). Напечатать на экран название(Title) альбома(Albums), а также названия (Name) треков (Tracks) из этого альбома и их длительность (Milliseconds).");
        appendCheckValuesHeader("AlbumId");
        appendCheckValuesRow("10");
        appendCheckValuesRow("15");
        appendCheckValuesRow("413");
        appendCheckValuesRow("3");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String albumId) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        String selectAlbum = "select title from albums where albumId=?";
        PreparedStatement stmAlbum = connection.prepareStatement(selectAlbum);
        stmAlbum.setInt(1, Integer.parseInt(albumId));
        ResultSet resAlbum = stmAlbum.executeQuery();
        while (resAlbum.next()) {
            System.out.println("Альбом: " + resAlbum.getString("title"));
        }
        String selectTracks = "select name, milliseconds from tracks where albumid=?";
        PreparedStatement statement = connection.prepareStatement(selectTracks);
        statement.setInt(1, Integer.parseInt(albumId));
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name") + " " + rs.getString("milliseconds"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4274());
    }
}
