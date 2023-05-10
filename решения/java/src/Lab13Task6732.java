/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab13Task6732 {
    private static void Step1862() {
        System.out.println();
        System.out.println("1862");
        String[] in1862s1 = {"#", "?", "*", "=", "o", "!"};
        String[] in1862s2 = {"0", "-", "!", "+", "T", "."};
        int[] in1862w = {5, 7, 90, 0, -2, 20};
        int[] in1862h = {3, 10, 0, 15, 8, -6};
        String[] out1862 = {
            "#0#0#\n#0#0#\n#0#0#\n",
            "?-?-?-?\n?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                    "?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                    "?-?-?-?\n?-?-?-?\n?-?-?-?\n",
            "",
            "",
            "ожидается исключение",
            "ожидается исключение"
        };
        for (int i = 0; i < in1862s1.length; i++){
            try {
                StringBuilder result = Lab06.task1862(new StringBuilder(),
                        in1862s1[i], in1862s2[i], in1862w[i], in1862h[i]);
                if (out1862[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5171() {
        System.out.println();
        System.out.println("5171");
        String[] in5171s1 = {"#", "?", "*", "=", "o", "!"};
        String[] in5171s2 = {"0", "-", "!", "+", "T", "."};
        int[] in5171w = {5, 7, 90, 0, -2, 20};
        int[] in5171h = {3, 10, 0, 15, 8, -6};
        String[] out5171 = {
                "#####\n00000\n#####\n",
                "???????\n-------\n???????\n-------\n" +
                        "???????\n-------\n???????\n" +
                        "-------\n???????\n-------\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in5171w.length; i++){
            try {
                StringBuilder result = Lab06.task5171(new StringBuilder(),
                        in5171s1[i],in5171s2[i],in5171w[i],in5171h[i]);
                if (out5171[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5238() {
        System.out.println();
        System.out.println("5238");
        int[] in5238w = {5, 4, 3, 0, 7, -11, 29};
        int[] in5238h = {5, 5, 5, 5, 0, 4, -2};
        for (int i = 0; i < in5238w.length; i++){
            try {
                StringBuilder result = Lab06.task5238(new StringBuilder(),
                        in5238w[i], in5238h[i]);
                System.out.println(result.toString());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5448() {
        System.out.println();
        System.out.println("5448");
        String[] in5448s = {"#", "\\", "^", "*", "56"};
        int[] in5448h = {6, 3, 0, -2, -3};
        for (int i = 0; i < in5448s.length; i++){
            try {
                StringBuilder result = Lab06.task5448(new StringBuilder(),
                        in5448s[i], in5448h[i]);
                System.out.println(result.toString());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step7517() {
        System.out.println();
        System.out.println("7517");
        int[] in7517w = {1, 7, 5, 0, 23, -3, 7};
        int[] in7517h = {1, 3, 5, 17, 0, 11, -7};
        String[] out7517 = {
                " 0\n0 |\n -",
                " 0123456\n0       |\n1       |\n2       |\n -------",
                " 01234\n0     |\n1     |\n2     |\n3     |\n" +
                        "4     |\n -----",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in7517w.length; i++){
            try {
                StringBuilder result = Lab06.task7517(new StringBuilder(),
                        in7517w[i], in7517h[i]);
                if (out7517[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step4075() {
        System.out.println();
        System.out.println("4075");
        int[] in4075 = {5, 15, 0, -2};
        for (int i = 0; i < in4075.length; i++){
            try {
                StringBuilder result = Lab06.task4075(
                        new StringBuilder(), in4075[i]);
                System.out.println(result.toString());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2592() {
        System.out.println();
        System.out.println("2592");
        String[] in2592s = {"#", "?", "*", "=", "o", "!"};
        int[] in2592w = {5, 7, 90, 0, -2, 20};
        int[] in2592h = {3, 10, 0, 15, 8, -6};
        String[] out2592 = {
                "#####\n#####\n#####\n",
                "???????\n???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in2592s.length; i++){
            try {
                StringBuilder result = Lab06.task2592(
                        new StringBuilder(),
                        in2592s[i],
                        in2592w[i],
                        in2592h[i]);
                if (out2592[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step4236() {
        System.out.println();
        System.out.println("4236");
        int[] in4236 = {3, 12, 15, -1, 16};
        for (int i = 0; i < in4236.length; i++){
            try {
                StringBuilder result = Lab06.task4236(
                        new StringBuilder(), in4236[i]);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static void Step4996(){
        System.out.println();
        System.out.println("4996");
        String[] in4996 = {
                "Добрый день",
                "Передавайте медленнее",
                "Я ничего не понимаю",
                "Помогите",
                "На нас едет Sturmpanzerwagen",
                "Координаты цели 13 и 90",
                "Промах",
                "Попал",
                "Конец связи"
        };
        for (int i = 0; i < in4996.length; i++){
            System.out.println(Lab08.task4996(in4996[i]));
        }
    }

    private static void Step2234(){
        System.out.println();
        System.out.println("2234");
        String[] in2234 = {
            "-.. --- -... .-. -.-- .--- -.. . -. ..-..",
            ".--. . .-. . -.. .- .-- .- .--- - . -- . -.. .-.. . -. -. . .",
            ".-.- -. .. ---. . --. --- -. . .--. --- -. .. -- .- ..--",
            ".--. --- -- --- --. .. - .",
            "-. .- -. .- ... . -.. . - ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--..",
            "-.- --- --- .-. -.. .. -. .- - -.-- -.-. . .-.. .. .---- ...-- .. ----. -----",
            ".--. .-. --- -- .- ....",
            ".--. --- .--. .- .-..",
            "-.- --- -. . -.-. ... .-- .-.- --.. .."
        };
        for (int i = 0; i < in2234.length; i++){
            System.out.println(Lab08.task2234(in2234[i]));
        }
    }
}
