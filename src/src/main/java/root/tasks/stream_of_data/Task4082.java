package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task4082 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Прием данных прекращается, когда введенное число попадает в интервал от 83 до 199, исключая границы. Определить количество чисел, которые на числовом ряду находятся слева и справа от данного интервала. Вывести в отформатированном виде.");
        appendCheckValuesHeader();
        appendCheckValuesRow("10;20;100".split(";"));
        appendCheckValuesRow("10;200;30;400;80;1000;100".split(";"));
        appendCheckValuesRow("300;400;100".split(";"));
        appendCheckValuesRow("1000;1000;83;150".split(";"));
        appendCheckValuesRow("1;1;1;1;1;1;1;1;199;90".split(";"));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        int current = Integer.parseInt(source.next());
        int leftCnt = 0;
        int rightCnt = 0;
        while (current < 83 || 199 < current) {
            if (current < 83) {
                leftCnt++;
            }
            if (199 < current) {
                rightCnt++;
            }
            System.out.println("Количество слева: " + leftCnt + ", количество справа: " + rightCnt);
            current = Integer.parseInt(source.next());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4082());
    }
}
