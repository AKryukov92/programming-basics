package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskCs3539 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(9271));
        appendOrdered(
                "В классе Library реализуйте публичный статический метод Task9271",
                "Он принимает в качестве аргумента массив действительных чисел",
                "В теле метода создайте новый массив и заполните его значениями, которые получатся в результате решения задачи.",
                "Массив, который был передан в качестве аргумента, измениться не должен"
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                "В методе main класса Program объявите переменные data и result для хранения массивов действительных чисел.",
                "Запишите в переменную data массив чисел {4 2 3 4 3 2}.",
                "Вызовите статический метод Task9271 класса Library. Передайте ему массив data в качестве аргумента.",
                "Запишите в переменную result результат вызова метода Task9271.",
                "Выведите на экран фразу 'После обработки массива'",
                "Выведите все элементы массива data на экран в строчку.",
                "Выведите на экран фразу 'получился массив'.",
                "Выведите все элементы массива result на экран в строчку.",
                "В результате запуска метода main должен получиться следующий результат:"
        );
        appendCheckSingle("После обработки массива\n" +
                "4 2 3 4 3 2\n" +
                "получился массив\n" +
                "2 0 1 2 1 0"
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В классе TestSuite создайте тестовый метод Task9271test.",
                "В теле тестового метода объявите переменные data, actual, expected для хранения массивов действительных чисел.",
                "Запишите в переменную data массив чисел {3 4 1 2 3 4 1 2 3 1 2}",
                "Вызовите статический метод Task9271 класса Library. Передайте ему массив data в качестве аргумента.",
                "Запишите результат вызова метода Task9271 в переменную actual.",
                "Запишите в переменную expected массив чисел {2 3 0 1 2 3 0 1 2 0 1}",
                "Вызовите статический метод areEqual класса CollectionAssert. Передайте переменную expected первым аргументом. Передайте переменную actual вторым аргументом.",
                "После запуска юнит-теста, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
