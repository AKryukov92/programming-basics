package root.tasks.stream_of_data;

import root.tasks.TwoInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task5279 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число N. Если N меньше 0, нужно вывести соощение об ошибке. Затем пользователь вводит еще N штук чисел. Для каждого числа вывести предыдущее число, а также то что было перед предыдущим.");
        appendCheckValuesHeader("N", "stream");
        appendCheckValuesRow("5", "9<br>" +
                "8<br>" +
                "7<br>" +
                "6<br>" +
                "5"
        );
        appendCheckValuesRow("4", "71<br>" +
                "63<br>" +
                "52<br>" +
                "49"
        );
        appendCheckValuesRow("3", "17<br>" +
                "13<br>" +
                "11"
        );
        appendCheckValuesRow("2", "100<br>" +
                "1000"
        );
        appendCheckValuesRow("1", "777");
        appendCheckValuesRow("0", "");
        appendCheckValuesRow("-2", "");
        appendCheckValuesRow("-20", "");
        appendCheckValuesRow("10", "14<br>" +
                "-48<br>" +
                "27<br>" +
                "11<br>" +
                "-34<br>" +
                "-46<br>" +
                "5<br>" +
                "-43<br>" +
                "44<br>" +
                "-50");
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
            String current = itr.next();
            System.out.println("Текущее значение " + current + " предыдущее отсутствует. Число перед предыдущим отсутствует.");
            if (n > 1) {
                String prev = current;
                current = itr.next();
                System.out.println("Текущее значение " + current + " предыдущее " + prev + ". Число перед предыдущим отсутствует.");
                int i = 2;
                while (i < n) {
                    String n2 = prev;
                    prev = current;
                    current = itr.next();
                    System.out.println("Текущее значение " + current + " предыдущее " + prev + ". Число перед предыдущим " + n2);
                    i = i + 1;
                }
            }
        }
    }
}
