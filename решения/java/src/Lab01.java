public class Lab01 {

    public static void main(String[] args) {
        task6814();
    }
    public static void step1662() {
        System.out.println("1662");
        task1662();
    }
    public static void step8693() {
        System.out.println();
        System.out.println("8693");
        String standard = "Вот дом,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nА это пшеница,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nА это весёлая птица-синица,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nВот кот,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nВот пёс без хвоста,"
                + "\nКоторый за шиворот треплет кота,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nА это корова безрогая,"
                + "\nЛягнувшая старого пса без хвоста,"
                + "\nКоторый за шиворот треплет кота,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nА это старушка, седая и строгая,"
                + "\nКоторая доит корову безрогую,"
                + "\nЛягнувшую старого пса без хвоста,"
                + "\nКоторый за шиворот треплет кота,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nА это ленивый и толстый пастух,"
                + "\nКоторый бранится с коровницей строгою,"
                + "\nКоторая доит корову безрогую,"
                + "\nЛягнувшую старого пса без хвоста,"
                + "\nКоторый за шиворот треплет кота,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек."
                + "\n"
                + "\nВот два петуха,"
                + "\nКоторые будят того пастуха,"
                + "\nКоторый бранится с коровницей строгою,"
                + "\nКоторая доит корову безрогую,"
                + "\nЛягнувшую старого пса без хвоста,"
                + "\nКоторый за шиворот треплет кота,"
                + "\nКоторый пугает и ловит синицу,"
                + "\nКоторая часто ворует пшеницу,"
                + "\nКоторая в тёмном чулане хранится"
                + "\nВ доме,"
                + "\nКоторый построил Джек.\n";
        String result = task8693();
        if (result.equals(standard))
        {
            System.out.println("Совпадает");
        }
        else if (standard.indexOf(result) > 0)
        {
            System.out.println("Пока совпадает");
        }
        else
        {
            System.out.println("Не совпадает");
        }
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

    public static void task3862(){
        System.out.printf("%.4f\n%.4f", Math.PI, Math.E);
    }

    public static void task9231(double a){
        System.out.printf("%.4f", a);
    }

    public static void task8624(int a){
        System.out.println("\"" + a + "\"");
    }

    public static void task7271(int x, int y){
        System.out.println("INSERT INTO points (x, y)");
        System.out.println("VALUES ('" + x + "','" + y + "');");
        System.out.println();
    }

    public static void task2632(int cx, int cy, int r, String fill){
        System.out.print("<circle cx=\"" + cx + "\" cy=\"" + cy + "\"");
        System.out.println("r=\"" + r + "\" fill=\"" + fill + "\"/>");
    }

    public static void task4343(String user, String pass, String host, String port, String db){
        System.out.println("User ID=" + user + ";Password=" + pass + ";");
        System.out.println("Host=" + host + ";Port=" + port + ";Database=" + db + ";");
        System.out.println();
    }

    public static void task7474(int a, int b, int c){
        System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n" +
            "Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s\n", a,b,c,b,b,a,c);
    }

    public static String task8693()
    {
        String result = "Вот дом,\n";
        String repeat = "Который построил Джек.\n";
        result += repeat;
        result += "\nА это пшеница,\n";
        repeat = "Которая в тёмном чулане хранится\n"
                + "В доме,\n"
                + repeat;
        result += repeat;
        result += "\nА это весёлая птица-синица,\n";
        repeat = "Которая часто ворует пшеницу,\n" + repeat;
        result += repeat;
        result += "\nВот кот,\n";
        repeat = "Который пугает и ловит синицу,\n" + repeat;
        result += repeat;
        result += "\nВот пёс без хвоста,\n";
        repeat = "Который за шиворот треплет кота,\n" + repeat;
        result += repeat;
        result += "\nА это корова безрогая,\n" +
                "Лягнувшая старого пса без хвоста,\n";
        result += repeat;
        result += "\nА это старушка, седая и строгая,\n";
        repeat = "Которая доит корову безрогую,\n"
                + "Лягнувшую старого пса без хвоста,\n"
                + repeat;
        result += repeat;
        result += "\nА это ленивый и толстый пастух,\n";
        repeat = "Который бранится с коровницей строгою,\n" + repeat;
        result += repeat;
        result += "\nВот два петуха,\n"
                + "Которые будят того пастуха,\n";
        result += repeat;
        return result;
    }

    public static void task9781() {
        String a, b, c, d;
        c = "успех";
        a = "провал";
        b = "тоже провал";
        c = b;
        d = b;
        b = d;
        d = c;
        a = b;
        System.out.println(a);
    }

    public static void task6814() {
        String a, b, c, d;
        c = "успех";
        a = "тоже провал";
        b = "провал";
        d = b;
        b = c;
        b = d;
        d = c;
        a = d;
        a = b;
        System.out.println(a);
    }
}
