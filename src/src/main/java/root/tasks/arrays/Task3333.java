package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task3333 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split(" ");
        int s = Integer.parseInt(secondValue);
        int realShift;
        if (s < -arr.length) {
            realShift = arr.length - (-s % arr.length);
        } else if (s < 0) {
            realShift = arr.length + s;
        } else if (s > arr.length) {
            realShift = s % arr.length;
        } else {
            realShift = s;
        }
        System.out.println("Фактически нужно сдвинуть на " + realShift);
        for (int j = 0; j < realShift; j++) {
            String t = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число S и данные - символы, разделенные пробелами." +
                " Сдвинуть все элементы массива на S позиций вправо."
        );
        appendCheckValuesHeader("data", "S");
        appendCheckValuesRow("q w e r t y", "1");
        appendCheckValuesRow("q w e r t y", "3");//r t y q w e
        appendCheckValuesRow("a s d f", "2");
        appendCheckValuesRow("q w e r t y", "6");
        appendCheckValuesRow("q w e r t y", "8");
        appendCheckValuesRow("a s d f", "5");
        appendCheckValuesRow("q w e r t y", "99");
        appendCheckValuesRow("a s d f", "10");
        appendCheckValuesRow("q w e r t y", "0");
        appendCheckValuesRow("q w e r t y", "-1");
        appendCheckValuesRow("q w e r t y", "-2");
        appendCheckValuesRow("q w e r t y", "-3");
        appendCheckValuesRow("q w e r t y", "-9");
        appendCheckValuesRow("q w e r t y", "-6");
        appendCheckValuesRow("q w e r t y", "-7");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task3333().getContent());
    }
}
