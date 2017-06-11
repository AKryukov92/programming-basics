public class Lab01 {

    public static void task5164(){
        System.out.println();
        System.out.println("1860");
        task1860("знаниям");
        task1860("цели");
        task1860("результату");

        System.out.println();
        System.out.println("4764");
        task4764("трудности");
        task4764("загадки");
        task4764("сложные задачи");

        System.out.println();
        System.out.println("2429");
        task2429("просто");
        task2429("интересно");
        task2429("перспективно");

        System.out.println();
        System.out.println("7472");
        task7472("начало", "конец");
        task7472("сила", "знание");
        task7472("курица","яйцо");
        task7472("шаг", "шаг");

        System.out.println();
        System.out.println("3862");
        task3862();

        System.out.println();
        System.out.println("9231");
        task9231(9.780327);
        task9231(-273.15);
        task9231(0.00006);

        System.out.println();
        System.out.println("8624");
        task8624(811);
        task8624(1583);

        System.out.println();
        System.out.println("2959");
        task2959("123456789");
        task2959("fa93f");

        System.out.println();
        System.out.println("7271");
        task7271(5, 7);
        task7271(-1, 1000);

        System.out.println();
        System.out.println("2632");
        task2632(50, 50, 40, "yellow");
        task2632(400, 300, 200, "green");
        task2632(
                254,
                356,
                100,
                "#cc6600");

        System.out.println();
        System.out.println("4343");
        task4343("test", "pass", "localhost", "5432", "my_db");
        task4343(
                "admin",
                "7e8efd48d69c",
                "production-node1",
                "5432","bank");
        task4343("akryukov", "123", "localhost", "dev-node1", "bank");
    }

    public static void main(String[] args) {
        System.out.println("1662");
        task1662();

        task5164();
    }

    public static void task1662(){
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

    public static void task1860(String a){
        System.out.println("Мы стремимся к " + a);
    }

    public static void task4764(String a){
        System.out.println(a + " нас не остановят!");
    }

    public static void task2429(String a){
        System.out.println("Программирование это " + a + "!");
    }

    public static void task7472(String a, String b){
        System.out.println(b + " " + a);
    }

    public static void task3862(){
        System.out.printf("%.4f\n%.4f", Math.PI, Math.E);
    }

    public static void task9231(double a){
        System.out.printf("%.4f", a);
    }

    public static void task8624(int a){
        System.out.println("\"" + a + "\"");
    }

    public static void task2959(String id){
        System.out.println("SELECT first_name, last_name, group");
        System.out.println("FROM students WHERE student_id = '" + id + "';");
        System.out.println();
    }

    public static void task7271(int x, int y){
        System.out.println("INSERT INTO points (x, y)");
        System.out.println("VALUES ('" + x + "','" + y + "');");
        System.out.println();
    }

    public static void task2632(int cx, int cy, int r, String fill){
        System.out.println("<circle cx=\"" + cx + "\" cy=\"" + cy + "\"");
        System.out.println("r=\"" + r + "\" fill=\"" + fill + "\"/>");
        System.out.println();
    }

    public static void task4343(String user, String pass, String host, String port, String db){
        System.out.println("User ID=" + user + ";Password=" + pass + ";");
        System.out.println("Host=" + host + ";Port=" + port + ";Database=" + db + ";");
        System.out.println();
    }
}
