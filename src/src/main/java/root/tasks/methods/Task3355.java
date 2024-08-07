package root.tasks.methods;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task3355 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано целое число total. Сформируйте текст сообщения, который состоит из нескольких частей. Основная часть сообщения содержит все целые числа от 1 до total включительно. Перед каждым числом нужно написать слово \"Глава\". В начале сообщения должно находиться слово \"Введение\", а после всех чисел - слово \"Заключение\". Для оформления сообщения в несколько строк, добавьте спецсимвол \"\\n\" в конце каждой строки.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task3355.",
                "Метод принимает одно целое число как аргумент и возвращает строку.",
                "В теле метода нельзя использовать команды вывода в консоль."
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
        appendTaskDescEscaped("Чтобы сформировать сообщение из нескольких частей, можно использовать промежуточную переменную как в примере ниже:");
        appendCheckSingleNonEscaped("String temp = \"Введение\\n\";\n" +
                "temp = temp + \"Глава 1\\n\";\n" +
                "temp = temp + \"Глава 2\\n\";\n" +
                "temp = temp + \"Заключение\";\n" +
                "return temp;");
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
