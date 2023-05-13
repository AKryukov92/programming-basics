package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task9213 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано два массива одинаковой длины: с числами и с фрагментами строк. Для всех элементов массива чисел, которые меньше 50, нужно вывести элементы из массива фрагментов с равным индексом.");
        appendCheckValuesHeader("numbers", "fragments");
        appendCheckValuesRow("0,10,20,100,200", "as,df,gh,jk,kl");
        appendCheckValuesRow("1000,200,50", "qwer,asdf,zxcv");
        appendCheckValuesRow("51,52,53,54", "q,q,q,q");
        appendCheckValuesRow("30,60,20,70", "thirty,sixty,twenty,seventy");
        appendCheckValuesRow("1,2,3", "one,two,three,four");
        appendCheckValuesRow("100,200,300", "one hundred,two hundreds");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split(",");
        String[] frags = secondValue.split(",");
        int i = 0;
        while (i < arr.length) {
            int num = Integer.parseInt(arr[i]);
            if (num < 50) {
                System.out.println("Число " + num + " меньше 50 и ему соответствует фрагмент " + frags[i]);
            }
            i++;
        }
    }
}
