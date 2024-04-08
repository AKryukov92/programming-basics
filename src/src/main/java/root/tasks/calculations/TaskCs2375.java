package root.tasks.calculations;

import root.tasks.MultipleInputValLayout;

public class TaskCs2375 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит количество денег на счету и стоимость покупки. Вычесть стоимость покупки из количества денег на счету.");
        appendCheckValuesHeader("accountRoubles", "accountKop", "priceRoubles", "priceKop");
        appendCheckValuesRow("3", "87", "2", "89");
        appendCheckValuesRow("2", "87", "3", "89");
        appendCheckValuesRow("10", "87", "3", "89");
        appendCheckValuesRow("2", "87", "3", "45");
        appendCheckValuesRow("3", "57", "2", "74");
        appendCheckValuesRow("10", "87", "3", "45");
        appendCheckValuesRow("4", "1", "4", "80");
        appendCheckValuesRow("4", "80", "4", "1");
        appendCheckValuesRow("7", "19", "7", "19");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Для удобства проверки, вы можете написать ожидаемый результат простым текстом, а следующей строкой - вывести на экран результат запуска метода.");
        appendCheckSingleNonEscaped(methodExample());
        appendTaskDescEscaped("Оформите все тестовые случаи таким образом. Таким образом вы сможете быстро увидеть в каких случаях фактический результат отличается от ожидаемого.");
        appendFooter();
    }

    @Override
    protected String methodExample() {
        return "Console.WriteLine(\"Должно быть: Остаток на счету: 0 рублей -42 копеек\"); //здесь пишите текст из тестовых данных\n" +
                "Console.Write(\"Получилось :\");\n" +
                "task2375(2,87,3,45);";
    }

    @Override
    protected void logic(String... args) {
        int accountRoubles = Integer.parseInt(args[0]);
        int accountKop = Integer.parseInt(args[1]);
        int priceRoubles = Integer.parseInt(args[2]);
        int priceKop = Integer.parseInt(args[3]);
        int remKop;
        int remRoubles = 0;

        if (accountRoubles > priceRoubles) {
            if (accountKop < priceKop) {
                remKop = 100 + accountKop - priceKop;
                remRoubles = accountRoubles - priceRoubles - 1;
            } else {
                remKop = accountKop - priceKop;
                remRoubles = accountRoubles - priceRoubles;
            }
        } else if (accountRoubles < priceRoubles) {
            if (accountKop < priceKop) {
                remRoubles = accountRoubles - priceRoubles;
            } else {
                remRoubles = accountRoubles - priceRoubles + 1;
            }
            remKop = priceKop - accountKop;
        } else {
            remKop = accountKop - priceKop;
        }
        System.out.println("Остаток на счету: " + remRoubles + " рублей " + remKop + " копеек");
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs2375());
    }
}
