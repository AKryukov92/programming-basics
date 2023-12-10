package root.tasks.combinations;

import root.tasks.OneInputValLayout;

public class Task3095 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - фрагменты строк, разделенные запятой. Напечатать на экран все комбинации с перестановками из двух элементов массива. Комбинации содержащие два одинаковых элемента нужно исключить.");
        appendCheckValuesHeader("values");
        appendCheckValuesRow("q,w,e,r");
        appendCheckValuesRow("as,df,gh");
        appendCheckValuesRow("zx,cv");
        appendCheckValuesRow("p,o,o,t,p");
        appendCheckValuesRow("single");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Нет данных");
        }
        if (!value.isEmpty()) {
            String[] arr = value.split(",");
            int i1 = 0;
            while (i1 < arr.length) {
                int i2 = 0;
                while (i2 < arr.length) {
                    if (!arr[i1].equals(arr[i2])) {
                        System.out.println(arr[i1] + " " + arr[i2]);
                    }
                    i2 = i2 + 1;
                }
                i1 = i1 + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3095());
    }
}
