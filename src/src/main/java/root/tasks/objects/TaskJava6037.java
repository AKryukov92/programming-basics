package root.tasks.objects;

import root.tasks.LayoutMaker;

public class TaskJava6037 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для решения задачи " + linkToTask(6589));
        appendOrdered(
                "Объявите у класса Range поля для целочисленных значений \"from\" и \"to\".",
                        "В классе Range реализуйте еще один публичный статичекий метод hasIntersection.",
                        "Новый метод hasIntersection принимает в качестве аргументов 2 экземпляра класса Range и возвращает логическое значение.",
                        "В теле метода нужно вернуть результат решения задачи. В вычислениях нужно использовать поля \"from\" и \"to\" экземпляров класса Range, которые были переданы в качестве аргументов.",
                        "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В классе RangeSuite создайте юнит-тест hasIntersectionRangesTest.",
                        "В теле метода hasIntersectionRangesTest создайте 2 переменных типа Range: left и right. Инициализируйте их экземплярами класса Range.",
                        "Инициализируйте поле \"from\" переменной red значением 23.",
                        "Инициализируйте поле \"to\" переменной red значением 27.",
                        "Инициализируйте поле \"from\" переменной green значением 29.",
                        "Инициализируйте поле \"from\" переменной green значением 31.",
                        "Вызовите статический метод hasIntersection класса Range и передайте ему в качестве аргументов значения переменных red и green.",
                        "Проверьте, что метод hasIntersection возвращает false.",
                        "После запуска тестового метода, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendSubheading("Проверьте юнит-тестами, что метод выбрасывает ислючение при некорректных данных");
        appendOrdered(
                "В классе RangeSuite создайте 2 юнит-теста hasIntersectionRangesWrongRedTest и hasIntersectionRangesWrongGreenTest.",
                        "Они должны проверять факт возникновения исключения IllegalArgumentException.",
                        "В теле метода hasIntersectionRangesWrongRedTest инициализируйте два экземпляра класса Range: left и right.",
                        "Заполните значения их полей так, чтобы левый интервал получился некорректным.",
                        "Вызовите метод hasIntersection и передайте ему red и green в качестве аргументов.",
                        "В теле метода hasIntersectionRangesWrongGreenTest проверьте что метод hasIntersection выбрасывает исключение в случае, когда правый интервал некорректный.",
                        "После запуска тестовых методов, они должны быть отмечены зеленым знаком в списке методов."
        );
        appendFooter();
    }

    public static class Range {
        public double from;
        public double to;


    }
}
