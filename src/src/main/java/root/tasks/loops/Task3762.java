package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task3762 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        System.out.println("фунт\tграмм");
        int limit = Integer.parseInt(value);
        int i = 1;
        while (i <= limit) {
            System.out.println(i + "\t" + (i * 453));
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Напечатать таблицу соответствия между весом в фунтах и весом в граммах для значений 1,2, ..., 20 фунтов (1 фунт = 453г). Над каждым столбцом написать единицу измерения: \"грамм\" или \"фунт\".");
        appendCheckSingle(wrapLogic("20"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task3762().getContent());
    }
}
