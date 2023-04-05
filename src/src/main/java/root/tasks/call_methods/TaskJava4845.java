package root.tasks.call_methods;

import root.tasks.TwoInputValLayout;

public class TaskJava4845 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Дана фиксированная строка \"abcdefwxyz\"." +
                " Пользователь вводит два числа: CA и CB." +
                " Если CA меньше CB, то вывести буквы на индексах от CA до CB, исключая CB." +
                " В ином случае, вывести буквы на индексах от CB до CA, исключая CA." +
                " Примените метод substring с двумя аргументами." +
                " <a target='_blank' href='https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-'>(открыть справку в новой вкладке)</a>");
        appendCheckValuesHeader("CA", "CB");
        appendCheckValuesRow("0", "3");
        appendCheckValuesRow("3", "0");
        appendCheckValuesRow("3", "3");
        appendCheckValuesRow("2", "6");
        appendCheckValuesRow("0", "9");
        appendCheckValuesRow("-1", "4");
        appendCheckValuesRow("20", "4");
        appendCheckValuesRow("5", "-2");
        appendCheckValuesRow("7", "17");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int ca = Integer.parseInt(firstValue);
        int cb = Integer.parseInt(secondValue);
        String STR = "abcdefwxyz";
        if (ca < 0 || ca > STR.length()) {
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
            return;
        }
        if (cb < 0 || cb > STR.length()) {
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
            return;
        }
        System.out.println("Записываю значение '" + STR + "' в переменную STR");
        if (ca > cb) {
            System.out.println("От CB до CA. Вызов метода выглядит так:");
            System.out.println("String result = STR.substring(cb, ca);");
            String result = STR.substring(cb, ca);
            System.out.println("Переменная result содержит '" + result + "'");
        } else {
            System.out.println("От CA до CB. Вызов метода выглядит так:");
            System.out.println("String result = STR.substring(cb, ca);");
            String result = STR.substring(ca, cb);
            System.out.println("Переменная result содержит '" + result + "'");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4845());
    }
}
