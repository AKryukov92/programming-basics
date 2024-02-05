package root.tasks.methods;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task3355 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число total. Выведите на экран в столбик все целые числа от 1 до total включительно. В начале программы должно появиться слово \"Введение\", а после всех чисел - слово \"Заключение\". Перед каждым числом нужно написать слово \"Глава\".");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task3355.",
                "Метод принимает одно целое число как аргумент и возвращает строку."
        );
        appendCheckValuesHeader("total");
        appendCheckValuesRow("0");
        appendCheckValuesRow("1");
        appendCheckValuesRow("2");
        appendCheckValuesRow("3");
        appendCheckValuesRow("4");
        appendCheckValuesRow("6");
        appendCheckValuesRow("5");
        appendCheckValuesRow("20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        System.out.println(Library.task3355(Integer.parseInt(value)));
    }

    static class Library {
        public static String task3355(int total) {
            String result = "Введение\n";
            int i = 1;
            while (i <= total) {
                result += "Глава " + i + "\n";
                i++;
            }
            return result + "Заключение";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3355());
    }
}
