package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task8471 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив фрагментов текста. Элементы массива на нечетных индексах поставить в начало, а на четных - вслед за ними. Элементы на четных индексах должны следовать друг за другом так же как и в исходном массиве. Элементы на нечетных индексах - тоже.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("qw er ty ui op");
        appendCheckValuesRow("a sd fgh jkl");
        appendCheckValuesRow("za qws xcde r fv tgb yhnu jm");
        appendCheckValuesRow("");
        appendCheckValuesRow("p o i u a s d f");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()){
            System.out.println("отсутствуют исходные данные");
            return;
        }
        String[] arr = value.split(" ");
        int amountOfOdd = arr.length / 2;
        System.out.println("Количество элементов на нечетных индексах: " + amountOfOdd);
        String[] odd = new String[arr.length - amountOfOdd];
        int i = 0;
        int j = 0;
        System.out.println("Элементы на четных индексах:");
        while (i < arr.length) {
            odd[j] = arr[i];
            System.out.print(arr[i] + " ");
            j = j + 1;
            i = i + 2;
        }
        i = 1;
        j = 0;
        System.out.println("\nЭлементы на нечетных индексах");
        while (i < arr.length) {
            arr[j] = arr[i];
            System.out.print(arr[i] + " ");
            i = i + 2;
            j = j + 1;
        }
        i = 0;
        while (i < odd.length) {
            arr[j] = odd[i];
            j = j + 1;
            i = i + 1;
        }
        System.out.println("\nРезультат:\n" + String.join(" ", arr));
    }

    public static void main(String[] args) {
        System.out.println(new Task8471());
    }
}
