package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task4338 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран два столбика чисел от A до B включительно. Значение A может быть как меньше, так и больше B. Числа в левом столбике должны располагаться по возрастанию. Числа в правом столбике - по убыванию. В конце программы выведите количество напечатанных строк.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("3", "11");
        appendCheckValuesRow("587", "613");
        appendCheckValuesRow("50", "41");
        appendCheckValuesRow("1000", "1000");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b= Integer.parseInt(secondValue);
        int begin, end;
        if (a < b){
            begin = a;
            end = b;
        } else {
            begin = b;
            end = a;
        }
        int i = begin, j = end;
        while(i <= end){
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4338());
    }
}
