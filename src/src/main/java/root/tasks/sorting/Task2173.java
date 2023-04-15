package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task2173 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные символом \";\"(точка с запятой). Проверить, что массив отсортирован по возрастанию. Если какой-то элемент нарушает закономерность, вывести его индекс, значение и прекратить проверку.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("5;6;7;8;9");
        appendCheckValuesRow("2;3;3;3;3;4");
        appendCheckValuesRow("5");
        appendCheckValuesRow("4;5;6;7;3;2;1");
        appendCheckValuesRow("9;8");
        appendCheckValuesRow("4;5;6;7;6;7;8");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String data) {
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        if (!data.contains(";")) {
            System.out.println("Значения отсортированы по возрастанию");
            return;
        }
        String[] parts = data.split(";");
        int prev = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            int current = Integer.parseInt(parts[i]);
            if (current < prev) {
                System.out.println("Элемент со значением " + current + " на индексе " + i + " нарушает закономерность");
                return;
            }
            prev = current;
        }
        System.out.println("Значения отсортированы по возрастанию");
    }

    public static void main(String[] args) {
        System.out.println(new Task2173());
    }
}
