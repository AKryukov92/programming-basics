package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Task4077 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит строку, содержащую несколько пар слово=число. Эти пары разделены символом &. Нужно извлечь данные из строки и оформить по шаблону.");
        appendCheckValuesHeader("query");
        appendCheckValuesRow("lowerBound=0&upperBound=10");
        appendCheckValuesRow("albumId=73&genreId=6");
        appendCheckValuesRow("albumId=227&genreId=18&mediaTypeId=3");
        appendCheckValuesRow("trackId=7");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException, FileNotFoundException {
        String[] parts = value.split("&");
        System.out.println("Строка содержит " + parts.length + " пар");
        int i = 0;
        while (i < parts.length) {
            int index = parts[i].indexOf("=");
            if (index >= 0) {
                String result = parts[i].substring(index + 1);
                System.out.println("Значение " + result + " ключ " + parts[i].substring(0, index));
            } else {
                System.out.println("В паре отсутствует символ =");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4077());
    }
}
