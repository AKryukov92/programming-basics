package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task7369 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных. Сравнить содержимое двух массивов и вывести результат в виде таблицы. Значения первого массива - заголовки колонок. Значения второго массива - заголовки строк. Если заголовок колонки совпадает с заголовком строки, то в ячейке нужно поставить плюс. В ином случае нужно поставить точку.");
        appendCheckValuesHeader("top", "left");
        appendCheckValuesRow("q,a,z,w,s,x", "q,w,e");
        appendCheckValuesRow("e,d,c", "a,s,d,f,g,h,j");
        appendCheckValuesRow("q,a,z", "q,a,z,q,s,q,z");
        appendCheckValuesRow("a,a,a", "a,a,a,a,a");
        appendCheckValuesRow("r,f,v", "");
        appendCheckValuesRow("", "z,x,c,v");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String leftRaw, String topRaw) {
        if (leftRaw.isEmpty()) {
            System.out.println("Данные слева отсутствуют");
            return;
        }
        if (topRaw.isEmpty()) {
            System.out.println("Данные сверху отсутствуют");
            return;
        }
        String[] leftArr = leftRaw.split(",");
        String[] topArr = topRaw.split(",");
        System.out.print(" ");
        for (int i = 0; i < topArr.length;i++) {
            System.out.print(topArr[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < leftArr.length; i++) {
            System.out.print(leftArr[i]);
            for (int j = 0; j < topArr.length; j++) {
                if (leftArr[i].equals(topArr[j])) {
                    System.out.print("+");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("|\n");
        }
        System.out.print(" ");
        for (int i = 0; i < topArr.length; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7369());
    }
}
