package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task6714 extends OneInputValLayout {
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
        appendTaskDescEscaped("Интервал считается корректным если начало строго меньше чем конец. Нужно определить: пересекаются ли данные два интервала чисел. Если не пересекаются, то написать объяснение.");
        appendCheckValuesHeader("values");
        appendCheckValuesRow("2,3,5,7");
        appendCheckValuesRow("11,17,13,19");
        appendCheckValuesRow("23,37,29,31");
        appendCheckValuesRow("43,53,41,47");
        appendCheckValuesRow("5,15,0,30");
        appendCheckValuesRow("67,71,59,61");
        appendCheckValuesRow("79,73,83,89");
        appendCheckValuesRow("97,101,107,103");
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
                System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            }
            if (redA <= redB) {
                if (greenB < greenA) {
                    System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
                }
                if (greenA <= greenB) {
                    if (redB < greenA) {
                        System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
                    }
                    if (greenA <= redB) {
                        if (greenB < redA) {
                            System.out.println("Интервалы не пересекаются. Правый край зеленого левее левого края красного");
                        }
                        if (redA <= greenB) {
                            System.out.println("Интервалы пересекаются");
                        }
                    }
                }
            }
        }
    }
}
