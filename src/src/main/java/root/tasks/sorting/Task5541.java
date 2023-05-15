package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task5541 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами. Создать новый массив и записать в него элементы первого массива без дубликатов.");
        appendOrderedNonEscaped(
                "Отсортируйте массив по возрастанию",
                "Просмотрите элементы массива, если следующий не равен текущему, то увеличьте значение счетчика.",
                "Создайте новый массив с длиной, равной полученному счетчику.",
                "Просмотрите элементы массива повторно. Если следующий не равен текущему, то запишите этот элемент в новый массив."
        );
        appendCheckValuesHeader("numbers");
        appendCheckValuesRow("9 8 7 6");
        appendCheckValuesRow("9 9 7 7");
        appendCheckValuesRow("9 2 7 5");
        appendCheckValuesRow("");
        appendCheckValuesRow("9 1 8 100 8 21 50 9 1");
        appendCheckValuesRow("4 4 4 4");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String raw) {
        if (raw.length() == 0) {
            System.out.println("Массив пуст");
            return;
        }
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length - 1; j++) {
            int minIdx = j;
            for (int i = j + 1; i < num.length; i++) {
                if (num[minIdx] > num[i]) {
                    minIdx = i;
                }
            }
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        int count = 1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                count++;
            }
        }
        System.out.println("Количество различных значений " + count);
        int[] distinct = new int[count];
        int di = 1;
        System.out.printf("Записываю %d на индекс %d массива различных\n", num[0], 0);
        distinct[0] = num[0];
        for (int i = 0; i < num.length - 1; i++) {
            System.out.printf("Сравниваю %d и %d\n", num[i], num[i + 1]);
            if (num[i] != num[i+1]) {
                System.out.printf("Записываю %d на индекс %d массива различных\n", num[i+1], di);
                distinct[di] = num[i+1];
                di++;
            }
        }
        System.out.println("Массив различных:");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5541());
    }
}
