package root.tasks.assertions;

import root.tasks.ThreeInputValLayout;

public class Task7619 extends ThreeInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDesc("Представьте, что вы пишете программное обеспечение для банкомата. Полезным действием будет выдача банкнот." +
                " Пользователь пришел к банкомату, вставил карту, увидел что на счету 10 тысяч, нажал 'снять деньги' и ввел миллион." +
                " Банкомат выдал ему миллион, а затем написал сообщение 'недостаточно средств на счету'." +
                " Правильно ли действовал банкомат?" +
                " Именно поэтому мы проверяем исходные данные перед тем, как совершаем полезные действия."
        );
        appendTaskHeader();
        appendTaskDesc("Два автомобиля едут навстречу друг другу с постоянными скоростями velocity1 и velocity2 км/час. Определить, через какое время автомобили встретятся, если расстояние между ними было distance км.");
        appendCheckValuesHeader("velocity1", "velocity2", "distance");
        appendCheckValuesRow("31", "47", "6833");
        appendCheckValuesRow("0", "7", "6829");
        appendCheckValuesRow("6", "0", "100");
        appendCheckValuesRow("17", "19", "0");
        appendCheckValuesRow("-11", "13", "200");
        appendCheckValuesRow("79", "-67", "400");
        appendCheckValuesRow("10", "20","-500");
        appendCheckValuesRow("-20", "-73", "300");
        appendCheckValuesRow("60", "-120", "-600");
        appendCheckValuesRow("-2", "-3", "-1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        int v1 = Integer.parseInt(firstValue);
        int v2 = Integer.parseInt(secondValue);
        int d = Integer.parseInt(thirdValue);
        if (v1 < 0 || v2 < 0) {
            System.out.println("Скорость должна быть неотрицательна");
        }
        if (d < 0) {
            System.out.println("Расстояние должно быть неотрицательным");
        }
        if (v1 >=0 && v2 >= 0 && d >= 0) {
            double h = (double)d / (v1 + v2);
            System.out.printf("Автомобили встретятся через %.4f часов", h);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7619());
    }
}
