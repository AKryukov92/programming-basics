package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task1217 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив чисел через запятую.");
        appendOrderedNonEscaped(
                "Первое число обозначает начало 'красного' интервала чисел.",
                "Второе число обозначает конец 'красного' интервала чисел.",
                "Третье число - начало 'зеленого' интервала чисел.",
                "Четвертое - конец 'зеленого' интервала чисел."
        );
        appendTaskDescEscaped("Интервал считается корректным если начало строго меньше чем конец. Нужно определить начало и конец области пересечения интервалов. Если не пересекаются, то написать \"не пересекаются\".");
        appendCheckValuesHeader("a1,b1,a2,b2");
        appendCheckValuesRow("11,37,53,89");
        appendCheckValuesRow("11,37,89,53");
        appendCheckValuesRow("11,53,37,89");
        appendCheckValuesRow("11,53,89,37");
        appendCheckValuesRow("11,89,37,53");
        appendCheckValuesRow("11,89,53,37");
        appendCheckValuesRow("37,11,53,89");
        appendCheckValuesRow("37,11,89,53");
        appendCheckValuesRow("37,53,11,89");
        appendCheckValuesRow("37,53,89,11");
        appendCheckValuesRow("37,89,11,53");
        appendCheckValuesRow("37,89,53,11");
        appendCheckValuesRow("53,11,37,89");
        appendCheckValuesRow("53,11,89,37");
        appendCheckValuesRow("53,37,11,89");
        appendCheckValuesRow("53,37,89,11");
        appendCheckValuesRow("53,89,11,37");
        appendCheckValuesRow("53,89,37,11");
        appendCheckValuesRow("89,11,37,53");
        appendCheckValuesRow("89,11,53,37");
        appendCheckValuesRow("89,37,11,53");
        appendCheckValuesRow("89,37,53,11");
        appendCheckValuesRow("89,53,11,37");
        appendCheckValuesRow("89,53,37,11");
        appendCheckValuesRow("1,2,3");
        appendCheckValuesRow("1,2,3,4,5");
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
            int redA = Integer.parseInt(arr[0]);
            int redB = Integer.parseInt(arr[1]);
            int greenA = Integer.parseInt(arr[2]);
            int greenB = Integer.parseInt(arr[3]);
            if (redB < redA) {
                System.out.println("Некорректный интервал. Левая граница " + redA + " должна быть меньше правой " + redB);
            }
            if (redA <= redB) {
                if (greenB < greenA) {
                    System.out.println("Некорректный интервал. Левая граница " + greenA + " должна быть меньше правой " + greenB);
                }
                if (greenA <= greenB) {
                    if (redB < greenA) {//redA redB greenA greenB
                        System.out.println("Интервалы не пересекаются. Правая граница красного " + redB + " левее левого края зеленого " + greenA);
                    }
                    if (greenA <= redB) {//greenA redA redB greenB
                        if (greenB < redA) {
                            System.out.println("Интервалы не пересекаются. Правая граница зеленого " + greenB + " левее левого края красного " + redA);
                        }
                        if (redA <= greenB) {//redA greenA redB greenB
                            System.out.println("Интервалы пересекаются");
                        }
                    }
                }
            }
        }


    public static void main(String[] args) {
        System.out.println(new Task1217());
    }
}
