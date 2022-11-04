package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task9298 extends OneInputValLayout {

    @Override
    protected void logic(String value) {
        int edge = Integer.parseInt(value);
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        }
        if (edge > 0) {
            int result = 6 * edge * edge;
            System.out.print(result);
        }
    }

    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDesc("Основное внимание в этой лабораторной уделено одной из техник защитного программирования - выводу сообщений об ошибке. Более подробно о них можно почитать в главе 8 части II книги \"Совершенный код\" <a href=\"Stiv_Makkonnell_-_Sovershenny_kod_2-e_izdanie.pdf#page=205\" target=\"_blank\">(открыть в новой вкладке)</a>.");
        appendTaskHeader();
        appendTaskDesc("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendCheckValuesHeader("edge");
        appendCheckValuesRow("1");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();
        appendFooter();
    }
}
