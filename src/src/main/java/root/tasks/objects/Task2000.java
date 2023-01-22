package root.tasks.objects;

import root.tasks.LayoutMaker;

public class Task2000 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте параметризованный конструктор класса Range");
        appendOrdered(
                "В папке для исходного кода создайте класс Range.",
                "Объявите в классе Range поля \"from\" и \"to\" для чисел.",
                "В классе Range реализуйте публичный метод, который принимает в качестве аргументов 2 целых числа и называется Range (как класс). У него должно отсутствовать указание типа возвращаемого значения.",
                "В теле конструктора инициализируйте поля \"x\" и \"y\" значениями, которые были переданы в качестве аргументов.",
                "Скорее всего у вас должны появиться ошибки компиляции в других методах. Замените явную инициализацию полей на вызов конструктора."
        );
        appendFooter();
    }
}