package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task9576 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные символом \";\"(точка с запятой). Эти числа взяты из возрастающей последовательности с шагом 1. Вывести на экран недостающие значения. Если исходные данные нарушают последовательность, вывести сообщение об ошибке. Если в исходных данных есть дубликаты, вывести сообщение об ошибке.");
        appendCheckValuesHeader("");
        appendCheckValuesRow("1;3;6;9;10");
        appendCheckValuesRow("13;19");
        appendCheckValuesRow("2;3;3;3;3;4");
        appendCheckValuesRow("100;100;200");
        appendCheckValuesRow("1;2;3;2;1");
        appendCheckValuesRow("1000;3;20;-15");
        appendCheckValuesRow("1;5;9");
        appendCheckValuesRow("20;21;22;23;24");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String data) {
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(";");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("Проверяю корректность данных");
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] > num[i]) {
                System.out.println("Последовательность в исходных данных нарушена. Число " + num[i - 1] + " больше чем " + num[i]);
                return;
            }
            if (num[i - 1] == num[i]) {
                System.out.println("В исходных данных присутствуют дубликаты. Числа на индексах " + (i - 1) + " и " + i + " совпадают");
                return;
            }
        }
        System.out.println("Данные корректны");
        for (int i = 1; i < num.length; i++) {
            if (num[i - 1] + 1 < num[i]) {
                System.out.println("Разрыв после числа на индексе " + (i - 1));
                int j = num[i - 1] + 1;
                while (j < num[i]) {
                    System.out.print(j + ";");
                    j++;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(new Task9576());
    }
}
