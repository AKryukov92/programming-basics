package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

public class Task4859 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Известна цена закупки и цена продажи товара в рублях. Цены указаны с учетом НДС по ставке 18%. Нужно вычислить сумму НДС к уплате в налоговую.");
        appendOrderedNonEscaped(
                "Вычислить НДС вход (buyTax) - НДС от цены закупки",
                "Вычислить НДС выход (sellTax) - НДС от цены продажи",
                "Найти разницу между sellTax и buyTax"
        );
        appendTaskDescEscaped("Решить двумя способами:");
        resetOrdered();
        appendOrderedNonEscaped(
                "Раннее округление: округлить НДС вход и НДС выход, а разницу искать у округленных значений.",
                "Позднее округление: найти разницу между точными значениями НДС вход и НДС выход, а разницу - округлить."
        );
        appendTaskDescEscaped("Для округления воспользуйтесь функцией Math.round(number), где вместо number поставьте число или переменную, которую нужно округлить до целого." +
                " Выведите ход решения и наибольшую получившуюся сумму к уплате." +
                " Если получившаяся сумма получилась отрицательной, то указать что НДС подлежит возврату из бюджета.");
        appendCheckValuesHeader("buyCostRoubles", "sellCostRoubles");
        appendCheckValuesRow("68", "103");
        appendCheckValuesRow("68", "101");
        appendCheckValuesRow("69", "103");
        appendCheckValuesRow("69", "101");
        appendCheckValuesRow("101", "69");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double buyCostRoubles = Double.parseDouble(firstValue);
        double sellCostRoubles = Double.parseDouble(secondValue);
        double buyTaxCents = (buyCostRoubles - buyCostRoubles / 1.18) * 100;
        double sellTaxCents = (sellCostRoubles - sellCostRoubles / 1.18) * 100;
        double taxToPayCentsEarlyRounding = Math.round(sellTaxCents) - Math.round(buyTaxCents);
        System.out.println("Раннее округление");
        System.out.printf("НДС вход %f, после округления %.0f рублей %d копеек\n", buyTaxCents / 100, Math.floor(buyTaxCents / 100), Math.round(buyTaxCents) % 100);
        System.out.printf("НДС выход %f, после округления %.0f рублей %d копеек\n", sellTaxCents / 100, Math.floor(sellTaxCents / 100), Math.round(sellTaxCents) % 100);
        if (buyCostRoubles < sellCostRoubles) {
            System.out.printf("Требуется уплатить %.0f рублей %.0f копеек\n", Math.floor(taxToPayCentsEarlyRounding / 100), taxToPayCentsEarlyRounding % 100);
        } else {
            System.out.printf("Требуется уплатить %.0f рублей %.0f копеек\n", Math.ceil(taxToPayCentsEarlyRounding / 100), taxToPayCentsEarlyRounding % 100);
        }
        buyTaxCents = (buyCostRoubles - buyCostRoubles / 1.18) * 100;
        sellTaxCents = (sellCostRoubles - sellCostRoubles / 1.18) * 100;
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

    public static void main(String[] args) {
        System.out.println(new Task4859());
    }
}
