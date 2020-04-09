import java.util.Scanner;

/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        Step2523();
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

        task7243(-1, 2);
        task7243(20, 3);
        task7243(1, -4);
        task7243(2, 19);
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
            resultLarge = maxLarge;
        }
        System.out.printf("Было: в маленькой %d из %d, в большой %d из %d\n", small, maxSmall, large, maxLarge);
        System.out.printf("Стало: в маленькой %d из %d, в большой %d из %d\n", resultSmall, maxSmall, resultLarge, maxLarge);
    }

    private static void Step6896() {
        System.out.println();
        System.out.println("6896");
        task6896(5, 8, 1);
        task6896(0, 8, 1);

        task6896(5, 8, 2);
        task6896(5, 0, 2);

        task6896(3, 7, 3);
        task6896(2, 5, 3);

        task6896(2, 6, 4);
        task6896(1, 3, 4);

        task6896(3, 8, 5);
        task6896(0, 8, 5);

        task6896(5, 7, 6);
        task6896(5, 0, 6);

        task6896(-1, 6, 1);
        task6896(20, 6, 1);

        task6896(3, -2, 1);
        task6896(3, 19, 1);

        task6896(3, 4, 0);
        task6896(2, 3, 7);
    }

    private static void task6896(int small, int large, int action) {
        //Пользователь вводит фактический объем в ёмкостях и номер действия. Выполнить действие и написать результат.
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
        System.out.println("Введите номер действия:");
        System.out.println("1. Налить из крана в маленькую ёмкость");
        System.out.println("2. Налить из крана в большую ёмкость");
        System.out.println("3. Налить из маленькой ёмкости в большую");
        System.out.println("4. Налить из большой ёмкости в маленькую");
        System.out.println("5. Вылить из маленькой ёмкости в раковину");
        System.out.println("6. Вылить из большой ёмкости в раковину");
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

    private static void Step9734() {
        task9734(0, 0, 0);
        task9734(0, 0, 1);
        task9734(0, 0, 2);
        task9734(0, 0, 3);

        task9734(0, 6, 1);
        task9734(0, 6, 2);
        task9734(0, 6, 3);
        task9734(0, 6, 4);
        task9734(0, 6, 5);

        task9734(0, 8, 1);
        task9734(0, 8, 2);
        task9734(0, 8, 3);
        task9734(0, 8, 4);

        task9734(2, 0, 1);
        task9734(2, 0, 2);
        task9734(2, 0, 3);
        task9734(2, 0, 4);
        task9734(2, 0, 5);

        task9734(3, 6, 1);
        task9734(3, 6, 2);
        task9734(3, 6, 3);
        task9734(1, 6, 3);
        task9734(3, 6, 4);

        task9734(1, 2, 4);
        task9734(3, 6, 5);
        task9734(3, 6, 6);
        task9734(3, 6, 7);

        task9734(4, 8, 1);
        task9734(4, 8, 2);
        task9734(4, 8, 3);
        task9734(4, 8, 4);
        task9734(4, 8, 5);

        task9734(5, 0, 1);
        task9734(5, 0, 2);
        task9734(5, 0, 3);
        task9734(5, 0, 4);

        task9734(5, 4, 1);
        task9734(5, 2, 2);
        task9734(5, 4, 2);
        task9734(5, 4, 3);
        task9734(5, 4, 4);
        task9734(5, 4, 5);

        task9734(5, 8, 1);
        task9734(5, 8, 2);
        task9734(5, 8, 3);

        task9734(-1, 0, 1);
        task9734(20, 0, 1);
        task9734(0, -2, 1);
        task9734(0, 19, 1);
    }

    private static void task9734(int small, int large, int action) {
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

    private static void Step2523() {
        task2523(new int[] { 1, 2  });
    }

    private static void task2523(int[] actions){
        //Изначально в емкостях 0 жидкости. Путем переливаний нужно добиться, чтобы в одной из них оказалось 4 литра.
        //Пользователь видит список осмысленных действий, которые пронумерованы начиная с 1 с шагом 1.
        //Пользователь вводит числа - номера действий, которые нужно выполнить.
        int small = 0;
        int large = 0;
        int maxSmall = 5;
        int maxLarge = 8;
        Scanner s = new Scanner(System.in);
        boolean previousCorrect = true;
        int maxAction = 6;
        int actionCount = 0;
        int fromPipeToSmall = 0;
        int fromPipeToLarge = 0;
        int fromSmallToLarge = 0;
        int fromLargeToSmall = 0;
        int fromSmallToSink = 0;
        int fromLargeToSink = 0;
        while (small != 4 && large != 4) {
            if (previousCorrect) {
                fromPipeToSmall = 0;
                fromPipeToLarge = 0;
                fromSmallToLarge = 0;
                fromLargeToSmall = 0;
                fromSmallToSink = 0;
                fromLargeToSink = 0;
                if (small == 0) {
                    if (large == 0) {
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
                } else if (small < maxSmall) {
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
            } else {
                previousCorrect = true;
            }
            int action = s.nextInt();
            actionCount++;
            System.out.println("Выбрано действие: " + action);
            if (action < 1 || action > maxAction) {
                previousCorrect = false;
                System.out.println("Номер действия должен быть цифрой от 1 до " + maxAction + " включительно");
                actionCount--;
            } else if (action == fromPipeToSmall) {
                small = maxSmall;
            } else if (action == fromPipeToLarge) {
                large = maxLarge;
            } else if (action == fromSmallToLarge) {
                int largeDeficit = maxLarge - large;
                if (small < largeDeficit) {
                    large = large + small;
                    small = 0;
                } else {
                    small = small - largeDeficit;
                    large = maxLarge;
                }
            } else if (action == fromLargeToSmall) {
                int smallDeficit = maxSmall - small;
                if (large < smallDeficit) {
                    small = small + large;
                    large = 0;
                } else {
                    small = maxSmall;
                    large = large - smallDeficit;
                }
            } else if (action == fromSmallToSink) {
                small = 0;
            } else if (action == fromLargeToSink) {
                large = 0;
            }
            System.out.printf("Стало: в маленькой %d из %d, в большой %d из %d\n", small, maxSmall, large, maxLarge);
        }
        System.out.println("Головоломка решена за " + actionCount + " действий");
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
