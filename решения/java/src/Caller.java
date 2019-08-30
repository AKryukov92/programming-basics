/**
 * Created by Александр on 13.07.2017.
 */
public class Caller {
    public static void main(String[] args) {
        Step1186();
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
                System.out.printf("%.3f;\t", aResult);
            }
            System.out.println();
        }
    }

    private static void Step6924(){
      System.out.println(Lab02.task6924(-50, -86.6025, 60, 0));
      System.out.println(Lab02.task6924(10, 0, 0, 10));
      System.out.println(Lab02.task6924(11, 13, 7, 17));
      System.out.println(Lab02.task6924(-70.7106, 50, 60, 0));
      System.out.println(Lab02.task6924(-86.6025, 50, 60, 0));
      System.out.println(Lab02.task6924(3, 4, 4, 3));
    }
}
