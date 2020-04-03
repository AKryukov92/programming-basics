/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        Step1186();
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
}
