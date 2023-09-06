package root.tasks.exceptions;

import root.tasks.MultipleInputValLayout;

public class TaskCs9354 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Прочитайте условие задачи.");
        appendTaskDescNonEscaped("Вычислить дискриминант квадратного уравнения по формуле <formula>discriminant = b<sup>2</sup>-4ac</formula>");
        appendCheckValuesHeader("a", "b","c");
        appendCheckValuesRow("7", "1", "3");
        appendCheckValuesRow("7247", "7243", "7229");
        appendCheckValuesRow("-11", "-13", "-17");
        appendCheckValuesRow("0", "1", "3");
        appendCheckValuesRow("0", "1000", "2000");
        appendCheckValuesFooter();
        appendSubheading("Реализуйте статический метод с тремя аргументами");
        appendOrderedEscaped(
                "Объявите в классе Library публичный статический метод GetDiscriminant.",
                "Он принимает в качестве аргумента 3 действительных числа.",
                "Метод возвращает действительное число в качестве результата.",
                "Если значение аргумента \"a\" равно 0, то метод должен выбросить исключение ArgumentException."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrderedEscaped(
                "Создайте проект Runner9354",
                "В проекте Runner9354 добавьте ссылку на проект CodeProject.",
                "Добавьте команду using пространства имен из проекта CodeProject.",
                "В методе Main класса Program вызовите метод GetDiscriminant класса Library.",
                "Первым аргументом передайте ему значение 7, вторым - значение 1, третьим - значение 3.",
                "Получите три действительных числа от пользователя и запишите их в переменные a, b, c",
                "Вызовите метод getDiscriminant класса Library и передайте ему значения a, b, c в качестве аргументов.",
                "Предусмотрите перехват исключения, которое может выбросить метод.",
                "Проверьте программу по таблице тестовых и ожидаемых данных."
        );
        appendFooter();
    }

    public static double getDiscriminant(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        return b * b - 4 * a * c;
    }

    @Override
    protected void logic(String... args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        try {
            double result = getDiscriminant(a, b, c);
            System.out.printf("Дискриминант уравнения y=%fx^2+%fx+%f равен %f", a, b, c, result);
        } catch (IllegalArgumentException ex) {
            System.out.printf("Уравнение y=%fx^2+%fx+%f не является квадратным", a, b, c);
        }
    }
}
