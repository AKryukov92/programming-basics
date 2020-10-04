package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task3908 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - символы, разделенные символом \"#\". Вывести на экран третий с конца элемент.");
        appendCheckSingle("Индекс третьего элемента с конца $index\n" +
                "Значение этого элемента $value");
        appendCheckValuesHeader("arr");
        appendCheckValuesRow("qa#ws#ed#rf");
        appendCheckValuesRow("qaz#wsx#edc#rfv");
        appendCheckValuesRow("q#w#e");
        appendCheckValuesRow("q#w");
        appendCheckValuesRow("q");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = value.split("#");
        if (arr.length < 3) {
            System.out.println("Массив слишком маленький");
            return;
        }
        int index = arr.length - 3;
        System.out.println("Индекс третьего элемента с конца " + index);
        System.out.println("Значение этого элемента " + arr[index]);
    }
}
