/**
 * Created by Александр on 13.07.2017.
 */
public class Lab12Task2354 {
    private static void Step9164() {
        System.out.println();
        System.out.println("9164");
        System.out.printf("%.6f (%.6f)\n", Lab02.task9164(90, 90), 0.0);
        System.out.printf("%.6f (%.6f)\n", Lab02.task9164(90, 0),  1.0);
        System.out.printf("%.6f (%.6f)\n", Lab02.task9164(7559, 7549), -0.2079);
    }

    private static void Step5789() {
        System.out.println();
        System.out.println("5789");
        System.out.printf("%.6f (%.6f)\n", Lab02.task5789(1, 1, 3, 4), 3.6055);
        System.out.printf("%.6f (%.6f)\n", Lab02.task5789(-2, 4, 8, -10), 17.2046);
        System.out.printf("%.6f (%.6f)\n", Lab02.task5789(0, 0, -5, -7), 8.6023);
        System.out.printf("%.6f (%.6f)\n", Lab02.task5789(0, 0, 0, 0), 0.0);
        System.out.printf("%.6f (%.6f)\n", Lab02.task5789(-1, -3, 2, 9), 12.3693);
    }

    private static void Step3832() {
        System.out.println();
        System.out.println("3832");
        System.out.printf("%d (%d)\n", Lab02.task3832(7451, 7433, 7417), 165777911);
        System.out.printf("%d (%d)\n", Lab02.task3832(3, 7, 11), 131);
        System.out.printf("%d (%d)\n", Lab02.task3832(-2, -2029, 0), 4058);
    }

    private static void Step5895() {
        System.out.println();
        System.out.println("5895");
        double result5895 = Lab02.task5895(7109, 7103, 7079);
        System.out.printf("%.6f (%.6f)\n", result5895, 12369.4955);
        System.out.printf("%.6f (%.6f)\n", Lab02.task5895(3, 7, 13), 4.1324);
    }

    private static void Step3558() {
        System.out.println();
        System.out.println("3558");
        System.out.printf("%.6f (%.6f)\n", Lab02.task3558(45, 90), 0.0);
        System.out.printf("%.6f (%.6f)\n", Lab02.task3558(200, 45), -1.3636);
        System.out.printf("%.6f (%.6f)\n", Lab02.task3558(7523, 7517), 1.8148);
    }

    private static void Step4366() {
        System.out.println();
        System.out.println("4366");
        System.out.printf("%.6f (%.6f)\n", Lab02.task4366(7459, 7457), 10547.2048);
        System.out.printf("%.6f (%.6f)\n", Lab02.task4366(-3, -7), 7.6158);
        System.out.printf("%.6f (%.6f)\n", Lab02.task4366(0, 0), 0.0);
    }

    private static void Step5980() {
        System.out.println("5980");
        Lab05.task5980(9);
        Lab05.task5980(13);
        Lab05.task5980(0);
        Lab05.task5980(-7);
        Lab05.task5980(-0.25);
    }

    private static void Step8174() {
        System.out.println();
        System.out.println("8174");
        System.out.printf("%d (%d)\n", Lab05.task8174(-5), 5);
        System.out.printf("%d (%d)\n", Lab05.task8174(-11), 11);
        System.out.printf("%d (%d)\n", Lab05.task8174(7), 7);
        System.out.printf("%d (%d)\n", Lab05.task8174(13), 13);
        System.out.printf("%d (%d)\n", Lab05.task8174(0), 0);
    }

    private static void Step3770() {
        System.out.println();
        System.out.println("3770");
        System.out.printf("%d (%d)\n", Lab05.task3770(1, 2, 3), 3);
        System.out.printf("%d (%d)\n", Lab05.task3770(7, 4, -2), 7);
        System.out.printf("%d (%d)\n", Lab05.task3770(0, 5, -7), 5);
    }

    private static void Step9562() {
        System.out.println();
        System.out.println("9562");
        System.out.printf("%d (%d)\n", Lab06.task9562(15, 27), 273);
        System.out.printf("%d (%d)\n", Lab06.task9562(13, 2), 90);
        System.out.printf("%d (%d)\n", Lab06.task9562(25, 44), 690);
        System.out.printf("%d (%d)\n", Lab06.task9562(80, 100), 1890);
        System.out.printf("%d (%d)\n", Lab06.task9562(3000, 24), 4501224);
    }

    private static void Step6580() {
        System.out.println();
        System.out.println("6580");
        System.out.printf("%d (%d)\n", Lab06.task6580(15, 27), 5915);
        System.out.printf("%d (%d)\n", Lab06.task6580(25, 44), 24470);
        System.out.printf("%d (%d)\n", Lab06.task6580(80, 100), 170870);
        System.out.printf("%d (%d)\n", Lab06.task6580(3000, 24), 9004496176L);
    }

    private static void Step4082() {
        System.out.println();
        System.out.println("4082");
        String[] in4082 = {
                "10 20 100",
                "300 400 100",
                "1000 1000 83 150",
                "1 1 1 1 1 1 1 1 199 90"
        };
        String[] out4082 = {
                "Количество слева: 2, количество справа: 0",
                "Количество слева: 0, количество справа: 2",
                "Количество слева: 1, количество справа: 2",
                "Количество слева: 8, количество справа: 1"};
        for (int i = 0; i < in4082.length; i++) {
            String result = Lab06.task4082(in4082[i]);
            System.out.println(result);
            System.out.println(out4082[i]);
        }
    }

    private static void Step3669() {
        System.out.println();
        System.out.println("3669");
        System.out.printf("%d (%d)\n", Lab06.task3669(8, 13), 1235520);
        System.out.printf("%d (%d)\n", Lab06.task3669(159, 161), 4095840);
        System.out.printf("%d (%d)\n", Lab06.task3669(648, 648), 648);
        System.out.printf("%d (%d)\n", Lab06.task3669(-2, 600), 0);
        System.out.printf("%d (%d)\n", Lab06.task3669(35, 24), 399703747322880000L);
    }

    private static void Step5969() {
        System.out.println();
        System.out.println("5969");
        System.out.printf("%d (%d)\n", Lab06.task5969(8, 13), 0);
        System.out.printf("%d (%d)\n", Lab06.task5969(28, 44),  105);
        System.out.printf("%d (%d)\n", Lab06.task5969(80, 98), 273);
        System.out.printf("%d (%d)\n", Lab06.task5969(3000, 24), 642600);
    }

    private static void Step9925() {
        System.out.println();
        System.out.println("9925");
        int result9925 = Lab08.task9925("один, два, три, четыре, пять");
        System.out.printf("%d (%d)\n", result9925, 5);
        System.out.printf("%d (%d)\n", Lab08.task9925("янв,фев,март"), 3);
        System.out.printf("%d (%d)\n", Lab08.task9925("один"), 1);
    }
}
