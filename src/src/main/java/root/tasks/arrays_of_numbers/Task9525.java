package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task9525 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        if (arr.length % 2 == 1) {
            System.out.println("У последнего интервала отсутствует одна из границ");
            return;
        }
        int i = 0;
        while (i + 1 < arr.length) {
            int l = Integer.parseInt(arr[i]);
            int r = Integer.parseInt(arr[i + 1]);
            if (l < r && l <= 19 && 19 <= r) {
                System.out.println("От " + l + " до " + r + "<--");
            } else if (r <= 19 && 19 <= l) {
                System.out.println("От " + r + " до " + l + "<--");
            } else if (l < r) {
                System.out.println("От " + l + " до " + r);
            } else {
                System.out.println("От " + r + " до " + l);
            }
            i += 2;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные символов \",\". Каждая пара чисел обозначает границы интервалов. Каждое число относится только к одному интервалу. Вывести границы всех интервалов в столбик, меньшую границу - слева. Вывести стрелочку \"<--\" напротив интервалов, в которые попадает число 19 (сравнивать включительно).");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("1,5,3,10,8,15,18,20");
        appendCheckValuesRow("19,25,0,3,100,120");
        appendCheckValuesRow("10,19,20,29,30,39");
        appendCheckValuesRow("19,8,5,10,34,19,30,20");
        appendCheckValuesRow("1,1,20,60,20,20,19,19");
        appendCheckValuesRow("3,17,90,65");
        appendCheckValuesRow("1,100,2,99,3,98,4,97,5,96");
        appendCheckValuesRow("1,5,3");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task9525());
    }
}
