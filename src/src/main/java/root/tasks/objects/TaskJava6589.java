package root.tasks.objects;

import root.tasks.LayoutMaker;

public class TaskJava6589 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для решения задачи " + linkToTask(6589));
        appendOrdered(
                "В папке для исходного кода создайте класс Range.",
                "В классе Range реализуйте публичный статический метод hasIntersection.",
                "Он принимает в качестве аргумента 4 целых числа и возвращает логическое значение.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В папке для юнит-тестов создайте класс RangeSuite.",
                "В классе RangeSuite создайте юнит-тест hasIntersectionIntsTest.",
                "В теле метода hasIntersectionIntsTest вызовите метод hasIntersection.",
                "Передайте в качестве аргументов значения 2, 3, 5 и 7.",
                "Проверьте, что метод hasIntersection вернул значение false.",
                "В теле метода hasIntersectionIntsTest вызовите метод hasIntersection еще раз.",
                "Передайте в качестве аргументов значения 11, 17, 13, 19.",
                "Проверьте, что метод hasIntersection вернул значение true.",
                "После запуска тестового метода, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendSubheading("Проверьте юнит-тестами, что метод выбрасывает ислючение при некорректных данных");
        appendOrdered(
                "В классе RangeSuite создайте 2 юнит-теста hasIntersectionIntsWrongRedTest и hasIntersectionIntsWrongGreenTest.",
                "Они должны проверять факт возникновения исключения IllegalArgumentException.",
                "В теле метода hasIntersectionIntsWrongRedTest вызовите метод hasIntersection.",
                "Передайте ему в качестве аргументов значения 79, 73, 83, 89.",
                "В теле метода hasIntersectionIntsWrongGreenTest вызовите метод hasIntersection.",
                "Передайте ему в качестве аргументов значения 97, 101, 107, 103.",
                "После запуска тестовых методов, они должны быть отмечены зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
