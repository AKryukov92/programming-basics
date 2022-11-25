package root.tasks.stream_of_data;

import root.tasks.TwoInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task2368 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число N. Если N меньше 0, нужно вывести соощение об ошибке. Затем пользователь вводит еще N штук чисел. Вычислить сумму введенных чисел. Программа должна вывести сумму и завершиться самостоятельно.");
        appendCheckValuesHeader("N", "data");
        appendCheckValuesRow("3", "3<br>" +
                "-15<br>" +
                "0"
        );
        appendCheckValuesRow("1", "1000");
        appendCheckValuesRow("5", "-13<br>" +
                "12<br>" +
                "13<br>" +
                "7<br>" +
                "3"
        );
        appendCheckValuesRow("0", "");
        appendCheckValuesRow("8", "-7<br>" +
                "-5<br>" +
                "-13<br>" +
                "12<br>" +
                "0<br>" +
                "-5<br>" +
                "10<br>" +
                "-6<br>" +
                "5"
        );
        appendCheckValuesRow("-3", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int n = Integer.parseInt(firstValue);
        if (n < 0) {
            System.out.println("Значение N должно быть больше 0.");
        }
        if (n == 0) {
            System.out.println("Итоговая сумма равна 0");
        }
        if (n > 0) {
            String[] arr = secondValue.split("<br>");
            Iterator<String> itr = Arrays.stream(arr).iterator();
            int sum = 0;
            while (itr.hasNext()) {
                String current = itr.next();
                int x = Integer.parseInt(current);
                sum += x;
            }
            System.out.println("Итоговая сумма равна " + sum);
        }
    }
}