package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task3490 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Сколько проволоки можно намотать на катушку диаметром yarnDiameterCm см за wireCoils полных витков? Толщиной проволоки и шириной катушки можно пренебречь. Результат округлить вниз до целого количества сантиметров.");
        appendCheckValuesHeader("yarnDiameterCm", "wireCoils");
        appendCheckValuesRow("3", "2");
        appendCheckValuesRow("10", "300");
        appendCheckValuesRow("0", "15");
        appendCheckValuesRow("13", "0");
        appendCheckValuesRow("11", "-500");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int yarnDiameterCm = Integer.parseInt(firstValue);
        int wireCoils = Integer.parseInt(secondValue);
        if (yarnDiameterCm <= 0) {
            System.out.println("Длина проволоки должна быть неотрицательна");
        }
        if (wireCoils <= 0) {
            System.out.println("Количество витков должно быть неотрицательно");
        }
        if (yarnDiameterCm > 0) {
            if (wireCoils > 0) {
                double circle = yarnDiameterCm * Math.PI;
                System.out.printf("Длина окружности катушки равна %.4f\n", circle);
                double result = Math.floor(circle * wireCoils);
                System.out.printf("На катушку можно намотать %.0f см проволоки", result);
            }
        }
    }
}
