package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava7845 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор исполнителя (artistId), нужно вывести список названий(name) треков(tracks) этого исполнителя. Связь треков и исполнителей определить по таблице альбомов.");
        appendCheckValuesHeader("artistId");
        appendCheckValuesRow("1");
        appendCheckValuesRow("59");
        appendCheckValuesRow("152");
        appendCheckValuesFooter();
        appendFooter();
        appendTaskDescEscaped("Задачу можно решить двумя способами: множеством запросов в цикле, а также с помощью where in");
    }

    @Override
    protected void logic(String artistId) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectAlbums = connection.prepareStatement("select albumId from albums where artistId = ?;");
        selectAlbums.setString(1, artistId);
        ResultSet resAlbums = selectAlbums.executeQuery();
        System.out.println("Идентификаторы альбомов исполнителя:");
        while (resAlbums.next()) {
            System.out.print(resAlbums.getString("albumId") + " ");
        }
        System.out.println();
        PreparedStatement selectTracks = connection.prepareStatement("select name from tracks where albumId in (select albumId from albums where artistId = ?)");
        selectTracks.setString(1, artistId);
        ResultSet resTracks = selectTracks.executeQuery();
        System.out.println("Треки исполнителя:");
        while (resTracks.next()) {
            System.out.print(resTracks.getString("name") + "    ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava7845());
    }
}
