package ru.ominit;

public class Lab01 {

    public static void main(String[] args) {
        lab1task1662();
        System.out.println();
        lab1task1860("знаниям");
        lab1task1860("цели");
        lab1task1860("результату");
        System.out.println();
        lab1task4764("трудности");
        lab1task4764("загадки");
        lab1task4764("сложные задачи");
        System.out.println();
        lab1task2429("просто");
        lab1task2429("интересно");
        lab1task2429("перспективно");
        System.out.println();
        lab1task7472("начало", "конец");
        lab1task7472("сила", "знание");
        lab1task7472("курица","яйцо");
        lab1task7472("шаг", "шаг");
        System.out.println();
        lab1task2862();
        System.out.println();
        lab1task9231(9.780327);
        lab1task9231(-273.15);
        lab1task9231(0.00006);
        System.out.println();
        lab1task8624(811);
        lab1task8624(1583);
        System.out.println();
        lab1task2959("123456789");
        lab1task2959("fa93f");
        System.out.println();
        lab1task7271(5, 7);
        lab1task7271(-1, 1000);
        System.out.println();
        lab1task2632(50, 50, 40, "yellow");
        lab1task2632(400, 300, 200, "green");
        lab1task2632(254, 356, 100, "#cc6600");
        System.out.println();
        lab1task4343("test", "pass", "localhost", "5432", "my_db");
        lab1task4343("admin", "7e8efd48d69c", "production-node1", "5432", "bank");
        lab1task4343("akryukov", "123", "localhost", "dev-node1", "bank");
    }

    public static void lab1task1662(){
        System.out.println("+---+\n" +
            "|   |\n" +
            "|   |\n" +
            "+---+");
        System.out.println("#\n" +
            "##\n" +
            "###\n" +
            "####");
        System.out.println(" /\\\n" +
            "//\\\\\n" +
            "//\\\\\n" +
            " ][");
        System.out.println("{ \"x\":15, \"y\": 28.7 }");
        System.out.println("Три девицы под окном\n" +
            "Пряли поздно вечерком.\n" +
            "\"Кабы я была царица, —\n" +
            "Говорит одна девица, —\n" +
            "То на весь крещеный мир\n" +
            "Приготовила б я пир\".\n" +
            "\"Кабы я была царица, —\n" +
            "Говорит ее сестрица, —\n" +
            "То на весь бы мир одна\n" +
            "Наткала я полотна\".\n" +
            "\"Кабы я была царица, —\n" +
            "Третья молвила сестрица, —\n" +
            "Я б для батюшки-царя\n" +
            "Родила богатыря\".");
        System.out.println("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\"/>\n" +
            "<head/>\n" +
            "<body>\n" +
            "    <h1>Мой первый векторный рисунок</h1>\n" +
            "\n" +
            "    <svg width=\"800\" height=\"600\">\n" +
            "        <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
            "\t\tstroke-width=\"4\" fill=\"yellow\"/>\n" +
            "    </svg>\n" +
            "</body>\n" +
            "</html>");
    }

    public static void lab1task1860(String a){
        System.out.println("Мы стремимся к " + a);
    }

    public static void lab1task4764(String a){
        System.out.println(a + " нас не остановят!");
    }

    public static void lab1task2429(String a){
        System.out.println("Программирование это " + a);
    }

    public static void lab1task7472(String a, String b){
        System.out.println(b + " " + a);
    }

    public static void lab1task2862(){
        System.out.printf("%.4f\n%.4f", Math.PI, Math.E);
    }

    public static void lab1task9231(double a){
        System.out.printf("%.4f", a);
    }

    public static void lab1task8624(int a){
        System.out.println("\"" + a + "\"");
    }

    public static void lab1task2959(String id){
        System.out.println("SELECT first_name, last_name, group");
        System.out.println("FROM students WHERE student_id = '" + id + "';");
    }

    public static void lab1task7271(int x, int y){
        System.out.println("INSERT INTO points (x, y) VALUES ('" + x + "','" + y + "');");
    }

    public static void lab1task2632(int cx, int cy, int r, String fill){
        System.out.println("<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\" fill=\"" + fill + "\"/>");
    }

    public static void lab1task4343(String user, String pass, String host, String port, String db){
        System.out.println("User ID=" + user + ";Password=" + pass + ";Host=" + host + ";Port=" + port + ";Database=" + db + ";");
    }
}
