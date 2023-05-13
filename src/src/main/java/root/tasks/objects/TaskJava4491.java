package root.tasks.objects;

import root.tasks.LayoutMaker;

public class TaskJava4491 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для создания экземпляров класса Point со значениями по-умолчанию");
        appendOrderedNonEscaped(
                "Убедитесь, что у класса Point объявлены поля для целочисленных значений \"x\" и \"y\".",
                "В классе Point реализуйте статический метод \"zero\". Он не принимает аргументов и возвращает экземпляр класса Point.",
                "В теле метода объявите переменную instance типа Point и инициализируйте ее экземпляром класса Point.",
                "Инициализируйте поля \"x\" и \"y\" переменной instance значениями 0.",
                "Верните переменную instance в качестве результата работы метода."
        );
        appendSubheading("Используйте метод в тестовом методе distanceBetweenPointsTest");
        appendOrderedNonEscaped(
                "Запишите в переменную src результат вызова метода zero.",
                "Запишите в переменную dest результат вызова метода zero.",
                "Проверьте, что результат вызова метода distanceBetween с аргументами src и dest вернет значение 0 с точностью 0.0001.",
                "После запуска тестовых методов, все они должны быть отмечены зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
