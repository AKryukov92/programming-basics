package root.tasks.filltemplate;

import root.tasks.ThreeInputValLayout;

public class Task7474 extends ThreeInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $A, $B, $C на введенные значения a, b, c соответственно.");
        appendCheckSingle("Квадратное уравнение $A*x*x + $B*x + $C = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = $B*$B - 4*$A*$C");
        appendCheckValuesHeader("a","b","c");
        appendCheckValuesRow("1", "2", "3");
        appendCheckValuesRow("-3", "0", "2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String a, String b, String c) {
        System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s", a, b, c, b, b, a, c);
    }

    public static void main(String[] args) {
        System.out.println(new Task7474());
    }
}
