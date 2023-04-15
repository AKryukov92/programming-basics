package root.tasks.collections;

import root.tasks.MultipleInputValLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TaskJava5087 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Выполните действия");
        appendOrderedEscaped(
                "Создайте класс Task5087",
                "Реализуйте в классе Task6087 стандартный метод main",
                "В методе main создайте экземпляр класса Scanner",
                "В конструктор класса Scanner передайте статическое поле in класса System",
                "Объявите переменную temp для хранения текста",
                "Объявите переменную list типа List<String>",
                "Создайте экземпляр класса ArrayList<String> и запишите его в переменную list",
                "Напечатайте в консоли фразу 'исходный размер листа:'",
                "Напечатайте в консоли результат вызова метода size у экземпляра класса List",
                "Напечатайте в консоли фразу 'введите первый элемент листа'",
                "Вызовите нестатический метод nextLine у экземпляра класса Scanner",
                "Результат вызова метода nextLine запишите в переменную temp",
                "Вызовите метод add у экземпляра класса ArrayList и передайте temp в качестве аргумента",
                "Напечатайте в консоли фразу 'размер листа после добавления элемента:'",
                "Вызовите метод size у экземпляра класса List и напечатайте его результат в консоли",
                "Напечатайте в консоли фразу 'введите второй элемент листа'",
                "Вызовите метод nextLine у экземпляра класса Scanner",
                "Передайте результат вызова метода nextLine в качестве аргумента метода add",
                "Напечатайте в консоли фразу 'размер листа после добавления двух элементов:'",
                "Вызовите метод size у экземпляра класса List и напечатайте в консоли результат",
                "Вызовите метод get у экземпляра класса ArrayList и передайте ему 1 в качестве аргумента",
                "Полученное на предыдущем шаге значение напечатайте в консоли",
                "Напечатайте в консоли результат вызова метода get у класса ArrayList с аргументом 0"
        );
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("начало", "конец");
        appendCheckValuesRow("первое", "второе");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        Iterator<String> scanner = Arrays.asList(args).listIterator();
        String temp;
        List<String> list = new ArrayList<>();
        System.out.println("исходный размер листа:");
        System.out.println(list.size());
        System.out.println("введите первый элемент листа");
        temp = scanner.next();
        list.add(temp);
        System.out.println("размер листа после добавления элемента:");
        System.out.println(list.size());
        System.out.println("введите второй элемент листа");
        list.add(scanner.next());
        System.out.println("размер листа после добавления двух элементов:");
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.get(0));
    }
}
