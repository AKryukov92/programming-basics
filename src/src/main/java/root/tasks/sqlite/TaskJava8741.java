package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava8741 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор исполнителя(ArtistId). Напечатать на экран названия(Title) альбомов(albums) указанного исполнителя.");
        appendCheckValuesHeader("ArtistId");
        appendCheckValuesRow("8");
        appendCheckValuesRow("118");
        appendCheckValuesRow("315");
        appendCheckValuesRow("256");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String artistid) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        String sql = "select Title from albums where ArtistId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(artistid));
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("Title"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8741());
    }
}
