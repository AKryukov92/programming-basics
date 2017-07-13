public class Lab01 {

    public static void main(String[] args) {
        System.out.println("1662");
        task1662();
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
