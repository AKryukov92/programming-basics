package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava1759 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит текст. Нужно найти идентификатор(TrackId), полное название(Name) и композитора(Composer) треков(tracks), у которых введенный текст присутствует в поле название(Name) или композитор(Composer).");
        appendCheckValuesHeader("search");
        appendCheckValuesRow("bizet");
        appendCheckValuesRow("cop");
        appendCheckValuesRow("glass");
        appendCheckValuesRow("beat");
        appendCheckValuesRow("story");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        PreparedStatement selectTracks = connection.prepareStatement("select trackId, name, composer from tracks where name like ? or composer like ?;");
        selectTracks.setString(1, "%" + value + "%");
        selectTracks.setString(2, "%" + value + "%");
        ResultSet resTracks = selectTracks.executeQuery();
        while (resTracks.next()) {
            System.out.println(resTracks.getString("trackId") + "\t" +
                    resTracks.getString("name") + "\t" +
                    resTracks.getString("composer"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava1759());
    }
}
