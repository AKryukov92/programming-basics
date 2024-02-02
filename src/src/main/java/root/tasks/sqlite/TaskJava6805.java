package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava6805 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит текст. Нужно найти идентификаторы(albumId,trackId) и полные названия(title,name) треков(tracks) и альбомов(albums), у которых в названии(title,name) присутствует введенный текст. Нужно выполнить конкатенацию символа \"%\", текста от пользователя и еще одного символа \"%\". Полученное значение нужно передать как параметр запроса.");
        appendCheckValuesHeader("search");
        appendCheckValuesRow("sym");
        appendCheckValuesRow("space");
        appendCheckValuesRow("beat");
        appendCheckValuesRow("story");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String search) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectTracks = connection.prepareStatement("select trackId, name from tracks where name like ?;");
        selectTracks.setString(1, "%" + search + "%");
        ResultSet resTracks = selectTracks.executeQuery();
        System.out.println("Треки:");
        while (resTracks.next()) {
            System.out.println(resTracks.getString("trackId") + " " + resTracks.getString("name"));
        }
        PreparedStatement selectAlbums = connection.prepareStatement("select albumId, Title from albums where Title like ?;");
        selectAlbums.setString(1, "%" + search + "%");
        ResultSet resAlbums = selectAlbums.executeQuery();
        System.out.println("Альбомы:");
        while (resAlbums.next()) {
            System.out.println(resAlbums.getString("albumId") + " " + resAlbums.getString("Title"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava6805());
    }
}
