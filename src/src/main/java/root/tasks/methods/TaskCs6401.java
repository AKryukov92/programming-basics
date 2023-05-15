package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskCs6401 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(8867));
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task8867.",
                "Он принимает три действительных числа: A, B, X и возвращает логическое значение.",
                "Если X принадлежит интервалу от A до B, метод должен вернуть значение true.",
                "Если X за пределами интервала от A до B, метод должен вернуть значение false."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrderedNonEscaped(
                "В классе TestSuite создайте юнит-тест для проверки задачи Task8867.",
                "Объявите переменную result для хранения логических значений",
                "В теле юнит-теста вызовите метод Task8867 класса Library.",
                "Передайте ему в качестве исходных данных A=-2, B=7, X=-10.",
                "Результат вызова метода запишите в переменную result.",
                "Вызовите метод IsFalse класса Assert и передайте ему в качестве аргумента переменную result.",
                "Вызовите метод Task8867 еще раз со значениями A=-4, B=5, X=0.",
                "Результат вызова метода запишите в переменную result.",
                "Вызовите метод IsTrue класса Assert и передайте ему в качестве аргумента переменную result.",
                "После запуска юнит-теста, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
