package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task4312 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        double edge = Double.parseDouble(firstValue);
        double height = Double.parseDouble(secondValue);
        if (edge <= 0) {
            System.out.println("Длина основания треугольника должна быть положительна");
        }
        if (height <= 0) {
            System.out.println("Высота треугольника должна быть положительна");
        }
        if (edge > 0) {
            if (height > 0) {
                double area = edge * height / 2;
                System.out.printf("Площадь прямоугольного треугольника с высотой %.0f и основанием %.0f равна %.4f", height, edge, area);
            }
        }
    }

    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDescEscaped("Обычно в шапке таблицы с тестовыми данными у исходных данных будут указаны предпочтительные имена. Как правило это существительные английского языка, которые упоминались на русском языке при постановке задачи. Заведите словарик и записывайте в него все новые слова и их перевод. На английском языке проще найти помощь и ответы на сложные вопросы. Все технологии и инструменты программирования публикуют информацию о себе на английском языке. Расширяйте свой словарный запас!");
        appendTaskHeader();
        appendTaskDescNonEscaped("Вычислить площадь прямоугольного треугольника по формуле <formula>area=edge*height/2</formula>, где edge - основание, height - высота.");
        appendCheckValuesHeader("edge", "height");
        appendCheckValuesRow("1", "1");
        appendCheckValuesRow("2", "3");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("-2", "1");
        appendCheckValuesRow("3", "-4");
        appendCheckValuesRow("-5", "-7");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В этой задаче, корректные исходные данные нужно проверять двумя условиями. Длина основания должна быть положительна и одновременно высота должна быть положительна. Для оформления этой идеи в коде можно вкладывать одно условие внутри другого.");
        appendCheckSingleNonEscaped("if (edge > 0) {\n" +
                "    if (height > 0) {\n" +
                "        //вычисления и печать результата на экран\n" +
                "    }\n" +
                "}");
        appendFooter();
    }
}
