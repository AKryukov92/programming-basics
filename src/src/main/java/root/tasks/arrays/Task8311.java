package root.tasks.arrays;

import root.tasks.ThreeInputValLayout;

public class Task8311 extends ThreeInputValLayout {
    @Override
    protected void logic(String data, String B, String E) {
        if (data.isEmpty()) {
            System.out.println("Исходный массив пуст");
            return;
        }
        String[] arr = data.split(" ");
        int b = Integer.parseInt(B);
        int e = Integer.parseInt(E);
        if (b < 0 || arr.length <= b) {
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        if (e < 0 || arr.length <= e) {
            System.out.println("Число E должно быть в интервале [0, размер массива)");
            return;
        }
        int first;
        int last;
        if (b > e ){
            first = e;
            last = b;
        } else {
            first = b;
            last = e;
        }
        while (first <= last) {
            System.out.print(arr[first] + " ");
            first++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два числа B и E и данные - символы, разделенные пробелами. Значение B может быть как меньше, так и больше E. Нужно вывести элементы, у которых индекс находится между B и E включительно.");
        appendCheckValuesHeader("data", "B", "E");
        appendCheckValuesRow("z x c v b", "0", "3");
        appendCheckValuesRow("z x c v b", "1", "3");
        appendCheckValuesRow("z x c v b", "2", "3");
        appendCheckValuesRow("z x c v b a s d f g h", "3", "10");
        appendCheckValuesRow("z x c v b a s d f g h", "2", "2");
        appendCheckValuesRow("z x c v b a s d f g h", "8", "2");
        appendCheckValuesRow("z x c v b a s d f g h", "11", "8");
        appendCheckValuesRow("z x c v b a s d f g h", "-1", "5");
        appendCheckValuesRow("z x c v b a s d f g h", "8", "50");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task8311().getContent());
    }
}
