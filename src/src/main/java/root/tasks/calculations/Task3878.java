package root.tasks.calculations;

import root.tasks.MultipleInputValLayout;

import java.sql.SQLException;

public class Task3878 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дана точка с координатами (X<sub>т</sub>;Y<sub>т</sub>) и прямая, проходящая через точки (X<sub>п1</sub>;Y<sub>п1</sub>) (X<sub>п2</sub>;Y<sub>п2</sub>). Точка принадлежит прямой, если истинно выражение:\n" +
                "<formula><fraction><numerator>X<sub>т</sub>-X<sub>п1</sub></numerator><denominator>X<sub>п2</sub> - X<sub>п1</sub></denominator></fraction> = <fraction><numerator>Y<sub>т</sub> - Y<sub>п1</sub></numerator><denominator>Y<sub>п2</sub> - Y<sub>п1</sub></denominator></fraction></formula> Вывести на экран сообщение: \"Точка принадлежит прямой\" или \"Точка не принадлежит прямой\".");
        appendCheckValuesHeader("Xт", "Yт", "Xп1", "Yп1", "Xп2", "Yп2");
        appendCheckValuesRow("2", "2", "1", "1", "3", "3");
        appendCheckValuesRow("1", "3", "0", "0", "2", "6");
        appendCheckValuesRow("0", "0", "1", "1", "2", "2");
        appendCheckValuesRow("0", "1", "1", "1", "2", "2");
        appendCheckValuesRow("1", "1", "1", "1", "2", "2");
        appendCheckValuesRow("2", "2", "0", "4", "4", "0");
        appendCheckValuesRow("-1", "1", "1", "1", "2", "2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        int xt = Integer.parseInt(args[0]);
        int yt = Integer.parseInt(args[1]);
        int xp1 = Integer.parseInt(args[2]);
        int yp1 = Integer.parseInt(args[3]);
        int xp2 = Integer.parseInt(args[4]);
        int yp2 = Integer.parseInt(args[5]);
        if ((xt - xp1) / (xp2 - xp1) == (yt - yp1) / (yp2 - yp1)) {
            System.out.println("Точка принадлежит прямой");
        } else {
            System.out.println("Точка не принадлежит прямой");
        }
    }
}
