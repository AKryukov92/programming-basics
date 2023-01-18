package root.tasks.ranges;

import root.tasks.OneInputValLayout;

public class Task6589 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] args = value.split(",");
        int redA = Integer.parseInt(args[0]);
        int redB = Integer.parseInt(args[1]);
        System.out.printf("Красный интервал начинается с %d и заканчивается %d\n", redA, redB);
        if (redB < redA) {
            System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;
        }
        int greenA = Integer.parseInt(args[2]);
        int greenB = Integer.parseInt(args[3]);
        System.out.printf("Зеленый интервал начинается с %d и заканчивается %d\n", greenA, greenB);
        if (greenB < greenA) {
            System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;
        }
        if (redB < greenA) {
            System.out.println("Интервалы не пересекаются. Правый край красного левее левого края зеленого.");
        } else if (greenB < redA) {
            System.out.println("Интервалы не пересекаются. Правый край зеленого левее левого края красного");
        } else {
            System.out.println("Интервалы пересекаются");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив чисел, разделенных символом ','. Числа объединены парами и описывают два интервала \"зеленый\" и \"красный\". Интервал считается корректным если для него выполняется условие A<B. Нужно определить: пересекаются ли данные два интервала чисел. Если не пересекаются, то написать объяснение.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("2,3,5,7");
        appendCheckValuesRow("11,17,13,19");
        appendCheckValuesRow("23,37,29,31");
        appendCheckValuesRow("43,53,41,47");
        appendCheckValuesRow("5,15,0,30");
        appendCheckValuesRow("67,71,59,61");
        appendCheckValuesRow("79,73,83,89");
        appendCheckValuesRow("97,101,107,103");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task6589().getContent());
    }
}
