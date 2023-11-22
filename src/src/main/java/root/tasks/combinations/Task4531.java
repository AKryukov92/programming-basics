package root.tasks.combinations;

import root.tasks.MultipleInputValLayout;

public class Task4531 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        int redA = Integer.parseInt(args[0]);
        int redB = Integer.parseInt(args[1]);
        int greenA = Integer.parseInt(args[2]);
        int greenB = Integer.parseInt(args[3]);

        if (redA < 0 || redB < 0 || greenA < 0 || greenB < 0) {
            System.out.println("Обнаружена некорректная граница. Каждая граница должна быть неотрицательна.");
            return;
        }
        if (120 <= redA || 120 <= redB || 120 <= greenA || 120 <= greenB) {
            System.out.println("Обнаружена некорректная граница. Каждая граница должна быть меньше 120.");
            return;
        }
        if (redB < redA || greenB < greenA) {
            System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;
        }
        int i = 0;
        if (redA < greenA) {
            for (; i < redA; i++) {
                System.out.print(" ");
            }
            if (greenA < redB) {
                for (; i < greenA; i++) {
                    System.out.print("-");
                }
                if (greenB < redB) {
                    for (; i < greenB; i++) {
                        System.out.print("+");
                    }
                    for (; i < redB; i++) {
                        System.out.print("-");
                    }
                    System.out.printf("\nredA %d greenA %d greenB %d redB %d\n", redA, greenA, greenB, redB);
                } else {
                    for (; i < redB; i++) {
                        System.out.print("+");
                    }
                    for (; i < greenB; i++) {
                        System.out.print("|");
                    }
                    System.out.printf("\nredA %d greenA %d redB %d greenB %d\n", redA, greenA, redB, greenB);
                }
            } else {
                for (; i < redB; i++) {
                    System.out.print("-");
                }
                for (; i < greenA; i++) {
                    System.out.print(" ");
                }
                for (; i < greenB; i++) {
                    System.out.print("|");
                }
                System.out.printf("\nredA %d redB %d greenA %d greenB %d\n", redA, redB, greenA, greenB);
            }
        } else {
            for (; i < greenA; i++) {
                System.out.print(" ");
            }
            if (greenB < redA) {
                for (; i < greenB; i++) {
                    System.out.print("|");
                }
                for (; i < redA; i++) {
                    System.out.print(" ");
                }
                for (; i < redB; i++) {
                    System.out.print("-");
                }
                System.out.printf("\ngreenA %d greenB %d redA %d redB %d\n", greenA, greenB, redA, redB);
            } else {
                for (;i<redA;i++) {
                    System.out.print("|");
                }
                if (greenB < redB) {
                    for (;i<greenB;i++) {
                        System.out.print("+");
                    }
                    for (;i<redB;i++) {
                        System.out.print("-");
                    }
                    System.out.printf("\ngreenA %d redA %d greenB %d redB %d\n", greenA, redA, greenB, redB);
                } else {
                    for (;i<redB;i++) {
                        System.out.print("+");
                    }
                    for (;i<greenB;i++) {
                        System.out.print("|");
                    }
                    System.out.printf("\ngreenA %d redA %d redB %d greenB %d\n", greenA, redA, redB, greenB);
                }
            }
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит границы двух интервалов: минусы и палочки." +
                " Интервал считается корректным если его правая граница больше левой и при этом если каждая граница меньше 120." +
                " Числа на оси координат увеличиваются вправо." +
                " Нужно изобразить интервалы в одной строке. Интервал минусов с помощью знака \"-\"." +
                " Интервал палочек с помощью знака \"|\". " +
                " Область пересечения интервалов с помощью знака \"+\"." +
                " Промежутки между интервалами заполните пробелами.");
        appendCheckValuesHeader("redA", "redB", "greenA", "greenB");
        appendCheckValuesRow("5", "30", "50", "65");
        appendCheckValuesRow("11", "57", "23", "49");
        appendCheckValuesRow("23", "47", "36", "61");
        appendCheckValuesRow("33", "53", "11", "47");
        appendCheckValuesRow("5", "15", "0", "30");
        appendCheckValuesRow("37", "51", "19", "31");
        appendCheckValuesRow("79", "73", "83", "89");
        appendCheckValuesRow("97", "101", "107", "103");
        appendCheckValuesRow("-1", "1", "2", "3");
        appendCheckValuesRow("1", "-2", "3","4");
        appendCheckValuesRow("1", "2", "-3", "4");
        appendCheckValuesRow("1", "2", "3", "-4");
        appendCheckValuesRow("200", "2", "3", "4");
        appendCheckValuesRow("1", "200", "3", "4");
        appendCheckValuesRow("1", "2", "200", "4");
        appendCheckValuesRow("1", "2", "3", "200");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task4531().getContent());
    }
}