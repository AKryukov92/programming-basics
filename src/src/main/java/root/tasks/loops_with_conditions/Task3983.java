package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task3983 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите N символов \"#\" в несколько строчек. Не более 20 штук в строке.");
        appendCheckValuesHeader("N");
        appendCheckValuesRow("5");
        appendCheckValuesRow("23");
        appendCheckValuesRow("51");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-7");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int n = Integer.parseInt(value);
        if (n < 0){
            System.out.println("Значение N должно быть неотрицательным");
        }
        int i = 1;
        while (i <= n){
            System.out.print("#");
            if (i%20 == 0){
                System.out.println();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3983());
    }
}
