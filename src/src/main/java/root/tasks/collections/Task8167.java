package root.tasks.collections;

import root.tasks.StreamInputLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8167 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит бесконечное количество чисел по одному. После ввода каждого числа нужно посчитать сумму последних пяти чисел.");
        appendCheckValuesHeader();
        appendCheckValuesRow("9,8,7,6,5,4,3,2,1000,200,10,30000,400000".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        List<Integer> all = new ArrayList<>();
        while(source.hasNext()) {
            int a = Integer.parseInt(source.next());
            all.add(a);
            int sum = 0;
            System.out.println("Складываю числа: ");
            if (all.size() > 5) {
                for (int i = all.size() - 5; i < all.size(); i++){
                    System.out.print(all.get(i));
                    sum += all.get(i);
                }
            } else {
                for (int i = 0; i < all.size(); i++){
                    System.out.print(all.get(i));
                    sum += all.get(i);
                }
            }
            System.out.println();
            System.out.println("Сумма равна " + sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8167());
    }
}
