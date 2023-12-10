package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class TaskCs3791 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        if (arr.length != 4) {
            System.out.println("В исходных данных должно быть ровно 4 элемента. Обнаружено " + arr.length);
            return;
        }
        if (arr[0].equals(arr[1])) {
            System.out.println("Первая пара");
        }
        if (arr[1].equals(arr[2])) {
            System.out.println("Середина");
        }
        if (arr[2].equals(arr[3])) {
            System.out.println("Третья пара");
        }
        if (arr[0].equals(arr[3])) {
            System.out.println("Границы");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами." +
                " Если массив длиннее 4 элементов или короче 4 элементов, вывести сообщение об ошибке." +
                " Если в массиве совпадает первый и второй элемент, написать \"Первая пара\"." +
                " Если в массиве совпадает второй и третий элемент, написать \"Середина\"." +
                " Если в массиве совпадает третий и четвертый элемент, написать \"Третья пара\"." +
                " Если в массиве совпадает первый и четвертый элемент, написать \"Границы\"." +
                " Если проходит несколько проверок, писать несколько сообщений." +
                " Порядок сообщений может отличаться.");
        appendCheckValuesHeader("array");
        appendCheckValuesRow("aa,aa,aa,aa");
        appendCheckValuesRow("aa,aa,a,aaa");
        appendCheckValuesRow("aa,b,b,ccc");
        appendCheckValuesRow("z,x,ccc,ccc");
        appendCheckValuesRow("z,x,ccc,z");
        appendCheckValuesRow("qt,qt,w,w");
        appendCheckValuesRow("qt,qt,w,q");
        appendCheckValuesRow("t,y,y,y");
        appendCheckValuesRow("t,y,t,t");
        appendCheckValuesRow("n,n,m,n");
        appendCheckValuesRow("n,n,n,m");
        appendCheckValuesRow("aa,aa,aa,aa,aa");
        appendCheckValuesRow("aa,aa,aa");
        appendCheckValuesRow("p,o,p,o");
        appendCheckValuesRow("aa,s,d,f");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs3791().getContent());
    }
}
