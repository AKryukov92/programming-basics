package root.tasks.sqlite;

import root.tasks.MultipleInputValLayout;

import java.sql.*;

public class TaskJava6593 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит три идентификатора альбома(albumId). Нужно вывести длительность(Milliseconds), идентификатор альбома(AlbumId), цену(UnitPrice) и наименование(Name) треков, которые входят в один из указанных альбомов.");
        appendCheckValuesHeader("firstAlbumId", "secondAlbumId", "thirdAlbumId");
        appendCheckValuesRow("87", "138", "15");
        appendCheckValuesRow("50", "15", "3");
        appendCheckValuesRow("269", "500", "600");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectTracks = connection.prepareStatement("select milliseconds, albumId, unitPrice, name from tracks where albumId = ? or albumId = ? or albumId = ?;");
        selectTracks.setString(1, args[0]);
        selectTracks.setString(2, args[1]);
        selectTracks.setString(3, args[2]);
        ResultSet rs = selectTracks.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("milliseconds") + "\t" +
                    rs.getString("albumId") + "\t" +
                    rs.getString("unitPrice") + "\t" +
                    rs.getString("name"));
        }
    }
}
