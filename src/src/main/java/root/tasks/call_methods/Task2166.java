package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class Task2166 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcdacadbacdaabaadc\"." +
                " Пользователь вводит комбинацию из двух символов." +
                " В исходной строке заменить эту комбинацию (подстроку) на пробелы." +
                " Воспользуйтесь методом replace. Найдите его в документации." +
                " Первый аргумент - старое значение." +
                " Второй аргумент - новое значение.");
        appendCheckValuesHeader("substring");
        appendCheckValuesRow("cd");
        appendCheckValuesRow("aa");
        appendCheckValuesRow("xy");
        appendCheckValuesRow("abc");
        appendCheckValuesRow("f");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String substring) {
        String str = "abcdacadbacdaabaadc";
        if (substring.length() != 2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        }
        System.out.println(str.replace(substring, " "));
    }
}
