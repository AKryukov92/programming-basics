package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.sql.*;

public class TaskJava9764 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Нужно вывести на экран список идентификаторов (artistId) и имен (name) всех исполнителей (artists).");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        String path = "./files/sqlite/chinook.db";
        //Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        //Подготовь запрос
        String sql = "select artistId, Name from artists";
        PreparedStatement statement = connection.prepareStatement(sql);
        //выполни запрос
        ResultSet rs = statement.executeQuery();
        //если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            String artistId = rs.getString("artistId");
            String name = rs.getString("Name");
            System.out.println(artistId + " " + name);//выведи данные на экран
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9764());
    }
}
