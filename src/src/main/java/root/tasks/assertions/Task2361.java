package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task2361 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан рулон материала длиной totalM метров. Расход материала на одно изделие - partCm сантиметров материала. Вычислите сколько изделий получится изготовить и сколько материала останется. Оформите результат по шаблону:");
        appendCheckSingleNonEscaped("Длина рулона в сантиметрах равна $totalCm\n" +
                "Из этого материала получится $amount изделий и останется $remainder см");
        appendCheckValuesHeader("totalM", "partCm");
        appendCheckValuesRow("400", "17");
        appendCheckValuesRow("103", "29");
        appendCheckValuesRow("2", "12");
        appendCheckValuesRow("2", "313");
        appendCheckValuesRow("3", "400");
        appendCheckValuesRow("300", "-70");
        appendCheckValuesRow("5", "-10");
        appendCheckValuesRow("11", "0");
        appendCheckValuesRow("-800", "20");
        appendCheckValuesRow("0", "23");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int totalM = Integer.parseInt(firstValue);
        int partCm = Integer.parseInt(secondValue);
        if (totalM <= 0) {
            System.out.println("Длина рулона должна быть положительна");
        }
        if (partCm <= 0) {
            System.out.println("Расход материала должен быть положительным");
        }
        if (totalM > 0) {
            int totalCm = totalM * 100;
            System.out.printf("Длина рулона в сантиметрах равна %d\n", totalCm);
            if (totalCm < partCm) {
                System.out.println("Материала не хватат даже на одно изделие");
            }
            if (partCm > 0) {
                if (totalCm >= partCm) {
                    int amount = totalCm / partCm;
                    int remainder = totalCm % partCm;
                    System.out.printf("Из этого материала получится %d изделий и останется %s см\n", amount, remainder);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2361());
    }
}
