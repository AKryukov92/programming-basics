package root.tasks.sqlite;

import root.tasks.OneInputValLayout;

import java.io.FileNotFoundException;
import java.sql.*;

public class TaskCs7361 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит идентификатор альбома(AlbumId). Напечатать на экран названия(Name) треков(Tracks), которые в него входят.");
        appendTaskDescEscaped("Чтобы использовать СУБД, нужно добавить библиотеки:");

        appendTaskDescNonEscaped("Файл базы данных это " + linkToFile("files/task7361/chinook.db"));
        appendTaskDescNonEscaped("Чтобы отладить запрос, можно воспользоваться утилитами: ");
        appendOrderedNonEscaped(
                linkToFile("files/task7361/sqlite3.exe"),
                linkToFile("files/task7361/sqldiff.exe"),
                linkToFile("files/task7361/sqlite3_analyzer.exe")
        );
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
        String path = "./files/sqlite/chinook.db";
        //Устанави подключение к файлу Базы Данных
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        //Подготовь запрос
        String sql = "select Name from tracks where AlbumId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        //укажи, что вместо вопроса нужно подставить значение от пользователя
        statement.setInt(1, Integer.parseInt(albumId));
        //выполни запрос
        ResultSet rs = statement.executeQuery();
        //если в результате есть данные, перейди к первой/следующей строчке
        while (rs.next()) {
            //в текущей строчке результата(таблицы) прочитай данные из колонки Name
            String name = rs.getString("Name");
            System.out.println(name);//выведи данные на экран
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs7361());
    }
}
