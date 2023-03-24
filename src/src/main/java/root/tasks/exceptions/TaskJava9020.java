package root.tasks.exceptions;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;

public class TaskJava9020 extends LayoutMaker implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(9020));
        appendOrdered(
                implementStatic("Library", "task9020"),
                "Метод task9020 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи.",
                "Проверьте с помощью юнит-теста результат работы метода task9020 в случаях с корректными данными."
        );
        appendSubheading("Проверьте юнит-тестами, что метод выбрасывает исключение при некорректных данных");
        appendOrdered(
                "В классе TestSuite создайте еще 3 юнит-теста. Назовите их как task9020assertionX, где X - цифра от 1 до 3.",
                "Пометьте их аннотацией @Test с элементом expected равным IllegalArgumentException.class.",
                "В теле метода task9020assertionX вызовите метод task9020 класса Library и укажите аргументы, которые приводят к выбрасыванию исключения.",
                "После запуска юнит-тестов, они должны быть отмечены зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
