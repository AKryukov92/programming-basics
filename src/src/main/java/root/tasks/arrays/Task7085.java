package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task7085 extends TwoInputValLayout {
    @Override
    protected void logic(String data, String S) {

        String[] arr = data.split(" ");
        int s = Integer.parseInt(S);
        if (s <= 0 || arr.length <= s) {
            System.out.println("Количество позиций при сдвиге должно быть в интервале [0, длина массива)");
            return;
        }
        for (int j = 0; j < s; j++) {
            String t = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = t;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendCheckValuesHeader("data", "S");
        appendCheckValuesRow("q w e r t y", "1");
        appendCheckValuesRow("q w e r t y", "3");
        appendCheckValuesRow("a s d f", "2");
        appendCheckValuesRow("q w e r t y", "5");
        appendCheckValuesRow("a s d f", "3");
        appendCheckValuesRow("q w e r t y", "6");
        appendCheckValuesRow("a s d f", "0");
        appendCheckValuesRow("q w e r t y", "8");
        appendCheckValuesRow("q w e r t y", "-2");
        appendCheckValuesRow("a s d f", "5");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7085().getContent());
    }
}
