package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7237 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Известно значение температуры по шкале Цельсия. Найти соответствующее значение температуры по шкале Фаренгейта. Для этого необходимо исходное значение температуры умножить на 1,8 и к результату прибавить 32.");
        appendCheckValuesHeader("temperatureC");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-5");
        appendCheckValuesRow("-40");
        appendCheckValuesRow("-100");
        appendCheckValuesRow("-17.7777");
        appendCheckValuesRow("20.5");
        appendCheckValuesRow("249.44445");
        appendCheckValuesRow("-273.15");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double t = Double.parseDouble(value);
        if (t < -273.15) {
            System.out.println("Значение T должно быть не ниже абсолютного нуля");
        } else {
            double result = t * 1.8 + 32;
            System.out.printf("%.4f", result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7237());
    }
}
