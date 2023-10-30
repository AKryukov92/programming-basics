/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab13Task9701 {
    public static void main(String[] args) {
    }

    private static void Step5871() {
        System.out.println();
        System.out.println("5871");
        double[] in5871 = {6911, 5, 6, 2, 0, -4};
        double[] outs5871 = {1.0, 0.707107, 0.881127, -1, -1, -1};
        for (int i = 0; i < in5871.length; i++) {
            try {
                double result = Lab02.task5871(in5871[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5871[i]);
            } catch (IllegalArgumentException e) {
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
        for (int i = 0; i < in2624a.length; i++) {
            try {
                double result = Lab02.task2624(
                        in2624a[i], in2624b[i],
                        in2624c[i], in2624x[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2624[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step1346() {
        System.out.println();
        System.out.println("1346");
        int[] in1346v = new int[]{3, 100, 0, 7411, 10, 19, -13};
        int[] in1346t = new int[]{7, 5, 33, 7433, -15, 0, 80};
        int[] in1346a = new int[]{11, -10, 17, 7417, 9, 23, 63};
        double[] out1346 = new double[]{290.5, 375, 9256.5, 204947815919.5, 0, 0, 0};
        for (int i = 0; i < in1346v.length; i++) {
            try {
                double result = Lab02.task1346(in1346v[i], in1346t[i], in1346a[i]);
                System.out.printf("%.4f (%.4f)\n", result, out1346[i]);
            } catch (IllegalArgumentException ex) {
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
        for (int i = 0; i < in2461a.length; i++) {
            try {
                double result = Lab02.task2461(
                        in2461a[i], in2461b[i],
                        in2461c[i], in2461d[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2461[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step9130() {
        System.out.println();
        System.out.println("9130");
        Lab02.task9130(5.972E24, 10000, 6371);
        Lab02.task9130(6.39E23, 10000, 3396.2);
        Lab02.task9130(6.39E23, 15000, 3396.2);
        Lab02.task9130(6.39E23, 10000, -20000);
        Lab02.task9130(6.39E23, -2000, 3396.2);
        Lab02.task9130(-6.39E23, 10000, 3396.2);
    }

    private static void Step8873() {
        System.out.println();
        System.out.println("8873");
        int[] in8873r1 = {7331, 3, 15, -11, 0, 7309};
        int[] in8873r2 = {7321, 5, -7, 96, 7307, 0};
        double[] outs8873 = {0.0003, 0.5333, -0.0762, -0.0805, 0, 0};
        for (int i = 0; i < in8873r1.length; i++) {
            try {
                double result = Lab02.task8873(in8873r1[i], in8873r2[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs8873[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step4312() {
        System.out.println();
        System.out.println("4312");
        int[] in4312a = {1, 2, 0, -2, 3};
        int[] in4312h = {1, 3, 10, 1, -4};
        double[] outs4312 = {0.5, 3};
        for (int i = 0; i < in4312a.length; i++) {
            try {
                double result = Lab02.task4312(in4312a[i], in4312h[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs4312[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2981() {
        System.out.println();
        System.out.println("2981");
        int[] in2981 = {19, 23, 0, -7};
        double[] outs2981 = {28730.9120, 50965.0104, 0, 0};
        for (int i = 0; i < in2981.length; i++) {
            try {
                double result = Lab02.task2981(in2981[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2981[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step5201() {
        System.out.println();
        System.out.println("5201");
        int[] in5201 = {13, 17, 0, -5};
        double[] outs5201 = {81.6814, 106.8142, 0, 0};
        for (int i = 0; i < in5201.length; i++) {
            try {
                double result = Lab02.task5201(in5201[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5201[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step3354() {
        System.out.println();
        System.out.println("3354");
        int[] in3354 = {7, 11, 0, -3};
        int[] outs3354 = {343, 1331, 0, 0};
        for (int i = 0; i < in3354.length; i++) {
            try {
                int result = Lab02.task3354(in3354[i]);
                System.out.printf("%d (%d)\n", result, outs3354[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void Step2802() {
        System.out.println();
        System.out.println("2802");
        int[] in2802 = {4, 11, 19, -1, 0};
        double[] out2802 = {2.0833, 3.0198, 3.5477};
        for (int i = 0; i < in2802.length; i++) {
            try {
                double result = Lab06.task2802(in2802[i]);
                System.out.printf("%.6f (%.6f)\n", result, out2802[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9180() {
        System.out.println();
        System.out.println("9180");
        int[] in9180 = {-100, 7, 368, 501, -101};
        int[] outs9180 = {120200, 125229, 57722, 0, 0};
        for (int i = 0; i < in9180.length; i++) {
            try {
                int result = Lab06.task9180(in9180[i]);
                System.out.printf("%d (%d)\n", result, outs9180[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step1544() {
        System.out.println();
        System.out.println("1544");
        int[] in1544 = {12, 70, 368, 10000, -11, 10001};
        int[] outs1544 = {23, 2430, 67841, 50004945, 0, 0};
        for (int i = 0; i < in1544.length; i++) {
            try {
                int result = Lab06.task1544(in1544[i]);
                System.out.printf("%d (%d)\n", result, outs1544[i]);
            } catch (IllegalArgumentException e) {
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
                Lab08.task1618(in1618[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step8887(){
        System.out.println();
        System.out.println("8887");
        String[] in8887 = {
                "a = Math.Sqrt(x);",
                "a = Math.Pow(a, n);",
                "result = String.Format(\"{0} шт и {1} см\", amount, remainder);",
                "str = Console.ReadLine();",
                "Console.WriteLine();",
                "result = 3 * Math.Sin(2*aRad) * Math.Cos(3*bRad);",
                "r = 3 * Math.Sqrt(61-x);",
                "y = x+7;",
                "last = arr.Length;",
                "idx = \"abcdacadbacdaabaadc\".IndexOf(\"cd\";",
                "a = raw.Trim());",
                "answer = -5 * Math.Sqrt(x + Math.Sqrt(y));",
                "distance = Math.Sqrt(Math.Pow(xb - xa, 2) + Math.Pow(yb - ya, 2));",
                "result = Math.Sqrt(Math.Pow(x, 2 + Math.Pow(y, 2));",
                "result = Math.Sqrt(1-Math.Pow(Math.Sin(xRad), 2)));"
        };
        for (int i = 0; i < in8887.length; i++){
            try {
                Lab08.task8887(in8887[i]);
            } catch (IllegalArgumentException e){
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
                System.out.println(Lab08.task9116(in9116[i]));
            } catch (IllegalArgumentException e) {
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
                int result = Lab08.task9812(in9812a[i], in9812b[i]);
                System.out.printf("%d (%d)\n", result, out9812[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step9631() {
        System.out.println();
        System.out.println("9631");
        Lab08.task9631("z");
        Lab08.task9631("a");
        Lab08.task9631("g");
        Lab08.task9631("abcd");
        Lab08.task9631("wxyz");
    }

    static void Step5873() {
        Lab07.task5873("as df gh jk", 1);
        Lab07.task5873("a s d f g h j k", 3);
        Lab07.task5873("as df gh jk", 0);
        Lab07.task5873("as df gh jk", 3);
        Lab07.task5873("asdf ghjk", 0);
        Lab07.task5873("single", 0);
        Lab07.task5873("as fg gh jk", -1);
        Lab07.task5873("", 0);
    }

    static void Step1433(){
        System.out.println();
        System.out.println("1433");
        Lab07.task1433_2("q;w;e");
        Lab07.task1433_2("q;w;e;r");
        Lab07.task1433_2("q;w;e;r;t;y;u;i;o");
        Lab07.task1433_2("q;w;e;r;t;y;u;i;o;p");
        Lab07.task1433_2("q");
        Lab07.task1433_2("");
        /*
        String[] in1433in = {
                "q;w;e",
                "q;w;e;r",
                "q;w;e;r;t;y;u;i;o",
                "q;w;e;r;t;y;u;i;o;p",
                "q",
                ""
        };
        String[] out1433 = {"w","w","t","t","q", ""};
        for (int i = 0; i < in1433in.length; i++){
            try {
                String result = Lab07.task1433(in1433in[i]);
                System.out.printf("%s (%s)\n", result, out1433[i]);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }*/
    }

    static void Step7937() {
        System.out.println();
        System.out.println("7937");
        int[] in7937w = {1721, 2473, 0, 877, 1181, 491};
        int[] in7937h = {661, 449, 1879, 0, 1033, 3533};
        int[] in7937c = {11, 23, 1163, 7, 0, 1297};
        int[] in7937d = {7, 11, 109, 19, 127, 0};
        for (int i = 0; i < in7937w.length; i++) {
            try {
                String result = Lab05.task7937(in7937w[i], in7937h[i],
                        in7937c[i], in7937d[i]);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void Step3095(){
        System.out.println();
        System.out.println("3095");
        String[] in3095 = {
                "q,w,e,r",
                "as,df,gh",
                "zx,cv",
                "p,o,o,t,p",
                ""
        };
        for (int i = 0; i < in3095.length; i++){
            try {
                System.out.println(Lab07.task3095(in3095[i]));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
