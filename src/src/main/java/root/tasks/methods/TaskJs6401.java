package root.tasks.methods;

import root.tasks.LayoutMaker;

public class TaskJs6401 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте функцию для решения задачи " + linkToTask(8867));
        appendOrdered(
                "В файле для исходного кода реализуйте функцию Task8867.",
                "Она принимает три действительных числа: A, B, X и возвращает логическое значение.",
                "Если X принадлежит интервалу от A до B, метод должен вернуть значение true.",
                "Если X за пределами интервала от A до B, метод должен вернуть значение false."
        );
        appendSubheading("Проверьте корректность работы функции с помощью юнит-теста");
        appendOrdered(
                "Создайте юнит-тест для проверки задачи и подпишите его словами \"в задаче 8867 проверяем что интервал содержит 'x'\".",
                "Объявите переменную result для хранения логических значений",
                "В теле юнит-теста вызовите функцию Task8867 класса Library.",
                "Передайте ему в качестве исходных данных A=-2, B=7, X=-10.",
                "Результат вызова функции запишите в переменную result.",
                "Вызовите функцию expect и передайте ей в качестве аргумента переменную result.",
                "В той же строчке через точку вызовите функцию toBeFalsy.",
                "Вызовите функцию Task8867 еще раз со значениями A=-4, B=5, X=0.",
                "Результат вызова функции запишите в переменную result.",
                "Вызовите функцию expect и передайте ей в качестве аргумента переменную result.",
                "В той же строчке через точку вызовите функцию toBeTruthy.",
                "При открытии файла SpecRunner.html, в нем должна быть зеленая строка \"в задаче 8867 проверяем что интервал содержит 'x'\"."
        );
        appendFooter();
    }
}
