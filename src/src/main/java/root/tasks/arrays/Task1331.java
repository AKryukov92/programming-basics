package root.tasks.arrays;

import root.tasks.ThreeInputValLayout;

public class Task1331 extends ThreeInputValLayout {

    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        String[] arr = firstValue.split(",");
        int index = Integer.parseInt(secondValue);
        if (index < 0 || arr.length <= index) {
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        arr[index] = thirdValue;
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - строки, разделенные запятой, число - индекс массива и еще одну строку. " +
                "Нужно записать полученную строку в массив по указанному индексу и вывести все элементы массива по возрастанию индекса. " +
                "Эту задачу можно решить с помощью условия, вложенного в цикл вывода. " +
                "Но будет полезнее решить именно с помощью записи значения в массив данных. " +
                "Цикл вывода элементов должен быть простым: все подряд элементы начиная с 0 и до конца массива.");
        appendCheckValuesHeader("data", "index", "value");
        appendCheckValuesRow("q,w,e,r,t,y", "3", "third");
        appendCheckValuesRow("q,w,e,r,t,y", "0", "initial");
        appendCheckValuesRow("q,w,e,r,t,y", "5", "fifth");
        appendCheckValuesRow("as,df,gh,jk", "0", "initial");
        appendCheckValuesRow("qwe,asd,zxc", "2", "second");
        appendCheckValuesRow("q,w,e,r,t,y", "6", "large");
        appendCheckValuesRow("q,w,e,r,t,y", "-10", "negative");
        appendCheckValuesRow("q,w,e,r,t,y", "100", "large");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1331().getContent());
    }
}
