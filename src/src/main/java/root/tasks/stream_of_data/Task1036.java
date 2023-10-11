package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task1036 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Головоломка представляет собой семь клеток в один ряд. Справа находятся 3 белые шашки 'o'. Слева 3 чёрные 'X'. По одной шашке в каждой клетке. В центре свободная клетка. Шашки можно переставлять на соседнюю клетку или перепрыгивать через одну клетку. Цель головоломки - переставить местами черные и белые шашки.");
        appendOrderedNonEscaped("Пользователь вводит номер позиции, из которой нужно переставить шашку на свободное место. Нумерация клеток начинается с 0.",
                "При вводе корректного номера, нужно выполнить перестановку. При вводе недопустимого номера, нужно вывести сообщение \"Укажите позицию от A до B\" или \"Укажите позицию от 0 до 6 включительно\". Вместо A и B написать осмысленные номера позиций.",
                "После каждой перестановки нужно напечатать на экране расположение шашек и проверить условие победы. Когда действия пользователя привели к перестановке черных и белых шашек, напечатать на экране фразу \"ГОЛОВОЛОМКА РЕШЕНА\".");
        appendCheckValuesHeader();
        appendCheckValuesRow("-2,-1,-666".split(","));
        appendCheckValuesRow("7,8,1000".split(","));
        appendCheckValuesRow("3".split(","));
        appendCheckValuesRow("2,2".split(","));
        appendCheckValuesRow("4,4".split(","));
        appendCheckValuesRow("1,1".split(","));
        appendCheckValuesRow("5,5".split(","));
        appendCheckValuesRow("2,5".split(","));
        appendCheckValuesRow("3,6".split(","));
        appendCheckValuesRow("4,0".split(","));
        appendCheckValuesRow("5,1".split(","));
        appendCheckValuesRow("6,1,2,4,5".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        boolean end = false;
        String[] state = "X_X_X_ _o_o_o".split("_");
        String[] standard = "o_o_o_ _X_X_X".split("_");
        int emptyPosition = 3;
        while(!end && s.hasNext()) {
            System.out.println(String.join("",state));
            System.out.println("0123456");
            int move = Integer.parseInt(s.next());
            int allowedMin;
            int allowedMax;
            if (emptyPosition > 1) {
                allowedMin = emptyPosition - 2;
            } else {
                allowedMin = 0;
            }
            if (emptyPosition < 5) {
                allowedMax = emptyPosition + 2;
            } else {
                allowedMax = 6;
            }
            if (move < allowedMin || allowedMax < move || move == emptyPosition) {
                System.out.printf("Укажите позицию от %d до %d, исключая %d\n", allowedMin, allowedMax, emptyPosition);
                continue;
            }
            state[emptyPosition] = state[move];
            state[move] = " ";
            emptyPosition = move;
            int i = 0;
            boolean correct = true;
            while (i < state.length) {
                if (!state[i].equals(standard[i])) {
                    correct = false;
                    break;
                }
                i++;
            }
            if (correct) {
                end = true;
            }
        }
        System.out.println(String.join("",state));
        System.out.println("0123456");
    }

    public static void main(String[] args) {
        System.out.println(new Task1036());
    }
}
