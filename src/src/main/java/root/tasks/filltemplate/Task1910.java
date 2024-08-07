package root.tasks.filltemplate;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task1910 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Переведите алгоритм с естественного языка на ваш язык программирования.");
        appendOrderedNonEscaped(
                "Объявите переменную companyName для хранения названия компании.",
                "Объявите переменную productName для хранения наименования товара.",
                "Объявите переменную productCost для хранения цены на товар.",
                "Объявите переменную messagePart для хранения фрагментов сообщения."
        );
        appendTaskDescEscaped("Получите данные от пользователя");
        appendOrderedNonEscaped(
                "Выведите на экран строковый литерал \"Задача 1910\".",
                "Выведите на экран строковый литерал \"Введите название компании\".",
                "Инициализируйте companyName - запишите в нее строку, полученную от пользователя.",
                "Выведите на экран строковый литерал \"Введите наименование товара\".",
                "Инициализируйте productName - запишите в нее строку, полученную от пользователя.",
                "Выведите на экран строковый литерал \"Введите цену товара\".",
                "Инициализируйте productCost - запишите в нее строку, полученную от пользователя."
        );
        appendTaskDescEscaped("Сформируйте ответ и выведите его на экран");
        appendOrderedNonEscaped(
                "Выполните конкатенацию строкового литерала \"Распродажа в \", переменной companyName и строкового литерала \"!\".",
                "Запишите в переменную messagePart результат конкатенации из предыдущего пункта.",
                "Выведите на экран значение переменной messagePart.",
                "Выполните конкатенацию строкового литерала \"наши \" и переменной productName.",
                "Запишите в переменную messagePart результат конкатенации из предыдущего пункта.",
                "Выполните конкатенацию переменной messagePart и строкового литерала \" по супер цене. Всего \".",
                "Запишите в переменную messagePart результат конкатенации из предыдущего пункта.",
                "Запишите в переменную messagePart результат конкатенации messagePart и переменной productCost.",
                "Запишите в переменную messagePart результат конкатенации messagePart и строкового литерала \"!\".",
                "Выведите на экран с новой строки значение переменной messagePart.",
                "Выведите на экран с новой строки значение строкового литерала \"Торопитесь, предложение ограничено!\"."
        );
        appendTaskDescEscaped("Убедитесь, что для всех исходных данных получается ожидаемый результат.");
        appendCheckValuesHeader();
        appendCheckValuesRow("Рога и копыта", "копыта", "30 рублей за штуку");
        appendCheckValuesRow("Слоновод", "слоны", "15 попугаев");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner input = new Scanner(Systemin);
        String companyName;
        String productName;
        String productCost;
        String messagePart;
        System.out.println("Задача 1910");
        System.out.println("Введите название компании");
        companyName = input.nextLine();
        System.out.println("Введите наименование товара");
        productName = input.nextLine();
        System.out.println("Введите цену товара");
        productCost = input.nextLine();
        messagePart = "Распродажа в " + companyName + "!";
        System.out.println(messagePart);
        messagePart = "Наши " + productName;
        messagePart = messagePart + " по супер цене. Всего ";
        messagePart = messagePart + productCost;
        messagePart = messagePart + "!";
        System.out.println(messagePart);
        System.out.println("Торопитесь, предложение ограничено!");
    }

    public static void main(String[] args) {
        System.out.println(new Task1910());
    }
}
