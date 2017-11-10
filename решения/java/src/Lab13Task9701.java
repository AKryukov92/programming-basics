/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab13Task9701 {
    public static void main(String[] args) {
        Step9020();
        Step7237();
        Step3943();
        Step8873();
        Step2624();

        Step1346();
        Step5871();
        Step3591();
        Step9298();
        Step3354();

        Step5201();
        Step2981();
        Step4312();
        Step8833();
        Step1934();

        Step7619();
        Step9130();
        Step2461();
        Step7799();
        Step2802();

        Step9180();
        Step1544();
        Step9631();
        Step9812();
        Step5728();

        Step5923();
        Step9116();
        Step1618();
        Step7937();
        Step4845();

        Step7222();
        Step2166();
        Step5894();
        Step4425();
        Step7290();

        Step8769();
    }

    private static void Step3591() {
        System.out.println();
        System.out.println("3591");
        int[] in3591 = {0,200,6857, -500};
        double[] out3591 = {0, 1606.2378, 11580.2569, -1};
        for(int i = 0; i < in3591.length; i++){
            try {
                double result = Lab02.task3591(in3591[i]);
                System.out.printf("%.6f (%.6f)\n",result, out3591[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5871() {
        System.out.println();
        System.out.println("5871");
        double[] in5871 = { 6911, 5, 6, 2, 0, -4};
        double[] outs5871 = { 1.0, 0.707107, 0.881127, -1, -1, -1 };
        for (int i = 0; i < in5871.length; i++){
            try {
                double result = Lab02.task5871(in5871[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5871[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2624() {
        System.out.println();
        System.out.println("2624");
        int[] in2624a = {11, 6991, 3, -6959, 0, 1};
        int[] in2624b = {13, 6983, 11, 6949, 0, 2};
        int[] in2624c = {17, 6977, -241, 6947, 0, -3};
        int[] in2624x = {19, 6961, 1, 6917, 0, 1};
        double[] outs2624 = {0.0154, 0.0, 0, 0, 0, 0};
        for (int i = 0; i < in2624a.length; i++){
            try {
                double result = Lab02.task2624(
                        in2624a[i], in2624b[i],
                        in2624c[i], in2624x[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2624[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step1346(){
        System.out.println();
        System.out.println("1346");
        int[] in1346v = new int[]{3, 100, 0, 7411, 10, 19, -13};
        int[] in1346t = new int[]{7, 5, 33, 7433, -15, 0, 80};
        int[] in1346a = new int[]{11, -10, 17, 7417, 9, 23, 63};
        double[] out1346 = new double[]{290.5, 375, 9256.5, 204947815919.5, 0, 0, 0};
        for (int i = 0; i < in1346v.length; i++){
            try {
                double result = Lab02.task1346(in1346v[i], in1346t[i], in1346a[i]);
                System.out.printf("%.4f (%.4f)\n", result, out1346[i]);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void Step2461() {
        System.out.println();
        System.out.println("2461");
        int[] in2461a = {11, 7069, 0, 7019};
        int[] in2461b = {3000, 7043, 7043, 7043};
        int[] in2461c = {5, 7039, 7039, 7001};
        int[] in2461d = {7, 7057, 7027, 0};
        double[] outs2461 = {195.8052, 1.9938, 0, 0};
        for (int i = 0; i < in2461a.length; i++){
            try {
                double result = Lab02.task2461(
                        in2461a[i], in2461b[i],
                        in2461c[i], in2461d[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2461[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step9130() {
        System.out.println();
        System.out.println("9130");
        int[] in9130m1 = {3, 7219, 7193, -5, 10};
        int[] in9130m2 = {7, 7213, 7187, 4, 0};
        int[] in9130r = {13, 7207, 0, 10, 15};
        double[] outs9130 = {1.2186, 9.8312, 0, 0, 0};
        for (int i = 0; i < in9130m1.length; i++){
            try {
                double result = Lab02.task9130(
                        in9130m1[i], in9130m2[i], in9130r[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs9130[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step8873() {
        System.out.println();
        System.out.println("8873");
        int[] in8873r1 = { 7331, 3, 15, -11, 0, 7309 };
        int[] in8873r2 = { 7321, 5, -7, 96, 7307, 0 };
        double[] outs8873 = { 0.0003, 0.5333, -0.0762, -0.0805, 0, 0 };
        for (int i = 0; i < in8873r1.length; i++){
            try {
                double result = Lab02.task8873(in8873r1[i], in8873r2[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs8873[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step7619() {
        System.out.println();
        System.out.println("7619");
        int[] in7619v1 = { 31, 0, 6, 17, -13, 67, 10 };
        int[] in7619v2 = { 47, 7, 0, 19, 11, -79, 20 };
        int[] in7619s = { 6833, 6829, 100, 0, 200, 400, -500 };
        double[] outs7619 = { 87.6026, 975.5714, 16.6667, 0, 0, 0, 0 };
        for (int i = 0; i < in7619v1.length;i++){
            try {
                double result = Lab02.task7619(
                        in7619v1[i], in7619v2[i], in7619s[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7619[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step3943() {
        System.out.println();
        System.out.println("3943");
        int[] in3943x = {-5, 7507, 7489, -7481};
        int[] in3943y = {81, 7499, -7487, 7477};
        double[] outs3943 = {-10, -435.7062, 0, 0};
        for (int i = 0; i < in3943x.length; i++){
            try {
                double result = Lab02.task3943(in3943x[i], in3943y[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs3943[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step7237() {
        System.out.println();
        System.out.println("7237");
        double[] in7237 = { 0, 20.5, 691.9, -273.15, -300 };
        double[] outs7237 = { 32, 68.9, 1277.4200, -459.67, 0 };
        for (int i = 0; i < in7237.length; i++){
            try {
                double result = Lab02.task7237(in7237[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7237[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step1934() {
        System.out.println();
        System.out.println("1934");
        int[] in1934a = {6047, -3, 0, 13, 6221};
        int[] in1934b = {-6011, -7, -50, 0, 6373};
        double[] outs1934 = {1240401.6995, -21.0000, 0.0000, 0.0000, 0};
        for (int i = 0; i < in1934a.length; i++){
            try {
                double result = Lab02.task1934(in1934a[i],in1934b[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs1934[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step9020() {
        System.out.println();
        System.out.println("9020");
        int[] in9020 = {0, -9, 61, 60, 62, 7573, 75};
        double[] outs9020 = {23.4307, 25.0998, 0, 3, 0, 0, 0};
        for (int i = 0; i < in9020.length; i++){
            try {
                double result = Lab02.task9020(in9020[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs9020[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step8833() {
        System.out.println();
        System.out.println("8833");
        int[] in8833 = {7606, 9, 0, -7603};
        double[] outs8833 = {87.2124, 3.0000, 0, 0};
        for (int i = 0; i < in8833.length; i++){
            try {
                double result = Lab02.task8833(in8833[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs8833[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step4312() {
        System.out.println();
        System.out.println("4312");
        int[] in4312a = {1,2,0,-2,3};
        int[] in4312h = {1,3,10,1,-4};
        double[] outs4312 = {0.5, 3};
        for (int i = 0; i < in4312a.length; i++){
            try {
                double result = Lab02.task4312(in4312a[i], in4312h[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs4312[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2981() {
        System.out.println();
        System.out.println("2981");
        int[] in2981 = {19, 23, 0, -7};
        double[] outs2981 = {28730.9120, 50965.0104,0,0};
        for (int i = 0; i < in2981.length; i++){
            try {
                double result = Lab02.task2981(in2981[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2981[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5201() {
        System.out.println();
        System.out.println("5201");
        int[] in5201 = {13, 17, 0, -5};
        double[] outs5201 = {81.6814, 106.8142,0,0};
        for (int i = 0; i < in5201.length; i++){
            try {
                double result = Lab02.task5201(in5201[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5201[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step3354() {
        System.out.println();
        System.out.println("3354");
        int[] in3354 = {7, 11, 0, -3};
        int[] outs3354 = {343, 1331, 0, 0};
        for(int i = 0; i < in3354.length; i++){
            try {
                int result = Lab02.task3354(in3354[i]);
                System.out.printf("%d (%d)\n",result, outs3354[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step9298() {
        System.out.println();
        System.out.println("9298");
        int[] in9298 = {1, 5, 0, -2};
        int[] outs9298 = {6, 150, 0, 0};
        for(int i = 0; i < in9298.length; i++){
            try {
                int result = Lab02.task9298(in9298[i]);
                System.out.printf("%d (%d)\n",result, outs9298[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step7799() {
        System.out.println();
        System.out.println("7799");
        int[] in7799mass = {5, 7297, 10, 7, 9, 0};
        int[] in7799a = {45, 30, 90, 91, 100, 30};
        double[] outs7799 = {34.671920, 61972.336135, 0, 0, 0, 0};
        for(int i = 0; i < in7799mass.length; i++){
            try {
                double result = Lab02.task7799(in7799mass[i], in7799a[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7799[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2802() {
        System.out.println();
        System.out.println("2802");
        int[] in2802 = {4, 11, 19, -1, 0};
        double[] out2802 = {2.0833, 3.0198, 3.5477};
        for (int i = 0; i < in2802.length; i++){
            try {
                double result = Lab06.task2802(in2802[i]);
                System.out.printf("%.6f (%.6f)\n", result, out2802[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9180() {
        System.out.println();
        System.out.println("9180");
        int[] in9180 = {-100, 7, 368, 501, -101};
        int[] outs9180 = {120200, 125229, 57722, 0, 0};
        for (int i = 0; i < in9180.length; i++){
            try {
                int result = Lab06.task9180(in9180[i]);
                System.out.printf("%d (%d)\n", result, outs9180[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step1544() {
        System.out.println();
        System.out.println("1544");
        int[] in1544 = {12, 70, 368, 10000, -11, 10001};
        int[] outs1544 = {23, 2430, 67841, 50004945, 0, 0};
        for (int i = 0; i < in1544.length; i++){
            try {
                int result = Lab06.task1544(in1544[i]);
                System.out.printf("%d (%d)\n", result, outs1544[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step1618() {
        System.out.println();
        System.out.println("1618");
        String[] in1618 = {
                "{}",
                "{{}}",
                "{{}}{}",
                "{{}{}}",
                "{{{{}{}}{{}{{}}{}}}{{}{}}}",
                "{",
                "{{}",
                "{{}}{",
                "{{{}}{}{}}{{}{}{}",
                "}",
                "{}}",
                "{{{}{}}}{{}{}}{{}}}"
        };
        for (int i = 0; i < in1618.length; i++) {
            try {
                Lab07.task1618(in1618[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9116() {
        System.out.println();
        System.out.println("9116");
        String[] in9116 = {"\"   12345\"",
                "\"abcdef    \"",
                "\"  xyz  \"",
                "\"  a b  \"",
                "\" pq\"rt \"",
                "asdf\"",
                "\"xyz",
                "p\"w\""
        };
        for (int i = 0; i < in9116.length; i++) {
            try {
                System.out.println(Lab07.task9116(in9116[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step2166() {
        System.out.println();
        System.out.println("2166");
        String[] in2166 = {"cd", "aa", "xy", "abc", "f"};
        for (int i = 0; i < in2166.length; i++) {
            try {
                System.out.println(Lab07.task2166(in2166[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step5923() {
        System.out.println();
        System.out.println("5923");
        int[] in5923a = {5, 6, 0, -1, 9, 5};
        int[] in5923b = {3, 0, 7, 1, 3, -2};
        for (int i = 0; i < in5923a.length; i++) {
            try {
                System.out.println(Lab07.task5923(in5923a[i], in5923b[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step7222() {
        System.out.println();
        System.out.println("7222");
        String[] in7222 = {
            "4607009520018",
            "9785750200641",
            "9785964300694",
            "123456789012",
            "12345678901234567890"
        };
        for (int i = 0; i < in7222.length; i++) {
            try {
                System.out.println(Lab07.task7222(in7222[i]));
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step5728() {
        System.out.println();
        System.out.println("5728");
        String[] in5728a = {"a", "c", "y", "g", "a"};
        String[] in5728b = {"z", "d", "d", "z", "l"};
        for (int i = 0; i < in5728a.length; i++) {
            try {
                System.out.println(Lab07.task5728(in5728a[i], in5728b[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step4845() {
        System.out.println();
        System.out.println("4845");
        int[] in4845a = {0, 5, 7, -1, 20, 5, 7};
        int[] in4845b = {3, 9, 2, 4, 4, -2, 17};
        for (int i = 0; i < in4845a.length; i++) {
            try {
                System.out.println(Lab07.task4845(in4845a[i], in4845b[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9812() {
        System.out.println();
        System.out.println("9812");
        String[] in9812a = {"a", "w", "g", "x"};
        String[] in9812b = {"x", "d", "z", "u"};
        int[] out9812 = {6, 2, 0, 0};
        for (int i = 0; i < in9812a.length; i++) {
            try {
                int result = Lab07.task9812(in9812a[i], in9812b[i]);
                System.out.printf("%d (%d)\n", result, out9812[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9631() {
        System.out.println();
        System.out.println("9631");
        String[] in9631 = {"z", "a", "g"};
        int[] out9631 = {0, 9, 0};
        for (int i = 0; i < in9631.length; i++) {
            try {
                int result = Lab07.task9631(in9631[i]);
                System.out.printf("%d (%d)\n", result, out9631[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step5894() {
        System.out.println();
        System.out.println("5894");
        String[] in5894top = {
            "q a z",
            "qw fg hj ty kl",
            "oiuy hjkl vbmn",
            "a s d f",
            ""
        };
        String[] in5894left = {
            "q w e",
            "qw er ty ui op",
            "asdf ghjk",
            "",
            "zxc vbn"
        };
        for (int i = 0; i < in5894left.length; i++){
            try {
                int result = Lab08.task5894(in5894left[i], in5894top[i]);
                System.out.println("Повторений: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step8769() {
        System.out.println();
        System.out.println("8769");
        int[] in8769p = {1, 8, 1, 0, 0, 1, -1, 5};
        int[] in8769q = {3, 10, 4, 5, 5, 7, 0, 10};
        String[] in8769s = {
                "1 2 3 4 1 2",
                "3 4 4 2 3 4 1 2 3 1 2",
                "11 12 13 5 11 12",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3",
                "1 2 3 4"
        };
        int[] out8769 = {2, 1, 5, 2, 3, 0, 0, 0};
        for (int i = 0; i < in8769p.length; i++) {
            try {
                int result = Lab08.task8769(in8769p[i], in8769q[i], in8769s[i]);
                System.out.printf("%d (%d)\n", result, out8769[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step7290() {
        System.out.println();
        System.out.println("7290");
        int[] in7290b = {3, 2, 0, 4, 7, 1, -5};
        String[] in7290data = {
                "1 1 1 3 4 1",
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "1 1 1 3 4 1",
                "1 2 3"
        };
        int[] out7290 = {4, 4, 6, 2, 0, 0, 0, 0};
        for (int i = 0; i < in7290b.length; i++) {
            try {
                int result = Lab08.task7290(in7290b[i], in7290data[i]);
                System.out.printf("%d (%d)\n", result, out7290[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step4425() {
        System.out.println();
        System.out.println("4425");
        int[] in4425a = {0, 3, 9, 5, -1, 0};
        String[] in4425data = {
                "q w e r",
                "q w e r",
                "q w e r t y u i o p",
                "q w e r",
                "q w e r",
                ""
        };
        String[] out4425 = {"q", "r", "p", "", "", ""};
        for (int i = 0; i < in4425a.length; i++){
            try {
                String result = Lab08.task4425(in4425a[i], in4425data[i]);
                System.out.printf("%s (%s)\n", result, out4425[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step7937() {
        System.out.println();
        System.out.println("7937");
        int[] in7937w = {1721, 2473, 0, 877, 1181, 491};
        int[] in7937h = {661, 449, 1879, 0, 1033, 3533};
        int[] in7937c = {11, 23, 1163, 7, 0, 1297};
        int[] in7937d = {7, 11, 109, 19, 127, 0};
        for (int i = 0; i < in7937w.length; i++){
            try {
                String result = Lab05.task7937(in7937w[i], in7937h[i],
                        in7937c[i], in7937d[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
