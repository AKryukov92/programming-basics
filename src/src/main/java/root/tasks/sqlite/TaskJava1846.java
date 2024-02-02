package root.tasks.sqlite;

import root.tasks.TwoInputValLayout;

import java.sql.*;

public class TaskJava1846 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит длительность(upperMilliseconds) - целое число и цену(lowerUnitPrice) - действительное число. Вывести длительность(Milliseconds), цену(UnitPrice), название(Name) и композитора(Composer) всех треков, у которых длительность меньше указанной, а цена выше указанной.");
        appendCheckValuesHeader("upperMilliseconds", "lowerUnitPrice");
        appendCheckValuesRow("10000", "0.01");
        appendCheckValuesRow("1250000", "1.00");
        appendCheckValuesRow("500000", "1.00");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String upperMilliseconds, String lowerUnitPrice) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:./files/sqlite/chinook.db");
        String sql = "select milliseconds, unitPrice, name, composer from tracks where milliseconds < ? and unitPrice > ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(upperMilliseconds));
        statement.setDouble(2, Double.parseDouble(lowerUnitPrice));
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString("milliseconds") + "\t" +
                    rs.getString("unitPrice") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("composer"));
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava1846());
    }
}
