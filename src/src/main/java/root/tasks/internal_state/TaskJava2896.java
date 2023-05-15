package root.tasks.internal_state;

import root.tasks.LayoutMaker;

public class TaskJava2896 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте класс ReverseCounter");
        appendOrderedNonEscaped(
                "В папке с исходным кодом создайте класс ReverseCounter.",
                "Объявите поле для целых чисел с названием current. Запишите в него значение 4.",
                "Создайте нестатический метод tick.",
                "Метод tick не принимает аргументов и возвращает целое число.",
                "В теле метода, если значение current больше 0, то уменьшите значение поля current на 1 и верните получившееся значение current.",
                "Если значение current равно 0, тогда просто верните значение current."
        );
        appendSubheading("Проверьте корректность работы класса с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "В методе main класса Program объявите переменную типа ReverseCounter с названием counter.",
                "Запишите в переменную counter ссылку на экземпляр класса.",
                "Объявите переменную current.",
                "Вызовите метод tick и запишите результат его вызова в переменную current.",
                "Выведите на экран значение переменной current.",
                "Вызовите метод tick еще раз. Результат снова запишите в переменную current.",
                "Еще раз выведите на экран значение переменной current.",
                "Выведите на экран результат третьего вызова метода tick.",
                "Еще три раза выведите на экран результат вызова метода tick.",
                "В результате запуска метода main должен получиться следующий результат:"
        );
        appendCheckSingleNonEscaped("3<br/>2<br/>1<br/>0<br/>0<br/>0");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava2896());
    }
}
