/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab12Task7649 {
    private static void Step8495() {
        System.out.println();
        System.out.println("8495");
        StringBuilder sb8495 = new StringBuilder();
        sb8495 = sb8495.append("@");
        sb8495 = Lab06.task8495(sb8495);
        sb8495 = sb8495.append("#");
        System.out.println(sb8495.toString());
    }

    private static void Step1315() {
        System.out.println();
        System.out.println("1315");
        StringBuilder sb1315 = new StringBuilder();
        sb1315.append("@");
        Lab06.task1315(sb1315);
        sb1315.append("#");
        System.out.println(sb1315);
    }

    private static void Step8696() {
        System.out.println();
        System.out.println("8696");
        System.out.println(Lab06.task8696());
    }

    private static void Step3762() {
        System.out.println();
        System.out.println("3762");
        String result3762 = Lab06.task3762(new StringBuilder()).toString();
        System.out.println(result3762);
    }

    private static void Step2475() {
        System.out.println();
        System.out.println("2475");
        System.out.println(Lab06.task2475());
    }

    private static void Step2324(){
        System.out.println();
        System.out.println("2324");
        String[] in2324 = {
            "1 2 3 4 5 0",
            "0",
            "-1 -2 0",
            "1 1 1 1 1 1 1 1 1 1 1 1 0"};
        String[] out2324 = {
            "Сумма чисел: 15, Количество чисел: 6",
            "Сумма чисел: 0, Количество чисел: 1",
            "Сумма чисел: -3, Количество чисел: 3",
            "Сумма чисел: 12, Количество чисел: 13"};
        for (int i = 0; i < in2324.length; i++)
        {
            String result = Lab06.task2324(in2324[i]);
            System.out.printf("#%s\n>%s\n", result, out2324[i]);
        }
    }

    private static void Step3550() {
        System.out.println();
        System.out.println("3550");
        int[] in3550 = {2, 3, -13, 0, 7, 11, 1027};
        for (int i = 0; i < in3550.length; i++) {
            StringBuilder sb3550 = Lab06.task3550(
                    new StringBuilder()
                            .append("@"), in3550[i])
                    .append("#");
            System.out.println(sb3550.toString());
        }
    }

    private static void Step6572() {
        System.out.println();
        System.out.println("6572");
        StringBuilder sb6572 = new StringBuilder();
        Lab06.task6572(sb6572, 8, 13);
        Lab06.task6572(sb6572, 691, 703);
        Lab06.task6572(sb6572, 19, 3);
        System.out.println(sb6572);
    }


    private static void Step8518() {
        System.out.println();
        System.out.println("8518");
        Lab05.task8518("a");
        Lab05.task8518("d");
        Lab05.task8518("h");
        Lab05.task8518("i");
    }

    private static void Step7585() {
        System.out.println();
        System.out.println("7585");
        Lab06.task7486(10);
        Lab06.task7486(15);
        Lab06.task7486(20);
        Lab06.task7486(9);
        Lab06.task7486(21);
    }

    private static void Step5411() {
        System.out.println();
        System.out.println("5411");
        StringBuilder sb = Lab06.task5411(
                Lab06.task5411(
                        Lab06.task5411(new StringBuilder(), 7, 11)
                                .append("\n")
                        , 211, 223).append("\n")
                , 37, 29).append("\n");
        Lab06.task5411(sb, 16, 20).append("\n");
        Lab06.task5411(sb, 9, 0).append("\n");
        Lab06.task5411(sb, 600, 600).append("\n");
        String result5411 = sb.toString();
        System.out.println(result5411);
    }

    private static void Step2084() {
        System.out.println();
        System.out.println("2084");
        String result2084;
        result2084 = Lab06.task2084(new StringBuilder(), 20, 30).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 8, 13)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 571, 580)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 691, 703)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), -71, -90)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 64, 58)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 19, 7)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 401, 390)).append("\n")
                .append(Lab06.task2084(new StringBuilder(), 800, 785)).append("\n")
                .toString();
        System.out.println(result2084);
    }

    private static void Step5951() {
        System.out.println();
        System.out.println("5951");
        System.out.println(Lab06.task5951());
    }
}
