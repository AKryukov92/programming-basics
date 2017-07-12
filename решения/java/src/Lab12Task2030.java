/**
 * Created by Александр on 13.07.2017.
 */
public class Lab12Task2030 {
    public static void main(String[] args) {
        Step8878();
        Step8715();
        Step4847();
        Step1999();
        Step4042();

        Step6351();
        Step5382();
        Step7088();
        Step7250();
        Step6740();

        Step9038();
        Step4515();
    }

    private static void Step8878(){
        System.out.println();
        System.out.println("8878");
        int[] in8878a = {5, 11, -2, -13};
        int[] in8878b = {6, 7, 3, -18};
        for (int i = 0; i < in8878a.length; i++){
            if (Lab05.task8878(in8878a[i], in8878b[i])){
                System.out.println("Второе");
            } else {
                System.out.println("Первое");
            }
        }
    }

    private static void Step8715(){
        System.out.println();
        System.out.println("8715");
        int[] in8718a = {1, -4, 7, 0, 4, -2, 10, 5};
        int[] in8718b = {2, 0, 4, 5, 4, 4, 3, 1};
        int[] in8718c = {3, 5, -2, -7, 4, 3, 5, 7};
        for (int i = 0; i < in8718a.length; i++){
            if (Lab05.task8715(in8718a[i], in8718b[i], in8718c[i])){
                System.out.println("Выполняется");
            } else {
                System.out.println("Не выполняется");
            }
        }
    }

    private static void Step4847(){
        System.out.println();
        System.out.println("4847");
        int[] in4847x = {31, 19, 7, 67, 1};
        int[] in4847y = {59, 19, 11, -67, 1};
        int[] in4847z = {83, 41, 11, 67, 1};
        for (int i = 0; i < in4847x.length; i++){
            if (Lab05.task4847(in4847x[i], in4847y[i], in4847z[i])){
                System.out.println("Среди чисел есть равные");
            } else {
                System.out.println("Числа не равны друг другу");
            }
        }
    }

    private static void Step1999(){
        System.out.println();
        System.out.println("1999");
        int[] in1999x = {-3, -2, -1, -3, -2, -1, -3, -2, -1};
        int[] in1999y = {2, 2, 2, 1, 1, 1, 0, 0, 0};
        for (int i = 0; i < in1999x.length; i++){
            System.out.print("{" + in1999x[i] + ";" + in1999y[i]);
            if (Lab05.task1999(in1999x[i], in1999y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step4042(){
        System.out.println();
        System.out.println("4042");
        double[] in4042x = {2, 1, 0, -1, -2};
        double[] in4042y = {2, 1.5, 0, -2, -3};
        for (int i = 0; i < in4042x.length; i++){
            System.out.print("{" + in4042x[i] + ";" + in4042y[i]);
            if (Lab05.task4042(in4042x[i], in4042y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step6351(){
        System.out.println();
        System.out.println("6351");
        double[] in6351x = {0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3};
        double[] in6351y = {5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2};
        for (int i = 0; i < in6351x.length; i++){
            System.out.print("{" + in6351x[i] + ";" + in6351y[i]);
            if (Lab05.task6351(in6351x[i], in6351y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step5382(){
        System.out.println();
        System.out.println("5382");
        double[] in5382x = {5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0};
        double[] in5382y = {5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        for (int i = 0; i < in5382x.length; i++){
            System.out.print("{" + in5382x[i] + ";" + in5382y[i]);
            if (Lab05.task5382(in5382x[i], in5382y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step7088(){
        System.out.println();
        System.out.println("7088");
        double[] in7088x = {0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1,
                1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5};
        double[] in7088y = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, -0.5, -0.5,
                -0.5, -0.5, -0.5, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2};
        for (int i = 0; i < in7088x.length; i++){
            System.out.print("{" + in7088x[i] + ";" + in7088y[i]);
            if (Lab05.task7088(in7088x[i], in7088y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step7250(){
        System.out.println();
        System.out.println("7250");
        double[] in7250x = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        double[] in7250y = {2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2};
        for (int i = 0; i < in7250x.length; i++){
            System.out.print("{" + in7250x[i] + ";" + in7250y[i]);
            if (Lab05.task7250(in7250x[i], in7250y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step6740(){
        System.out.println();
        System.out.println("6740");
        double[] in6740x = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
        double[] in6740y = {0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1.5, -1.5, -1.5, -1.5, -1.5, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3};
        for (int i = 0; i < in6740x.length; i++){
            System.out.print("{" + in6740x[i] + ";" + in6740y[i]);
            if (Lab05.task6740(in6740x[i], in6740y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step9038(){
        System.out.println();
        System.out.println("9038");
        double[] in9038x = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        double[] in9038y = {2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0};
        for (int i = 0; i < in9038x.length; i++){
            System.out.print("{" + in9038x[i] + ";" + in9038y[i]);
            if (Lab05.task9038(in9038x[i], in9038y[i])){
                System.out.println("} принадлежит области");
            } else {
                System.out.println("} не принадлежит области");
            }
        }
    }

    private static void Step4515(){
        System.out.println();
        System.out.println("4515");
        String[] in4515 = {
                "9 8 7 6 5",
                "4 3 2 1 5 6 7 8 9 0",
                "1 2 3 1"
        };
        for (int i = 0; i < in4515.length; i++) {
            if (Lab08.task4515(in4515[i])) {
                System.out.println("Повторения есть");
            } else {
                System.out.println("Повторений нет");
            }
        }
    }
}
