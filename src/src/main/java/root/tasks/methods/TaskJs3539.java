package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskJs3539 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(9271));
        appendOrderedNonEscaped(
                "В файле для исходного кода реализуйте функцию Task9271.",
                "Она принимает в качестве аргумента массив действительных чисел.",
                "В теле функции создайте новый массив и заполните его значениями, которые получатся в результате решения задачи.",
                "Массив, который был передан в качестве аргумента, измениться не должен",
                "Верните сформированный массив как результат работы функции."
        );
        appendSubheading("Проверьте корректность работы функции с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "В корне директории создайте файл Runner3539.html. Подключите в нем файл с кодом 'src/lab12.js",
                "В скриптах на странице Runner3539.html объявите переменную data и result и report.",
                "Запишите в переменную data массив чисел [4 2 3 4 3 2].",
                "Вызовите функцию Task9271. Передайте ей массив data в качестве аргументов.",
                "Запишите в переменную result результат вызова функции Task9271.",
                "Запишите в переменную report строковый литерал 'После обработки массива'",
                "Допишите в переменную report элементы массива data в строчку.",
                "Допишите в переменную report фразу 'получился массив '",
                "Допишите в переменную report все элементы массива result в строчку.",
                "При открытии файла Runner3539.html, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped("После обработки массива\n" +
                "4 2 3 4 3 2\n" +
                "получился массив\n" +
                "2 0 1 2 1 0"
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrderedNonEscaped(
                "В файле с юнит-тестами вызовите функцию it. В описание теста напишите 'В задаче 9271 нужно вычесть значение минимального элемента из всех элементов'.",
                "В теле юнит-теста объявите переменные data, actual, expected.",
                "Запишите в переменную data массив чисел [3 4 1 2 3 4 1 2 3 1 2]",
                "Вызовите функцию Task9271. Передайте ей число 11 и массив data в качестве аргументов.",
                "Запишите результат вызова функции Task9271 в переменную actual.",
                "Запишите в переменную expected массив чисел [2 3 0 1 2 3 0 1 2 0 1]",
                "Вызовите функцию expect и передайте ей в качестве аргумента переменную data",
                "В той же строке через точку вызовите функцию toEqual и передайте ей в качестве аргумента переменную expected",
                "При открытии файла SpecRunner.html, в нем должна быть зеленая строка 'В задаче 9271 нужно вычесть значение минимального элемента из всех элементов'."
        );
        appendFooter();
        
    }
}
