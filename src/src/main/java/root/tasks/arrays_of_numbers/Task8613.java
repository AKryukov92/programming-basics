package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task8613 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Отсутствуют данные о фрагментах");
            return;
        }
        if (secondValue.isEmpty()) {
            System.out.println("Отсутствуют данные об индексах");
            return;
        }
        String[] fragments = firstValue.split(" ");
        String[] indexes = secondValue.split(" ");
        int i = 0;
        while (i < indexes.length) {
            int j = Integer.parseInt(indexes[i]);
            if (fragments.length > j) {
                System.out.print("Значение элемента на индексе " + j + " это ");
                System.out.println(fragments[j]);
            } else {
                System.out.print("В массиве длиной " + fragments.length + " не может быть элемента на индексе " + j);
            }
            i = i + 1;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных. Первый массив содержит фрагменты текста. Второй - числа. Они обозначают индексы элементов. Вывести элементы первого массива на индексах из второго массива. Если элемент отсутствует, вывести сообщение \"нет элемента на индексе X\".");
        appendCheckValuesHeader("fragments", "indexes");
        appendCheckValuesRow("a s d f g h j k", "5 3 2 0");
        appendCheckValuesRow("qaz wsx edc", "5 3 2 0");
        appendCheckValuesRow("as df gh jk", "3 1");
        appendCheckValuesRow("q w e r t y u i o p", "9 7 3 5");
        appendCheckValuesRow("asdf qwer", "9 8");
        appendCheckValuesRow("", "2 1 5");
        appendCheckValuesRow("v c x z", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task8613().getContent());
    }
}
