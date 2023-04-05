package root.tasks.call_methods;

import root.tasks.TwoInputValLayout;

public class Task5923 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcdefwxyz\". Пользователь вводит два целых числа CA и CB. Удалить из исходной строчки CB штук символов, начиная с позиции CA. Вывести результат на экран. Один из вариантов решения - выполнить конкатенацию фрагментов от 0 до CA и от CB до конца строки.");
        appendCheckValuesHeader("CA", "CB");
        appendCheckValuesRow("5", "3");
        appendCheckValuesRow("6", "0");
        appendCheckValuesRow("0", "7");
        appendCheckValuesRow("-1", "1");
        appendCheckValuesRow("9", "3");
        appendCheckValuesRow("5", "-2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String STR = "abcdefwxyz";
        int ca = Integer.parseInt(firstValue);
        int cb = Integer.parseInt(secondValue);
        if (ca < 0 || ca > STR.length()) {
            System.out.println("Значение CA должно быть в интервале [0, длина строки)");
        } else if (cb < 0) {
            System.out.println("Значение CB должно быть неотрицательно");
        } else if ((ca + cb) > STR.length()) {
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
        }
        System.out.println(STR.substring(0, ca) + STR.substring(ca + cb));
    }
}
