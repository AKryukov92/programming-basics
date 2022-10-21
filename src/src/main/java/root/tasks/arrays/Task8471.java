package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task8471 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив фрагментов текста. Элементы массива на четных индексах поставить в начало, а на нечетных - вслед за ними. Элементы на четных индексах должны следовать друг за другом так же как и в исходном массиве. Элементы на нечетных индексах - тоже.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("qw er ty ui op");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {


}
