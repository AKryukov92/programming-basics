package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Task5873 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        int idx = Integer.parseInt(secondValue);
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {
            String[] arr = firstValue.split(" ");
            if (idx < 0) {
                System.out.println("Индекс A должен быть больше или равен 0");
            }
            if (arr.length <= idx) {
                System.out.println("Индекс A должен быть строго меньше длины массива");
            }
            if (0 <= idx) {
                if (idx < arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("Элемент на индексе " + idx + " содержит значение " + arr[idx]);
                    if (idx == 0) {
                        System.out.println("Предыдущий элемент не существует");
                    }
                    if (0 < idx){
                        System.out.println("Значение предыдущего элемента " + arr[idx - 1]);
                    }
                    if (idx == arr.length - 1) {
                        System.out.println("Следующий элемент не существует");
                    }
                    if (idx < arr.length - 1){
                        System.out.println("Значение следующего элемента " + arr[idx + 1]);
                    }
                }
            }
        }
    }

    private void logic2(String firstValue, String secondValue) {
        int idx = Integer.parseInt(secondValue);
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split(" ");
        if (idx < 0 || idx >= arr.length) {
            System.out.println("Число T должно быть в интервале [0, размер массива)");
            return;
        }
        if (arr.length == 1 && idx == 0) {
            System.out.println("Элемент на индексе 0 содержит значение " + arr[0] + "\n" +
                    "Предыдущий элемент не существует\n" +
                    "Следующий элемент не существует");
        } else if (idx == 0) {
            System.out.println("Элемент на индексе 0 содержит значение " + arr[0] + "\n" +
                    "Предыдущий элемент не существует\n" +
                    "Значение следующего элемента " + arr[idx + 1]);
        } else if (idx == arr.length - 1) {
            System.out.println("Элемент на индексе " + idx + " содержит значение " + arr[idx] + "\n" +
                    "Значение предыдущего элемента " + arr[idx - 1] + "\n" +
                    "Следующий элемент не существует");
        } else {
            System.out.println("Элемент на индексе " + idx + " содержит значение " + arr[idx] + "\n" +
                    "Значение предыдущего элемента " + arr[idx - 1] + "\n" +
                    "Значение следующего элемента " + arr[idx + 1]);
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
        appendTaskDescEscaped("Пользователь вводит число idx и данные - символы, разделенные пробелами. " +
                "Вывести на экран элемент на индексе idx. " +
                "Если возможно, то вывести на экран следующий и предыдущий элементы.");
        appendCheckValuesHeader("data", "idx");
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
