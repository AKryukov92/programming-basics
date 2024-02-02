package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava9857 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор плейлиста(playlistId). Вывести длительность(milliseconds) и названия(name) всех треков(tracks), которые находятся в этом плейлисте. Связь определить по таблице playlist_track. В конце вывести суммарную длительность плейлиста.");
        appendCheckValuesHeader("playlistId");
        appendCheckValuesRow("16");
        appendCheckValuesRow("13");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String playlistId) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectLink = connection.prepareStatement("select trackId from playlist_track where playlistId = ?");
        selectLink.setString(1, playlistId);
        ResultSet resLink = selectLink.executeQuery();
        System.out.println("идентификаторы треков плейлиста:");
        while (resLink.next()) {
            System.out.print(resLink.getString("trackId") + "   ");
        }
        System.out.println();
        PreparedStatement selectTracks = connection.prepareStatement("select name, milliseconds from tracks where trackId in (select trackId from playlist_track where playlistId = ?);");
        selectTracks.setString(1, playlistId);
        ResultSet resTracks = selectTracks.executeQuery();
        int total = 0;
        while (resTracks.next()) {
            int length = resTracks.getInt("milliseconds");
            System.out.println(length + "\t" + resTracks.getString("name"));
            total += length;
        }
        System.out.println("Суммарная длительность треков плейлиста " + total);
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9857());
    }
}
