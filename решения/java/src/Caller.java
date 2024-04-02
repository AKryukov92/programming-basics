import java.util.Scanner;

/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        Step2523();
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
}
