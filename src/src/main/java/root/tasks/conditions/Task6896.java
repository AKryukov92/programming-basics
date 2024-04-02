package root.tasks.conditions;

import root.tasks.MultipleInputValLayout;

import java.sql.SQLException;

public class Task6896 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны две ёмкости объемом 5 и 8 литров. Пользователь вводит два целых числа - фактическое количество воды в них. Затем нужно вывести пользователю список возможных действий:");
        appendOrderedNonEscaped(
                "Налить из крана в маленькую ёмкость",
                        "Налить из крана в большую ёмкость",
                        "Налить из маленькой ёмкости в большую",
                        "Налить из большой ёмкости в маленькую",
                        "Вылить из маленькой ёмкости в раковину",
                        "Вылить из большой ёмкости в раковину"
        );
        appendTaskDescEscaped("После этого пользователь вводит еще одно число - номер действия. Определить, сколько воды получится в этих ёмкостях после выполнения действия с указанным номером. Переливание происходит \"до краев\". Излишки остаются в исходной ёмкости.");
        appendCheckValuesHeader("small", "large", "action");
        appendCheckValuesRow("5", "8", "1");
        appendCheckValuesRow("0", "8", "1");
        appendCheckValuesRow("5", "8", "2");
        appendCheckValuesRow("5", "0", "2");
        appendCheckValuesRow("3", "7", "3");
        appendCheckValuesRow("2", "5", "3");
        appendCheckValuesRow("2", "6", "4");
        appendCheckValuesRow("1", "3", "4");
        appendCheckValuesRow("3", "8", "5");
        appendCheckValuesRow("0", "8", "5");
        appendCheckValuesRow("5", "7", "6");
        appendCheckValuesRow("5", "0", "6");
        appendCheckValuesRow("-1", "6", "1");
        appendCheckValuesRow("20", "6", "1");
        appendCheckValuesRow("3", "-2", "1");
        appendCheckValuesRow("3", "19", "1");
        appendCheckValuesRow("3", "4", "0");
        appendCheckValuesRow("2", "3", "7");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        int small = Integer.parseInt(args[0]);
        int large = Integer.parseInt(args[1]);
        int action = Integer.parseInt(args[2]);
        int maxSmall = 5;
        int maxLarge = 8;
        int resultSmall = small;
        int resultLarge = large;
        if (small < 0 || maxSmall < small) {
            System.out.println("Фактическое количество жидкости в маленькой емкости должно быть от 0 до 5 литров включительно");
            return;
        }
        if (large < 0 || maxLarge < large) {
            System.out.println("Фактическое количество жидкости в большой емкости должно быть от 0 до 8 литров включительно");
            return;
        }
        System.out.printf("Было: в маленькой %d из %d, в большой %d из %d\n", small, maxSmall, large, maxLarge);
//        System.out.println("Введите номер действия:");
//        System.out.println("1. Налить из крана в маленькую ёмкость");
//        System.out.println("2. Налить из крана в большую ёмкость");
//        System.out.println("3. Налить из маленькой ёмкости в большую");
//        System.out.println("4. Налить из большой ёмкости в маленькую");
//        System.out.println("5. Вылить из маленькой ёмкости в раковину");
//        System.out.println("6. Вылить из большой ёмкости в раковину");
        System.out.println("Выбрано действие: " + action);
        if (action == 1) {
            resultSmall = maxSmall;
        } else if (action == 2) {
            resultLarge = maxLarge;
        } else if (action == 3) {
            int largeDeficit = maxLarge - large;
            if (small < largeDeficit) {
                resultSmall = 0;
                resultLarge = large + small;
            } else {
                resultSmall = small - largeDeficit;
                resultLarge = maxLarge;
            }
        } else if (action == 4) {
            int smallDeficit = maxSmall - small;
            if (large < smallDeficit) {
                resultLarge = 0;
                resultSmall = small + large;
            } else {
                resultSmall = maxSmall;
                resultLarge = large - smallDeficit;
            }
        } else if (action == 5) {
            resultSmall = 0;
        } else if (action == 6) {
            resultLarge = 0;
        } else {
            System.out.println("Номер действия должен быть цифрой от 1 до 6");
        }
        System.out.printf("Стало: в маленькой %d из %d, в большой %d из %d\n", resultSmall, maxSmall, resultLarge, maxLarge);
    }

    public static void main(String[] args) {
        System.out.println(new Task6896());
    }
}
