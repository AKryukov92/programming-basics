package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task8428 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendNonEscaped("Какое название лучше выбрать для переменной? Эта проблема подробно рассмотрена в главе 11.1 \"Общие принципы выбора имен переменных\" части III книги \"Совершенный код\". <a href=\"Stiv_Makkonnell_-_Sovershenny_kod_2-e_izdanie.pdf#page=274\" target=\"_blank\">(открыть в новой вкладке)</a>");
        appendTaskDesc("Обычно в шапке таблицы с тестовыми данными у вводимых значений будут указаны предпочтительные имена. Как правило это существительные английского языка, которые упоминались на русском языке при постановке задачи. Заведите словарик и записывайте в него все новые слова и их перевод. На английском языке проще найти помощь и ответы на сложные вопросы. Все технологии и инструменты программирования публикуют информацию о себе на английском языке. Расширяйте свой словарный запас!");
        appendTaskHeader();
        appendNonEscaped("Перевести угол из градусов в радианы по формуле: <formula>angleRadian=angleDegree*&pi;/180</formula>, где angleDegree - угол в градусах(degrees), angleRadian - угол в радианах. <a href=\"https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D0%B4%D0%B8%D0%B0%D0%BD\" target=\"_blank\">Радиан</a> - угол, соответствующий дуге, длина которой равна её радиусу. Единица измерения плоских углов в Международной системе единиц (СИ).");
        appendCheckValuesHeader("angleDegree", "angleRadian");
        appendCheckValuesRow("45");
        appendCheckValuesRow("1125");
        appendCheckValuesRow("0");
        appendCheckValuesRow("360");
        appendCheckValuesRow("90");
        appendCheckValuesRow("2000");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double angleDegree = Double.parseDouble(value);
        double angleRadian = angleDegree * Math.PI / 180;
        System.out.printf("%.0f градусов это %.4f радиан", angleDegree, angleRadian);
    }
}
