package root.tasks.filltemplate;

import root.tasks.MultipleInputValLayout;

public class Task2632 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        String cx = args[0];
        String cy = args[1];
        String r = args[2];
        String fill = args[3];
        System.out.printf("&lt;circle cx=\"%s\" cy=\"%s\" r=\"%s\" fill=\"%s\"/&gt;", cx, cy, r, fill);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями.");
        appendCheckSingle("&lt;circle cx=\"$CX\" cy=\"$CY\" r=\"$R\" fill=\"$FILL\"/&gt;");
        appendCheckValuesHeader("cx", "cy", "r", "fill");
        appendCheckValuesRow("50", "50", "40", "yellow");
        appendCheckValuesRow("400", "300", "200", "green");
        appendCheckValuesRow("254", "356", "100", "#cc6600");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2632().getContent());
    }
}
