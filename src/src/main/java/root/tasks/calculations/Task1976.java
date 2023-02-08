package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

public class Task1976 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Переведите алгоритм с естественного языка на ваш язык программирования.");
        appendTaskDesc("Объявите переменные");
        appendOrdered(
                "Объявите переменную temp для временного хранения строк получаемых от пользователя",
                "Объявите переменную height для хранения высоты прямоугольника",
                "Объявите переменную width для хранения ширины прямоугольника",
                "Объявите переменную area для хранения результата - площади прямоугольника"
        );
        appendTaskDesc("Получите данные от пользователя");
        appendOrdered(
                "Выведите на экран строковый литерал \"Задача 1976\"",
                "Выведите на экран строковый литерал \"Введите высоту прямоугольника\".",
                "Инициализируйте переменную temp - получите от пользователя строку и запишите ее в temp.",
                "Инициализируйте переменную height - запишите в нее результат преобразования temp в число.",
                "Выведите на экран строковый литерал \"Введите ширину прямоугольника\".",
                "Получите от пользователя строку и запишите ее в temp.",
                "Инициализируйте переменную width - запишите в нее результат преобразования temp в число."
        );
        appendTaskDesc("Вычислите результат и оформите ответ");
        appendOrdered(
                "Инициализируйте переменную area - умножьте переменную height на width и запишите результат в area.",
                "Выведите на экран текст по шаблону \"Площадь прямоугольника со сторонами $height и $width равна $area\""
        );
        appendSubheading("Убедитесь, что для всех исходных данных получается ожидаемый результат.");
        appendCheckValuesHeader("height", "width");
        appendCheckValuesRow("3", "5");
        appendCheckValuesRow("11", "19");
        appendCheckValuesRow("2", "23");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String temp;
        int height;
        int width;
        int area;
        System.out.println("Задача 1976");
        System.out.println("Введите высоту прямоугольника");
        temp = firstValue;
        height = Integer.parseInt(temp);
        System.out.println("Введите ширину прямоугольника");
        temp = secondValue;
        width = Integer.parseInt(temp);
        area = height * width;
        System.out.printf("Площадь прямоугольника со сторонами %d и %d равна %d", height, width, area);
    }
}
