package root.tasks.combinations;

import root.tasks.MultipleInputValLayout;

import java.sql.SQLException;

public class Task9734 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны две ёмкости объемом 5 и 8 литров. Пользователь вводит два целых числа - фактическое количество воды в них. Затем нужно вывести пользователю список осмысленных действий. Полный список действий:");
        appendOrderedNonEscaped(
                "Налить из крана в маленькую ёмкость",
                "Налить из крана в большую ёмкость",
                "Налить из маленькой ёмкости в большую",
                "Налить из большой ёмкости в маленькую",
                "Вылить из маленькой ёмкости в раковину",
                "Вылить из большой ёмкости в раковину"
        );
        appendTaskDescEscaped("Бессмысленными считаются действия, которые не изменят содержимое ёмкостей:");
        resetOrdered();
        appendOrderedNonEscaped(
                "Вылить из пустой ёмкости",
                "Налить в полную ёмкость"
        );
        appendTaskDescEscaped("Получившийся список действий должны быть пронумерован по порядку от 1 до конца с шагом 1. После этого пользователь вводит еще одно число - номер действия. Определить, сколько воды получится в этих ёмкостях после выполнения действия с указанным номером. Переливание происходит \"до краев\". Излишки остаются в исходной ёмкости.");
        appendCheckValuesHeader("small", "large", "action");
        appendCheckValuesRow("0", "0", "0");
        appendCheckValuesRow("0", "0", "1");
        appendCheckValuesRow("0", "0", "2");
        appendCheckValuesRow("0", "0", "3");
        appendCheckValuesRow("0", "6", "1");
        appendCheckValuesRow("0", "6", "2");
        appendCheckValuesRow("0", "6", "3");
        appendCheckValuesRow("0", "6", "4");
        appendCheckValuesRow("0", "6", "5");
        appendCheckValuesRow("0", "8", "1");
        appendCheckValuesRow("0", "8", "2");
        appendCheckValuesRow("0", "8", "3");
        appendCheckValuesRow("0", "8", "4");
        appendCheckValuesRow("2", "0", "1");
        appendCheckValuesRow("2", "0", "2");
        appendCheckValuesRow("2", "0", "3");
        appendCheckValuesRow("2", "0", "4");
        appendCheckValuesRow("2", "0", "5");
        appendCheckValuesRow("3", "6", "1");
        appendCheckValuesRow("3", "6", "1");
        appendCheckValuesRow("3", "6", "2");
        appendCheckValuesRow("3", "6", "3");
        appendCheckValuesRow("1", "6", "3");
        appendCheckValuesRow("3", "6", "4");
        appendCheckValuesRow("1", "2", "4");
        appendCheckValuesRow("3", "6", "5");
        appendCheckValuesRow("3", "6", "6");
        appendCheckValuesRow("3", "6", "7");
        appendCheckValuesRow("4", "8", "1");
        appendCheckValuesRow("4", "8", "2");
        appendCheckValuesRow("4", "8", "3");
        appendCheckValuesRow("4", "8", "4");
        appendCheckValuesRow("4", "8", "5");
        appendCheckValuesRow("5", "0", "1");
        appendCheckValuesRow("5", "0", "2");
        appendCheckValuesRow("5", "0", "3");
        appendCheckValuesRow("5", "0", "4");
        appendCheckValuesRow("5", "4", "1");
        appendCheckValuesRow("5", "2", "2");
        appendCheckValuesRow("5", "4", "2");
        appendCheckValuesRow("5", "4", "3");
        appendCheckValuesRow("5", "4", "4");
        appendCheckValuesRow("5", "4", "5");
        appendCheckValuesRow("5", "8", "1");
        appendCheckValuesRow("5", "8", "2");
        appendCheckValuesRow("5", "8", "3");
        appendCheckValuesRow("-1", "0", "1");
        appendCheckValuesRow("20", "0", "1");
        appendCheckValuesRow("0", "-2", "1");
        appendCheckValuesRow("0", "19", "1");
        appendCheckValuesFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        int small = Integer.parseInt(args[0]);
        int large = Integer.parseInt(args[1]);
        int action = Integer.parseInt(args[2]);
        //Нужно определить список осмысленных действий в зависимости от объема емкостей, а потом выполнить действие в получившейся нумерации
        //Бессмысленно:
        // выливать из пустого
        // наливать в полный
        // переливать из пустого
        // переливать в полный
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
        int fromPipeToSmall = 0;
        int fromPipeToLarge = 0;
        int fromSmallToLarge = 0;
        int fromLargeToSmall = 0;
        int fromSmallToSink = 0;
        int fromLargeToSink = 0;
        int maxAction = 6;
        System.out.printf("Было: в маленькой %d из %d, в большой %d из %d\n", small, maxSmall, large, maxLarge);
        if (small == 0){
            if (large == 0){
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из крана в большую ёмкость");
                fromPipeToSmall = 1;
                fromPipeToLarge = 2;
                maxAction = 2;
            } else if (large < maxLarge) {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из крана в большую ёмкость");
                System.out.println("3. Налить из большой ёмкости в маленькую");
                System.out.println("4. Вылить из большой ёмкости в раковину");
                fromPipeToSmall = 1;
                fromPipeToLarge = 2;
                fromLargeToSmall = 3;
                fromLargeToSink = 4;
                maxAction = 4;
            } else {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из большой ёмкости в маленькую");
                System.out.println("3. Вылить из большой ёмкости в раковину");
                fromPipeToSmall = 1;
                fromLargeToSmall = 2;
                fromLargeToSink = 3;
                maxAction = 3;
            }
        } else if (small < maxSmall){
            if (large == 0) {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из крана в большую ёмкость");
                System.out.println("3. Налить из маленькой ёмкости в большую");
                System.out.println("4. Вылить из маленькой ёмкости в раковину");
                fromPipeToSmall = 1;
                fromPipeToLarge = 2;
                fromSmallToLarge = 3;
                fromSmallToSink = 4;
                maxAction = 4;
            } else if (large < maxLarge) {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из крана в большую ёмкость");
                System.out.println("3. Налить из маленькой ёмкости в большую");
                System.out.println("4. Налить из большой ёмкости в маленькую");
                System.out.println("5. Вылить из маленькой ёмкости в раковину");
                System.out.println("6. Вылить из большой ёмкости в раковину");
                fromPipeToSmall = 1;
                fromPipeToLarge = 2;
                fromSmallToLarge = 3;
                fromLargeToSmall = 4;
                fromSmallToSink = 5;
                fromLargeToSink = 6;
            } else {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в маленькую ёмкость");
                System.out.println("2. Налить из большой ёмкости в маленькую");
                System.out.println("3. Вылить из маленькой ёмкости в раковину");
                System.out.println("4. Вылить из большой ёмкости в раковину");
                fromPipeToSmall = 1;
                fromLargeToSmall = 2;
                fromSmallToSink = 3;
                fromLargeToSink = 4;
                maxAction = 4;
            }
        } else {
            if (large == 0) {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в большую ёмкость");
                System.out.println("2. Налить из маленькой ёмкости в большую");
                System.out.println("3. Вылить из маленькой ёмкости в раковину");
                fromPipeToLarge = 1;
                fromSmallToLarge = 2;
                fromSmallToSink = 3;
                maxAction = 3;
            } else if (large < maxLarge) {
                System.out.println("Введите номер действия:");
                System.out.println("1. Налить из крана в большую ёмкость");
                System.out.println("2. Налить из маленькой ёмкости в большую");
                System.out.println("3. Вылить из маленькой ёмкости в раковину");
                System.out.println("4. Вылить из большой ёмкости в раковину");
                fromPipeToLarge = 1;
                fromSmallToLarge = 2;
                fromSmallToSink = 3;
                fromLargeToSink = 4;
                maxAction = 4;
            } else {
                System.out.println("Введите номер действия:");
                System.out.println("1. Вылить из маленькой ёмкости в раковину");
                System.out.println("2. Вылить из большой ёмкости в раковину");
                fromSmallToSink = 1;
                fromLargeToSink = 2;
                maxAction = 2;
            }
        }
        System.out.println("Выбрано действие: " + action);
        if (action < 0 || action > maxAction) {
            System.out.println("Номер действия должен быть цифрой от 1 до " + maxAction + " включительно");
        } else if (action == fromPipeToSmall) {
            resultSmall = maxSmall;
        } else if (action == fromPipeToLarge) {
            resultLarge = maxLarge;
        } else if (action == fromSmallToLarge) {
            int largeDeficit = maxLarge - large;
            if (small < largeDeficit) {
                resultSmall = 0;
                resultLarge = large + small;
            } else {
                resultSmall = small - largeDeficit;
                resultLarge = maxLarge;
            }
        } else if (action == fromLargeToSmall) {
            int smallDeficit = maxSmall - small;
            if (large < smallDeficit) {
                resultLarge = 0;
                resultSmall = small + large;
            } else {
                resultSmall = maxSmall;
                resultLarge = large - smallDeficit;
            }
        } else if (action == fromSmallToSink) {
            resultSmall = 0;
        } else if (action == fromLargeToSink) {
            resultLarge = 0;
        }
        System.out.printf("Стало: в маленькой %d из %d, в большой %d из %d\n", resultSmall, maxSmall, resultLarge, maxLarge);
    }
}
