/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab12Task7649 {
    public static void main(String[] args) {
        Step8495();
        Step1315();
        Step2475();
        Step5951();
        Step8696();

        Step3762();
        Step2324();
        Step3550();
        Step6572();
        Step2084();

        Step5411();
        Step8518();
        Step7585();
        Step8770();
        Step7035();

        Step5694();
        Step6806();
        Step7369();
    }

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

    private static void Step8770() {
        System.out.println();
        System.out.println("8770");
        int[] in8770 = {30, 37, 40, 8, 100};
        String[] out8770 = {
                "30+\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37+\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40+\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n"
        };
        for (int i = 0; i < in8770.length; i++){
            StringBuilder result = Lab06.task8770(new StringBuilder(), in8770[i]);
            if (out8770[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }
    }

    private static void Step7035(){
        System.out.println();
        System.out.println("7035");
        String[] in7035 = {
            "6 5 7 8 3 4 1",
            "1 2 3 4 5 6",
            "3 4 1 2 3 4 1 2 3 1 2",
            "4 2 3 4 3 2",
            "4 4 4 4 4 3 8 9",
            "4 4 4 4",
            "4 3"
        };
        int[] out7035 = {1, 1, 1, 2, 3, 4, 3};
        for (int i = 0; i < in7035.length; i++) {
            String result = Lab07.task7035(in7035[i]);
            System.out.printf("%s (%s)\n\n", result, out7035[i]);
        }
    }

    private static void Step8518() {
        System.out.println();
        System.out.println("8518");
        String out8518 = "a+\nb\nc\nd\ne\nf\ng\nh\n\n" +
            "a\nb\nc\nd+\ne\nf\ng\nh\n\n" +
            "a\nb\nc\nd\ne\nf\ng\nh+\n\n" +
            "a\nb\nc\nd\ne\nf\ng\nh\n\n";
        StringBuilder sb = new StringBuilder();
        Lab05.task8518(sb, "a").append("\n");
        Lab05.task8518(sb, "d").append("\n");
        Lab05.task8518(sb, "h").append("\n");
        Lab05.task8518(sb, "i").append("\n");
        if (out8518.equals(sb.toString())){
            System.out.println("Задача решена верно");
        } else {
            sb.insert(0, "Неверно. Результат:\n");
            System.out.println(sb.toString());
        }
    }

    private static void Step7585() {
        System.out.println();
        System.out.println("7585");
        int[] in7585 = {10, 15, 20, 9, 21};
        String[] out7585 = {
                "10+\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15+\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20+\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n"
        };
        for (int i = 0; i < in7585.length; i++){
            StringBuilder result = Lab06.task7585(new StringBuilder(), in7585[i]);
            if (out7585[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result);
            }
        }
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

    private static void Step6806() {
        System.out.println();
        System.out.println("6806");
        int[] in6806 = {10, 15, 20, 9, 23};
        String[] out6806 = {
                "11\n13\n17\n19\n10+\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15+\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20+\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n"
        };
        for (int i = 0; i < in6806.length; i++) {
            StringBuilder result = Lab07.task6806(new StringBuilder(), in6806[i]);
            if (out6806[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }
    }

    private static void Step5694() {
        System.out.println();
        System.out.println("5694");
        String[] in5694 = {"a", "d", "h", "i", "z"};
        String[] out5694 = {
            "a+\nb\nc\nd\ne\nf\ng\nh\n",
            "a\nb\nc\nd+\ne\nf\ng\nh\n",
            "a\nb\nc\nd\ne\nf\ng\nh+\n",
            "a\nb\nc\nd\ne\nf\ng\nh\n",
            "a\nb\nc\nd\ne\nf\ng\nh\n"
        };
        for (int i = 0; i < in5694.length; i++) {
            StringBuilder result = Lab07.task5694(new StringBuilder(), in5694[i]);
            if (out5694[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }
    }

    static void Step7369() {
        System.out.println();
        System.out.println("7369");
        String[] in7369top = {
            "q a z w s x",
            "e d c",
            "a a a a",
            "r f v",
            ""
        };
        String[] in7369left = {
            "q w e",
            "a s d f g h j",
            "a a a a",
            "",
            "z x c v"
        };
        for (int i = 0; i < in7369left.length; i++){
            String result = Lab07.task7369(in7369left[i], in7369top[i]);
            System.out.println(result);
        }
    }

    private static void Step5951() {
        System.out.println();
        System.out.println("5951");
        System.out.println(Lab06.task5951());
    }
}
