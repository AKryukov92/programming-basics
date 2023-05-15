package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task3845 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Смоделируйте работу стека");
        appendTaskDescEscaped("Пользователь вводит слова 'push' и 'pop'. Если пользователь ввел 'push', то дополнительно вводит еще одно значение. Это значение нужно записать в массив. Самое первое значение записывается на индекс 0. С каждым введенным элементом, индекс записи увеличивается на 1. Если пользователь ввел 'pop', то индекс записи уменьшается на 1. При попытке записи элемента на индекс 5, напишите 'ПЕРЕПОЛНЕНИЕ' и завершите работу программы. После каждого действия нужно вывести все элементы массива в строчку.");
        appendCheckValuesHeader();
        appendCheckValuesRow("push,q,push,w,pop,pop,push,e,push,r,push,t,pop,pop,pop".split(","));
        appendCheckValuesRow("push,a,push,s,pop,push,d,push,f".split(","));
        appendCheckValuesRow("push,qa,push,ws,push,ed,push,rf,push,tg,pop,push,yh,pop,push,uj".split(","));
        appendCheckValuesRow("push,q,push,w,push,e,push,r,push,t,push,y".split(","));
        appendCheckValuesRow("push,q,push,w,push,e,push,r,push,t,pop,push,y,push,u".split(","));
        appendCheckValuesRow("pop");
        appendCheckValuesRow("push,z,pop,pop".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        String[] arr = new String[10];
        int index = 0;
        while (source.hasNext()) {
            String cmd = source.next();
            if (cmd.equals("push") && index == 5) {
                System.out.println("ПЕРЕПОЛНЕНИЕ");
                return;
            }
            if (cmd.equals("push")) {
                String value = source.next();
                arr[index] = value;
                System.out.println("На индекс " + index + " был записан элемент со значением " + arr[index]);
                index++;
            } else if (cmd.equals("pop")) {
                if (index <= 0) {
                    System.out.println("Массив пуст");
                    return;
                }
                index--;
                System.out.println("Извлечен элемент со значением " + arr[index] + " на индексе " + index);
            }
            System.out.println("Индекс записи: " + index);
            int i = 0;
            while(i < index) {
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3845());
    }
}
