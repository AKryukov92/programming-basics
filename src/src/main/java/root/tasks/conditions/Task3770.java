package root.tasks.conditions;

import root.tasks.MultipleInputValLayout;

public class Task3770 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны действительные числа x, y, z. Вывести на экран значение наибольшего из них.");
        appendCheckValuesHeader("X", "Y", "Z");
        appendCheckValuesRow("1", "2", "3");
        appendCheckValuesRow("100", "215", "478");
        appendCheckValuesRow("7", "4", "-2");
        appendCheckValuesRow("-2", "-1", "0");
        appendCheckValuesRow("0", "5", "-7");
        appendCheckValuesRow("43", "99", "21");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (x > y && x > z) {
            System.out.println("Наибольшее число это X со значением " + x);
        }
        if (y > x && y > z){
            System.out.println("Наибольшее число это Y со значением " + y);
        }
        if (z > x && z > y) {
            System.out.println("Наибольшее число это Z со значением " + z);
        }
    }
}
