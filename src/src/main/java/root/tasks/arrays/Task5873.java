package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Task5873 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        int t = Integer.parseInt(secondValue);
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split(" ");
        if (t < 0 || t >= arr.length) {
            System.out.println("Число T должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println("Элемент на индексе " + t + " содержит значение " + arr[t]);
        if (t == 0) {
            System.out.println("Предыдущий элемент не существует");
        } else {
            System.out.println("Значение предыдущего элемента " + arr[t - 1]);
        }
        if (t == arr.length - 1) {
            System.out.println("Следующий элемент не существует");
        } else {
            System.out.println("Значение следующего элемента " + arr[t + 1]);
        }
    }

    private void logic2(String firstValue, String secondValue) {
        int t = Integer.parseInt(secondValue);
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split(" ");
        if (t < 0 || t >= arr.length) {
            System.out.println("Число T должно быть в интервале [0, размер массива)");
            return;
        }
        if (arr.length == 1 && t == 0) {
            System.out.println("Элемент на индексе 0 содержит значение " + arr[0] + "\n" +
                    "Предыдущий элемент не существует\n" +
                    "Следующий элемент не существует");
        } else if (t == 0) {
            System.out.println("Элемент на индексе 0 содержит значение " + arr[0] + "\n" +
                    "Предыдущий элемент не существует\n" +
                    "Значение следующего элемента " + arr[t + 1]);
        } else if (t == arr.length - 1) {
            System.out.println("Элемент на индексе " + t + " содержит значение " + arr[t] + "\n" +
                    "Значение предыдущего элемента " + arr[t - 1] + "\n" +
                    "Следующий элемент не существует");
        } else {
            System.out.println("Элемент на индексе " + t + " содержит значение " + arr[t] + "\n" +
                    "Значение предыдущего элемента " + arr[t - 1] + "\n" +
                    "Значение следующего элемента " + arr[t + 1]);
        }
    }

    private void matches(String firstValue, String secondValue) {
        String utf8 = StandardCharsets.UTF_8.name();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream out = new PrintStream(baos, true, utf8);
            PrintStream oldOut = System.out;
            System.setOut(out);
            this.logic(firstValue, secondValue);
            System.setOut(oldOut);
            String result = baos.toString(utf8);
            ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            PrintStream out2 = new PrintStream(baos2, true, utf8);
            System.setOut(out2);
            this.logic2(firstValue, secondValue);
            System.setOut(oldOut);
            String result2 = baos2.toString(utf8);
            System.out.println(result);
            System.out.println(result2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task5873 task = new Task5873();
        task.matches("as df gh jk", "4");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число T и данные - символы, разделенные пробелами.\n" +
                "Вывести на экран элемент на индексе T." +
                "Если возможно, то вывести на экран следующий и предыдущий элементы.");
        appendCheckValuesHeader("data", "T");
        appendCheckValuesRow("as df gh jk", "1");
        appendCheckValuesRow("a s d f g h j k", "3");

        appendCheckValuesRow("asdf ghjk", "0");
        appendCheckValuesRow("as df gh jk", "0");
        appendCheckValuesRow("a s d f g h j k", "0");

        appendCheckValuesRow("a s d f g h j k", "7");
        appendCheckValuesRow("as df gh jk", "3");
        appendCheckValuesRow("asdf ghjk", "1");

        appendCheckValuesRow("single", "0");

        appendCheckValuesRow("single", "1");
        appendCheckValuesRow("as df gh jk", "4");

        appendCheckValuesRow("as df gh jk", "-1");
        appendCheckValuesRow("", "0");
        appendCheckValuesFooter();
        appendFooter();
    }
}
