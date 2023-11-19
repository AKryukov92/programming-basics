package root.tasks.combinations;

import root.tasks.OneInputValLayout;

public class Task6915 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив из 4 чисел: 11, 37, 53, 89. Нужно написать все комбинации значений этих четырех чисел. Нужно не печатать на экран комбинации, в которых числа повторяются несколько раз.");
        appendCheckSingleNonEscaped(wrapLogic("11,37,53,89"));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        if (arr.length != 4) {
            System.out.println("Должно быть введено 4 числа");
        }
        if (arr.length == 4) {
            int i1 = 0;
            while (i1 < 4) {
                int i2 = 0;
                while (i2 < 4) {
                    int i3 = 0;
                    while (i3 < 4) {
                        int i4 = 0;
                        while (i4 < 4) {
                            if (i1 != i2) {
                                if (i1 != i3) {
                                    if (i1 != i4) {
                                        if (i2 != i3) {
                                            if (i2 != i4) {
                                                if (i3 != i4) {
                                                    System.out.println(arr[i1] + "," + arr[i2] + "," + arr[i3] + "," + arr[i4]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i4 = i4 + 1;
                        }
                        i3 = i3 + 1;
                    }
                    i2 = i2 + 1;
                }
                i1 = i1 + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6915());
    }
}
