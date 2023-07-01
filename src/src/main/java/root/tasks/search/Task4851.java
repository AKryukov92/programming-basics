package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task4851 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        //нужно чтобы потом делать метод на эту задачу, который возвращает массив
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив символов, разделенных запятыми. Первой строчкой результата вывести содержимое массива. Второй строчкой результата вывести индексы, на которых было найден символ \"q\".");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("a,s,d,hf,g,h");
        appendCheckValuesRow("x,q,cc,v,b,tg,hi");
        appendCheckValuesRow("w,e,q,e,q,sd,q");
        appendCheckValuesRow("q,q,q,q");
        appendCheckValuesRow("");
        appendCheckValuesRow("okt,p,aaaa,q");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if(value.isEmpty()){
            System.out.println("Нет данных");
            return;
        }
        String[] arr = value.split(",");
        int i = 0;
        int cnt = 0;
        while (i < arr.length) {
            if (arr[i].equals("q")){
                cnt++;
            }
            i++;
        }
        System.out.println("Количество символов " + cnt);
        if (cnt > 0) {
            int[] indexes = new int[cnt];
            i = 0;
            int j = 0;
            while (i < arr.length) {
                if (arr[i].equals("q")) {
                    indexes[j] = i;
                    j++;
                }
                i++;
            }
            j = 0;
            System.out.println("Их индексы");
            while (j < indexes.length) {
                System.out.print(indexes[j] + " ");
                j++;
            }
        } else {
            System.out.println("Элементы равные q не найдены");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4851());
    }
}
