package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task9126 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь загадал число. Компьютер угадывает его и при этом спрашивает у пользователя, верна ли догадка. Если предположение компьютера больше загаданного, пользователь должен ввести 1. Если меньше, то -1. Если равно, то 0.");
        appendCheckValuesHeader();
        appendCheckValuesRow("-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1".split(","));
        appendCheckValuesRow("-1,1,-1,1,-1,1,-1,1,-1,1,-1,1".split(","));
        appendCheckValuesRow("-1,1,0".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int start = 0, end = Integer.MAX_VALUE;
        int steps = 0;
        while (end - start > 1) {
            int lower = start, middle = start + (end - start) / 2, higher = end;
            System.out.printf("Середина интервала %d\n", middle);
            System.out.println("Загаданное число это " + middle + "?");
            if (!source.hasNext()) return;
            int answer = Integer.parseInt(source.next());
            if (answer < 0) {
                System.out.printf("Значит загаданное в интервале (%d,%d) ", lower, middle);
                start = lower;
                end = middle;
            } else if (answer > 0){
                System.out.printf("Значит загаданное в интервале (%d,%d) ", middle, higher);
                start = middle;
                end = higher;
            } else {
                break;
            }
            steps++;
        }
        System.out.println("Решение найдено за " + steps + " шагов");
    }

    public static void main(String[] args) {
        System.out.println(new Task9126());
    }
}
