package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Task3005 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит строку. В данной строке находится слово, символ \"=\" и несколько цифр. Нужно извлечь из строки только цифры.");
        appendCheckValuesHeader("query");
        appendCheckValuesRow("artistId=0");
        appendCheckValuesRow("artistId=270");
        appendCheckValuesRow("albumId=15");
        appendCheckValuesRow("albumId=301");
        appendCheckValuesRow("trackId=2875");
        appendCheckValuesRow("trackId=7");
        appendCheckValuesRow("incorrect value");
        appendCheckValuesRow("=09876");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException, FileNotFoundException {
        int index = value.indexOf("=");
        if (index >= 0) {
            String result = value.substring(index + 1);
            System.out.println(result);
        } else {
            System.out.println("В строке отсутствует символ =");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3005());
    }
}
