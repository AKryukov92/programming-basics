/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab13Task3784 {
    public static void main(String[] args) {
        Step1945();
    }

    private static void Step4257(){
        System.out.println();
        System.out.println("4257");
        Lab05.task4257(0.7, 2297);
        Lab05.task4257(0.3, 983);
        Lab05.task4257(0.05, 101);
        Lab05.task4257(-2, 15);
        Lab05.task4257(0, 1133);
        Lab05.task4257(300, -113);
        Lab05.task4257(0.19, 0);
    }

    private static void Step2291(){
        System.out.println();
        System.out.println("2291");
        double[] in2291v1 = { 60.5, 17950, 0, 200, -0.6, 0.1004 };
        double[] in2291v2 = { 16.8, 5000, 10, 0, 0.2, -0.028 };
        for (int i = 0; i < in2291v1.length; i++){
            try {
                String result = Lab05.task2291(in2291v1[i], in2291v2[i]);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step1763() {
        System.out.println();
        System.out.println("1763");
        double[] in1763r = {15, 29, -17, 37};
        double[] in1763a = {31, 41, 23, -5};
        System.out.println(Lab05.task1763(2.3261, 4.1230));
        System.out.println(Lab05.task1763(2.3262, 4.1230));
        System.out.println(Lab05.task1763(2.3263, 4.1230));
        //System.out.println(Lab05.task1763(2.3262, 4.1228));
        System.out.println(Lab05.task1763(2.3262, 4.1229));
        System.out.println(Lab05.task1763(2.3262, 4.1230));
        System.out.println(Lab05.task1763(2.3262, 4.1231));
        System.out.println(Lab05.task1763(2.3262, 4.1232));
//        System.out.println(Lab05.task1763(2.3262, 4.1234));
//        System.out.println(Lab05.task1763(2.3262, 4.1235));
        System.out.println(Lab05.task1763(3, 5.3173));
        for (int i = 0; i < in1763r.length; i++){
            try {
                String result = Lab05.task1763(in1763r[i], in1763a[i]);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step1945() {
        System.out.println();
        System.out.println("1945");
        Lab05.task1945_2(17, 19);
        Lab05.task1945_2(13, 19);
        Lab05.task1945_2(28.2733, 36);
        Lab05.task1945_2(28.2735, 36);
        Lab05.task1945_2(28.2752, 36);
        Lab05.task1945_2(28.2754, 36);
        Lab05.task1945_2(7854, 8100);
        Lab05.task1945_2(5808, 8100);
        Lab05.task1945_2(-20, 4);
        Lab05.task1945_2(300, -200);

//        System.out.println(Lab05.task1945(28.2733, 36));
//        System.out.println(Lab05.task1945(28.2735, 36));
//        System.out.println(Lab05.task1945(28.2752, 36));
//        System.out.println(Lab05.task1945(28.2754, 36));
//        int[] in1945sc = {17, 13, 7854, 5808, -20, 300};
//        int[] in1945ss = {19, 19, 8100, 8100, 4, -200};
//        for (int i = 0; i < in1945sc.length; i++) {
//            try {
//                if (Lab05.task1945(in1945sc[i], in1945ss[i])) {
//                    System.out.println("Круг уместится в квадрате");
//                } else {
//                    System.out.println("Круг не поместится в квадрате");
//                }
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }

    static void Step6291() {
        System.out.println();
        System.out.println("6291");
        int[] in6291a = {13, 21, 29, 61, 211, -151, 193, 101};
        int[] in6291b = {17, 21, 2, 47, 211, 239, -193, 83};
        int[] in6291c = {14, 37, 29, 47, 211, 239, 3, -101};
        for (int i = 0; i < in6291a.length; i++){
            try {
                if (Lab05.task6291(in6291a[i], in6291b[i], in6291c[i])){
                    System.out.print("Треугольник является");
                } else {
                    System.out.print("Треугольник не является");
                }
                System.out.println(" равнобедренным.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step3883() {
        System.out.println();
        System.out.println("3883");
        int[] in3883 = {1234, 9171, 100, 98765};
        for (int i = 0; i < in3883.length; i++){
            try {
                if (Lab05.task3883(in3883[i])){
                    System.out.println("равно");
                } else {
                    System.out.println("не равно");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step4527() {
        System.out.println();
        System.out.println("4527");
        int[] in4527 = {1, 2, 3, 8, -10, 26, 40, 100, -20, 300};
        String[] out4527 = {"1'ый","2'ой","3'ий","8'ой",
                "-10'ый","26'ой","40'ой","100'ый"};
        for (int i = 0; i < in4527.length; i++){
            try {
                String result = Lab05.task4527(in4527[i]);
                if (result.equals(out4527[i])){
                    System.out.println("Задача решена верно");
                } else {
                    System.out.println("Ошибка. Результат:" + result);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step6556() {
        System.out.println();
        System.out.println("6556");
        int[] in6556a = { 3, 7, 2, 13, 23, -2, 3, 13, 6911 };
        int[] in6556b = { 5, 1, 13, 11, 3, 8, -4, 15, 5881 };
        int[] in6556c = { 7, 11, 5, 7, 9, 9, 5, -17, 3203 };
        int[] in6556d = { 9, 3, 19, 19, 11, 7, 6, 19, -4639 };
        for (int i = 0; i < in6556a.length; i++){
            try {
                if (Lab05.task6556(in6556a[i], in6556b[i],
                        in6556c[i], in6556d[i])){
                    System.out.println("Размещение возможно");
                } else {
                    System.out.println("Размещение невозможно");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step2153() {
        System.out.println();
        System.out.println("2153");
        int[] in2153t = {0, 1, 2, 3, 4, 5, 13, 59, 60, 61};
        for (int i = 0; i < in2153t.length; i++){
            try {
                if (Lab05.task2153(in2153t[i])){
                    System.out.println("Зеленый");
                } else {
                    System.out.println("Красный");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5170() {
        System.out.println();
        System.out.println("5170");
        int[] in5170 = {6, 3219, 7, 2017, -10};
        for (int i = 0; i < in5170.length; i++){
            try {
                if (Lab06.task5170(in5170[i])) {
                    System.out.println("Число простое");
                } else {
                    System.out.println("Число не простое");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step1703(){
        System.out.println();
        System.out.println("1703");
        String[] in1703 = {
                "x>3",
                "r >= 1000",
                "value <=-2",
                "y < 0",
                "x <",
                ">13",
                "y   0",
                "x+7",
                "a < b < c",
                "x < xA && x + w > xA",
                "x > y > z",
                "a x < 17",
                "y > 19 23"
        };
        String[] out1703 = {
                "Значение переменной x больше числа 3",
                "Значение переменной r больше либо равно числу 1000",
                "Значение переменной value меньше либо равно числу -2",
                "Значение переменной y меньше числа 0",
                "Справа от знака сравнения ожидается ограничение",
                "Слева от знака сравнения ожидается переменная",
                "Отсутствует знак сравнения",
                "Отсутствует знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "Неожиданное выражение \"a\" слева от переменной \"x\"",
                "Неожиданное выражение \"23\" справа от ограничения \"19\""
        };
        for (int i = 0; i < in1703.length; i++){
            try {
                String result = Lab08.task1703(in1703[i]);
                System.out.println("Получилось: " + result);
                System.out.println("Ожидалось : " + out1703[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Получилось: " + e.getMessage());
                System.out.println("Ожидалось : " + out1703[i]);
            }
            System.out.println();
        }
    }
}
