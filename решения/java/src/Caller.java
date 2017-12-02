/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        Step1703();
    }

    private static void Step1186(){
        System.out.println();
        System.out.println("1186");
        System.out.println();
        double[] in1186x = {6.35, 4.71, 19.99, -2.28, -18.71, 3.44, -0.09};
        double[] in1186y = {2.7, 5.59, -9.57, 16.92, -7.6, -14.98, -16.6};
        double[] in1186z = {5.08, -18.55, 12.75, 6.14, 6.27, -8.26, -1.84};
        double[] result1186;
        for (int i = 0; i < in1186x.length; i++){
            result1186 = Lab05.task1186(in1186x[i], in1186y[i], in1186z[i]);
            for (double aResult : result1186) {
                System.out.printf("%.4f;\t", aResult);
            }
            System.out.println();
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
                String result = Lab07.task1703(in1703[i]);
                System.out.println("Получилось: " + result);
                System.out.println("Ожидалось : " + out1703[i]);
            } catch (Exception e) {
                System.out.println("Получилось: " + e.getMessage());
                System.out.println("Ожидалось : " + out1703[i]);
            }
            System.out.println();
        }
    }
}
