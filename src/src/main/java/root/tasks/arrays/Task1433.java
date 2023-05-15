package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task1433 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные символом \";\"(точка с запятой)." +
                " Вывести на экран индекс середины массива и элемент по этому индексу." +
                " Для четного количества элементов взять индекс ближе к началу массива." +
                " Для определения середины, вычтите 1 из длины, а затем разделите полученное значение на 2." +
                " Округлите итоговое значение вниз.");
        appendCheckValuesHeader("");
        appendCheckValuesRow("q;w;e");
        appendCheckValuesRow("q;w;e;r");
        appendCheckValuesRow("q;w;e;r;t;y;u;i;o");
        appendCheckValuesRow("q;w;e;r;t;y;u;i;o;p");
        appendCheckValuesRow("q");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = value.split(";");
        int index = (arr.length - 1) / 2;
        System.out.printf("Длина массива: %d Индекс: %d, элемент: %s", arr.length, index, arr[index]);
    }

    public static void main(String[] args) {
        System.out.println(new Task1433());
    }
}
