package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task7621 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Нет элемента на индексе 0");
            System.out.println("Нет элемента на индексе 1");
            System.out.println("Нет элемента на индексе 3");
            System.out.println("Нет элемента на индексе 4");
        } else {
            String[] arr = value.split(" ");
            int sum = 0;
            if (arr.length > 0) {
                System.out.println("Значение элемента на индексе 0 это " + arr[0]);
                int at0 = Integer.parseInt(arr[0]);
                sum = sum + at0;
                System.out.println("Промежуточный итог: " + sum);
            } else {
                System.out.println("Нет элемента на индексе 0");
            }
            if (arr.length > 1) {
                System.out.println("Значение элемента на индексе 1 это " + arr[1]);
                int at1 = Integer.parseInt(arr[1]);
                sum = sum + at1;
                System.out.println("Промежуточный итог: " + sum);
            } else {
                System.out.println("Нет элемента на индексе 1");
            }
            if (arr.length > 3) {
                System.out.println("Значение элемента на индексе 3 это " + arr[3]);
                int at3 = Integer.parseInt(arr[3]);
                sum = sum + at3;
                System.out.println("Промежуточный итог: " + sum);
            } else {
                System.out.println("Нет элемента на индексе 3");
            }
            if (arr.length > 4) {
                System.out.println("Значение элемента на индексе 4 это " + arr[4]);
                int at4 = Integer.parseInt(arr[4]);
                sum = sum + at4;
                System.out.println("Промежуточный итог: " + sum);
            } else {
                System.out.println("Нет элемента на индексе 4");
            }
            System.out.println("Финальный итог: " + sum);
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - числа, разделенные пробелом. Вычислить сумму элементов на индексах 0, 1, 3, 4. Если элемент отсутствует, то вывести сообщение \"Нет элемента на индексе X\"");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("1 2 3 4 5 6");
        appendCheckValuesRow("12 34 56 78 90");
        appendCheckValuesRow("123 234 345 456");
        appendCheckValuesRow("9876 5432 1987");
        appendCheckValuesRow("77777 44444");
        appendCheckValuesRow("987654");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7621().getContent());
    }
}
