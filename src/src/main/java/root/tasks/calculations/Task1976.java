package root.tasks.calculations;

import root.tasks.StreamInputLayout;
import root.tasks.TwoInputValLayout;

import java.util.Scanner;

public class Task1976 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Переведите алгоритм с естественного языка на ваш язык программирования.");
        appendTaskDescEscaped("Объявите переменные");
        appendOrderedNonEscaped(
                "Объявите переменную height для хранения высоты прямоугольника",
                "Объявите переменную width для хранения ширины прямоугольника",
                "Объявите переменную area для хранения результата - площади прямоугольника"
        );
        appendTaskDescEscaped("Получите данные от пользователя");
        appendOrderedNonEscaped(
                "Выведите на экран строковый литерал \"Задача 1976\"",
                "Выведите на экран строковый литерал \"Введите высоту прямоугольника\".",
                "Инициализируйте переменную height - получите от пользователя число и запишите его в height.",
                "Выведите на экран строковый литерал \"Введите ширину прямоугольника\".",
                "Получите от пользователя число и запишите его в width."
        );
        appendTaskDescEscaped("Вычислите результат и оформите ответ");
        appendOrderedNonEscaped(
                "Инициализируйте переменную area - умножьте переменную height на width и запишите результат в area.",
                "Выведите на экран текст по шаблону \"Площадь прямоугольника со сторонами $height и $width равна $area\""
        );
        appendSubheading("Убедитесь, что для всех исходных данных получается ожидаемый результат.");
        appendCheckValuesHeader();
        appendCheckValuesRow("3", "5");
        appendCheckValuesRow("11", "19");
        appendCheckValuesRow("2", "23");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        double height;
        double width;
        double area;
        System.out.println("Задача 1976");
        System.out.println("Введите высоту прямоугольника");
        height = s.nextDouble();
        System.out.println("Введите ширину прямоугольника");
        width = s.nextDouble();
        area = height * width;
        System.out.printf("Площадь прямоугольника со сторонами %.4f и %.4f равна %.4f", height, width, area);
    }
}
