package root.tasks.collections;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;

public class TaskJava8317 extends LayoutMaker implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(8418));
        appendOrderedNonEscaped(
                "В классе Library импортируйте классы \"java.util.Arrays\" и \"java.util.List\".",
                implementStatic("Library","task8317"),
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел.",
                "В теле метода task8317 в случае получения некорректных значений аргументов, нужно выбросить исключение IllegalArgumentException и указать при этом текст ошибки из задачи."
        );
        appendSubheading("Проверьте с помощью юнит-теста результат работы метода task8317 в случаях с корректными данными.");
        appendOrderedNonEscaped(
                "В классе TestSuite создайте юнит-тест task8317test.",
                "В теле метода task8317test создайте переменные с названиями expected и actual типа List для целых чисел.",
                "Инициализируйте переменную expected результатом вызова статического метода asList класса Arrays. В качестве аргументов передайте числа, ожидаемые в первом тесте.",
                "Инициализируйте переменную actual результатом вызова метода task8317.",
                "Вызовите статический метод assertEquals класса Assert и передайте ему переменные expected и actual в качестве аргументов.",
                "Повторите эти действия для других тестов.",
                "Создайте юнит-тесты shouldNotAcceptNegativeArg и shouldNotAcceptZero. Укажите им тип ожидаемого исключения IllegalArgumentException.",
                "В теле метода shouldNotAcceptNegativeArg проверьте, что метод task8317 выбрасывает исключение в случае, когда первый аргумент - отрицательное число.",
                "В теле метода shouldNotAcceptNegativeArg проверьте, что метод task8317 выбрасывает исключение в случае, когда первый аргумент - ноль.",
                "После запуска тестовых методов, они должны быть отмечены зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
