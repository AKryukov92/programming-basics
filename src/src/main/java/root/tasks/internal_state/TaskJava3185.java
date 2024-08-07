package root.tasks.internal_state;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;

public class TaskJava3185 extends LayoutMaker implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте НЕстатический метод для решения задачи " + linkToTask(1058));
        appendOrderedNonEscaped(
                "Убедитесь, что у класса Point объявлены поля для действительных значений \"x\" и \"y\".",
                implementNonStatic("Point", "distanceTo"),
                "Метод distanceTo принимает в качестве аргумента 1 экземпляр класса Point и возвращает действительное число.",
                "В теле метода верните результат решения задачи. Для его вычисления используйте поля \"x\" и \"y\" экземпляра, у которого вызвали метод, и поля \"x\" и \"y\" экземпляра, который передали в качестве аргумента."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrderedNonEscaped(
                "В классе PointSuite создайте юнит-тест distanceToPointTest.",
                "В теле метода distanceToPointTest создайте 2 переменных типа Point: src и dest. Инициализируйте их экземплярами класса Point.",
                "Для каждой строки тестовых данных из задачи напишите в теле юнит-теста фрагмент кода:",
                "Инициализируйте поля \"x\" и \"y\" переменной src значениями 1 и 1.",
                "Инициализируйте поля \"x\" и \"y\" переменной dest значениями 3 и 4.",
                "Вызовите метод distanceTo у экземпляра класса Point из переменной src.",
                "Передайте ему в качестве аргумента переменную dest.",
                "Проверьте, что результат вызова метода distanceTo вернул значение 3.6056.",
                "После запуска тестового метода, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
