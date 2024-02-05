package root.tasks.methods;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task3147 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит символ (needle), который может быть одной из букв: a,b,c,d,e,f,g,h. Нужно выводить все эти буквы в строчку, пока не будет выведена буква X.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task1292.",
                "Он принимает символ и возвращает строку."
        );
        appendCheckValuesHeader("needle");
        appendCheckValuesRow("a");
        appendCheckValuesRow("b");
        appendCheckValuesRow("d");
        appendCheckValuesRow("h");
        appendCheckValuesRow("i");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        System.out.println(Library.task3147(value));
    }

    protected static class Library {
        public static String task3147(String x) {
            String[] values = "a,b,c,d,e,f,g,h".split(",");
            int i = 0;
            String result = "";
            while (i < values.length) {
                result += values[i];
                if (x.equals(values[i])) {
                    return result;
                }
                i++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3147());
    }
}
