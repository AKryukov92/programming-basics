/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        step4859();
    }

    private static void step4859() {
        System.out.println();
        System.out.println("4859");
        //buy less 5: 68
        //buy greater 5: 69
        //sell less 5: 103
        //sell greater 5: 101
        task4859compare(68, 103);
        System.out.println();
        task4859compare(68, 101);
        System.out.println();
        task4859compare(69, 103);
        System.out.println();
        task4859compare(69, 101);
        System.out.println();
        task4859compare(101, 69);
    }

    private static void Step1186() {
        System.out.println();
        System.out.println("1186");
        Lab05.task1186(6, 2, 5);
        Lab05.task1186(4, 5, -18);
        Lab05.task1186(20, -9, 12);

        Lab05.task1186(-2, 17, 6);
        Lab05.task1186(-19, -8, 6);
        Lab05.task1186(3, -15, -8);
        Lab05.task1186(-1, -14, -2);
    }

    private static void Step6924() {
        System.out.println(Lab02.task6924(-50, -86.6025, 60, 0));
        System.out.println(Lab02.task6924(10, 0, 0, 10));
        System.out.println(Lab02.task6924(11, 13, 7, 17));
        System.out.println(Lab02.task6924(-70.7106, 50, 60, 0));
        System.out.println(Lab02.task6924(-86.6025, 50, 60, 0));
        System.out.println(Lab02.task6924(3, 4, 4, 3));
    }

    private static void Step7243() {
        System.out.println();
        System.out.println("7243");
        task7243(5, 8);
        task7243(0, 0);
        task7243(5, 0);
        task7243(5, 1);
        task7243(5, 3);
        task7243(5, 4);
        task7243(4, 5);
        task7243(3, 7);
    }

    private static void task7243(int small, int large) {
        int maxSmall = 5;
        int maxLarge = 8;
        if (small < 0 || maxSmall < small) {
            System.out.println("Фактическое количество жидкости в маленькой емкости должно быть от 0 до 5 литров включительно");
            return;
        }
        if (large < 0 || maxLarge < large) {
            System.out.println("Фактическое количество жидкости в большой емкости должно быть от 0 до 8 литров включительно");
            return;
        }
        int resultSmall;
        int resultLarge;
        int largeDeficit = maxLarge - large;
        if (small < largeDeficit) {
            resultSmall = 0;
            resultLarge = large + small;
        } else {
            resultSmall = small - largeDeficit;
            resultLarge = large + largeDeficit;
        }
        System.out.printf("Было: %d/%d %d/%d\n", small, maxSmall, large, maxLarge);
        System.out.printf("Стало: %d/%d %d/%d\n", resultSmall, maxSmall, resultLarge, maxLarge);
    }

    private static void task4859(int buyCostRoubles, int sellCostRoubles) {
        int buyCostCents = buyCostRoubles * 100;
        int sellCostCents = sellCostRoubles * 100;
        double buyTaxCents = (double) buyCostCents - buyCostCents / 1.18;
        double sellTaxCents = (double) sellCostCents - sellCostCents / 1.18;
        double buyTaxRoubles = buyTaxCents / 100;
        double sellTaxRoubles = sellTaxCents / 100;
        double taxToPayCents = sellTaxCents - buyTaxCents;
        double taxToPayRoubles = taxToPayCents / 100;
        System.out.println("НДС вход " + buyTaxRoubles + " рублей " + (buyTaxCents % 100) + " копеек");
        System.out.println("НДС выход " + sellTaxRoubles + " рублей " + (buyTaxCents % 100) + " копеек");
        System.out.println("Требуется уплатить " + taxToPayRoubles + " рублей " + (taxToPayCents % 100) + " копеек");
        System.out.println("После округления " + Math.round(taxToPayCents) / 100 + " рублей " + Math.round(taxToPayCents % 100) + " копеек");
    }

    private static void task4859round(int buyCostRoubles, int sellCostRoubles) {
        double buyTaxCents = Math.round(((double) buyCostRoubles - buyCostRoubles / 1.18) * 100);
        double sellTaxCents = Math.round(((double) sellCostRoubles - sellCostRoubles / 1.18) * 100);
        double taxToPayCents = sellTaxCents - buyTaxCents;
        System.out.println("НДС вход " + Math.floor(buyTaxCents / 100) + " рублей " + (buyTaxCents % 100) + " копеек");
        System.out.println("НДС выход " + Math.floor(sellTaxCents / 100) + " рублей " + (buyTaxCents % 100) + " копеек");
        System.out.println("Требуется уплатить " + Math.floor(taxToPayCents / 100) + " рублей " + (taxToPayCents % 100) + " копеек");
    }

    private static void task4859compare(int buyCostRoubles, int sellCostRoubles) {
        double buyTaxCents = ((double) buyCostRoubles - buyCostRoubles / 1.18) * 100;
        double sellTaxCents = ((double) sellCostRoubles - sellCostRoubles / 1.18) * 100;
        double taxToPayCentsEarlyRounding = Math.round(sellTaxCents) - Math.round(buyTaxCents);
        System.out.println("Раннее округление");
        System.out.printf("НДС вход %f, после округления %.0f рублей %d копеек\n", buyTaxCents / 100, Math.floor(buyTaxCents / 100), Math.round(buyTaxCents) % 100);
        System.out.printf("НДС выход %f, после округления %.0f рублей %d копеек\n", sellTaxCents / 100, Math.floor(sellTaxCents / 100), Math.round(sellTaxCents) % 100);
        if (buyCostRoubles < sellCostRoubles) {
            System.out.printf("Требуется уплатить %.0f рублей %.0f копеек\n", Math.floor(taxToPayCentsEarlyRounding / 100), taxToPayCentsEarlyRounding % 100);
        } else {
            System.out.printf("Требуется уплатить %.0f рублей %.0f копеек\n", Math.ceil(taxToPayCentsEarlyRounding / 100), taxToPayCentsEarlyRounding % 100);
        }
        buyTaxCents = ((double) buyCostRoubles - buyCostRoubles / 1.18) * 100;
        sellTaxCents = ((double) sellCostRoubles - sellCostRoubles / 1.18) * 100;
        double taxToPayLaterRounding = Math.round(sellTaxCents - buyTaxCents);
        System.out.println("Позднее округление");
        System.out.printf("НДС вход %f рублей\n", buyTaxCents / 100);
        System.out.printf("НДС выход %f рублей\n", sellTaxCents / 100);
        if (buyCostRoubles < sellCostRoubles) {
            System.out.printf("Требуется уплатить %f, после округления %.0f рублей %.0f копеек\n",
                    (sellTaxCents - buyTaxCents) / 100,
                    Math.floor(taxToPayLaterRounding / 100),
                    taxToPayLaterRounding % 100
            );
        } else {
            System.out.printf("Требуется уплатить %f, после округления %.0f рублей %.0f копеек\n",
                    (sellTaxCents - buyTaxCents) / 100,
                    Math.ceil(taxToPayLaterRounding / 100),
                    taxToPayLaterRounding % 100
            );
        }
        double resultTax;
        if (taxToPayCentsEarlyRounding > taxToPayLaterRounding) {
            System.out.println("При раннем округлении налог больше");
            resultTax = taxToPayCentsEarlyRounding;
        } else if (taxToPayCentsEarlyRounding < taxToPayLaterRounding) {
            System.out.println("При позднем округлении налог больше");
            resultTax = taxToPayLaterRounding;
        } else {
            System.out.println("Суммы налогов к уплате равны");
            resultTax = taxToPayCentsEarlyRounding;
        }
        if (resultTax < 0) {
            resultTax *= -1;
            System.out.printf("Сумма возврата НДС из бюджета составляет %.0f рублей %.0f копеек\n", Math.floor(resultTax / 100), resultTax % 100);
            System.out.println("За вами выехала выездная налоговая проверка");
        } else {
            System.out.printf("Сумма НДС к уплате составляет %.0f рублей %.0f копеек\n", Math.floor(resultTax / 100), resultTax % 100);
        }
    }
}
