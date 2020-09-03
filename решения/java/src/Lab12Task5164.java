/**
 * @author akryukov
 *         13.07.2017
 */
public class Lab12Task5164 {

    public static void main(String[] args) {
        Step1860();
        Step7472();
        Step3862();

        Step9231();
        Step8624();
        Step2959();
        Step7271();
        Step2632();

        Step4343();
        Step7474();
    }

    static void Step4343() {
        System.out.println();
        System.out.println("4343");
        Lab01.task4343("test", "pass", "localhost", "5432", "my_db");
        Lab01.task4343(
            "admin",
            "7e8efd48d69c",
            "production-node1",
            "5432",
            "bank");
        Lab01.task4343("akryukov", "123", "localhost", "dev-node1", "bank");
    }

    static void Step2632() {
        System.out.println();
        System.out.println("2632");
        Lab01.task2632(50, 50, 40, "yellow");
        Lab01.task2632(400, 300, 200, "green");
        Lab01.task2632(
            254,
            356,
            100,
            "#cc6600");
    }

    static void Step7271() {
        System.out.println();
        System.out.println("7271");
        Lab01.task7271(5, 7);
        Lab01.task7271(-1, 1000);
    }

    static void Step2959() {
        System.out.println();
        System.out.println("2959");
        Lab01.task2959("123456789");
        Lab01.task2959("fa93f");
    }

    static void Step8624() {
        System.out.println();
        System.out.println("8624");
        Lab01.task8624(811);
        Lab01.task8624(1583);
    }

    static void Step9231() {
        System.out.println();
        System.out.println("9231");
        Lab01.task9231(9.780327);
        Lab01.task9231(-273.15);
        Lab01.task9231(0.00006);
    }

    static void Step3862() {
        System.out.println();
        System.out.println("3862");
        Lab01.task3862();
    }

    static void Step7472() {
        System.out.println();
        System.out.println("7472");
        Lab01.task7472("начало", "конец");
        Lab01.task7472("сила", "знание");
        Lab01.task7472("курица", "яйцо");
        Lab01.task7472("шаг", "шаг");
    }

    static void Step1860() {
        System.out.println();
        System.out.println("1860");
        Lab01.task1860("знаниям");
        Lab01.task1860("цели");
        Lab01.task1860("результату");
    }

    static void Step7474() {
        System.out.println();
        System.out.println("7474");
        Lab01.task7474(1, 2, 3);
        Lab01.task7474(-3, 0, 2);
    }
}
