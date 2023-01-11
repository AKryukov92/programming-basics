package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task5279 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число N. Если N меньше 0, нужно вывести соощение об ошибке. Затем пользователь вводит еще N штук чисел. Для каждого числа вывести предыдущее число, а также то что было перед предыдущим. Число N в этой логике не участвует.");
        appendCheckValuesHeader();
        appendCheckValuesRow(
                "5",
                "9",
                "8",
                "7",
                "6",
                "5"
        );
        appendCheckValuesRow(
                "4",
                "71",
                "63",
                "52",
                "49"
        );
        appendCheckValuesRow(
                "4",
                "10",
                "9",
                "8",
                "7",
                "6",
                "5"
        );
        appendCheckValuesRow(
                "3",
                "17",
                "13",
                "11"
        );
        appendCheckValuesRow(
                "2",
                "100",
                "1000"
        );
        appendCheckValuesRow("1", "777");
        appendCheckValuesRow("0", "");
        appendCheckValuesRow("-2", "");
        appendCheckValuesRow("-20", "");
        appendCheckValuesRow(
                "10",
                "14",
                "-48",
                "27",
                "11",
                "-34",
                "-46",
                "5",
                "-43",
                "44",
                "-50"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int n = Integer.parseInt(source.next());
        System.out.println("Значение N равно " + n);
        if (n < 0) {
            System.out.println("Значение N должно быть больше 0.");
        }
        if (n == 0) {
            System.out.println("Итоговая сумма равна 0");
        }
        if (n > 0) {
            String current = source.next();
            System.out.println("Текущее значение " + current + " предыдущее отсутствует. Число перед предыдущим отсутствует.");
            if (n > 1) {
                String prev = current;
                current = source.next();
                System.out.println("Текущее значение " + current + " предыдущее " + prev + ". Число перед предыдущим отсутствует.");
                int i = 2;
                while (i < n) {
                    String n2 = prev;
                    prev = current;
                    current = source.next();
                    System.out.println("Текущее значение " + current + " предыдущее " + prev + ". Число перед предыдущим " + n2);
                    i = i + 1;
                }
            }
        }
    }
}
