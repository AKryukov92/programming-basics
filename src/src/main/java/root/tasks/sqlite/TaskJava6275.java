package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava6275 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор трека(TrackId). Нужно вывести информацию о треке: Название (Name), композитор (Composer), длительность (Milliseconds), цену (UnitPrice).");
        appendCheckValuesHeader("TrackId");
        appendCheckValuesRow("91");
        appendCheckValuesRow("144");
        appendCheckValuesRow("3");
        appendCheckValuesRow("5");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String trackid) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        String sql = "select name, composer, milliseconds, unitprice from tracks where trackid=?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(trackid));
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println("Название: " + rs.getString("name"));
            System.out.println("Композитор: " + rs.getString("composer"));
            System.out.println("Длительность: " + rs.getString("milliseconds"));
            System.out.println("Цена: " + rs.getString("unitprice"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava6275());
    }
}
