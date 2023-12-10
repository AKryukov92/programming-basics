package root.tasks.arrays;

public class TaskJava3791 extends TaskCs3791 {

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
        appendTaskDescEscaped("Чтобы проверить совпадение двух фрагментов текста в Java нужно применить метод equals.");
        appendCheckSingleNonEscaped("if (arr[0].equals(arr[1]) {\n" +
                "    System.out.println(\"Первая пара\");\n" +
                "}");
        appendFooter();
    }
}
