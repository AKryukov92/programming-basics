package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task6707 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Нет данных");
            return;
        }
        String[] arr = value.split(",");
        int[] num = new int[arr.length];
        int i = 0;
        while (i < num.length) {
            num[i] = Integer.parseInt(arr[i]);
            i = i + 1;
        }
        i = 0;
        while (i < num.length) {
            if (i + 1 < num.length) {
                int sum = num[i] + num[i + 1];
                System.out.println("Сумма элементов " + num[i] + " и " + num[i + 1] + " равна " + sum);
            } else {
                System.out.println("У элемента " + num[i] + " нет пары");
            }
            i = i + 2;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - числа, разделенные запятой. Для каждой пары чисел подряд вычислить сумму. Если у числа нет пары, просто вывести его значение.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("9,8,7,6,5,4,3");
        appendCheckValuesRow("14,25,36,74,85");
        appendCheckValuesRow("741,852,963,123");
        appendCheckValuesRow("8426,7139");
        appendCheckValuesRow("75391,84562");
        appendCheckValuesRow("");
        appendCheckValuesRow("7618349");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task6707().getContent());
    }
}
