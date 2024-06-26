package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task7834 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные символом \",\"(запятая). Вывести на экран элементы на индексах 0, 2, 3, 5 в столбик. Если длина массива слишком маленькая, чтобы содержать нужный индекс, нужно напечатать сообщение \"нет элемента на индексе X\".");
        appendCheckValuesHeader("arr");
        appendCheckValuesRow("a,s,d,f,g,h,j,k");
        appendCheckValuesRow("q,w,e,r,t,y,u");
        appendCheckValuesRow("q,w,e,r,t,y");
        appendCheckValuesRow("qa,ws,ed,rf,tg");
        appendCheckValuesRow("za,xs,cd,vf");
        appendCheckValuesRow("qaz,wsx,edc");
        appendCheckValuesRow("qwerty,asdfg");
        appendCheckValuesRow("zxcvbnm");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!value.isEmpty()) {
            String[] arr = value.split(",");
            System.out.println("В массиве длиной " + arr.length);
            System.out.println("Значение элемента на индексе 0 это " + arr[0]);
            if (arr.length <= 2) {
                System.out.println("Нет элемента на индексе 2");
            }
            if (2 < arr.length) {
                System.out.println("Значение элемента на индексе 2 это " + arr[2]);
            }
            if (arr.length <= 3) {
                System.out.println("Нет элемента на индексе 3");
            }
            if (3 < arr.length) {
                System.out.println("Значение элемента на индексе 3 это " + arr[3]);
            }
            if (arr.length <= 5) {
                System.out.println("Нет элемента на индексе 5");
            }
            if (5 < arr.length) {
                System.out.println("Значение элемента на индексе 5 это " + arr[5]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7834().getContent());
    }
}
