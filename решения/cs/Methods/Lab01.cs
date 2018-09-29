using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab01
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1662");
            Task1662();
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
+ "\nКоторый построил Джек.\n"
;
            string result = Task8693();
            if (result == standard)
            {
                Console.WriteLine("Совпадает");
            }
            else if (standard.StartsWith(result))
            {
                Console.WriteLine("Пока совпадает");
            }
            else
            {
                Console.WriteLine("Не совпадает");
            }
        }

        static void Task1662()
        {
            Console.WriteLine("+---+\n" +
                "|   |\n" +
                "|   |\n" +
                "+---+");
            Console.WriteLine("#\n" +
                "##\n" +
                "###\n" +
                "####\n");
            Console.WriteLine(" /\\\n" +
                "//\\\\\n" +
                "//\\\\\n" +
                " ][");
            Console.WriteLine("{ \"x\":15, \"y\": 28.7 }");
            Console.WriteLine("Три девицы под окном\n" +
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
            Console.WriteLine("<!DOCTYPE html>\n" +
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

        public static void Task1860(String a)
        {
            Console.WriteLine("Мы стремимся к " + a);
        }

        public static void Task4764(String a)
        {
            Console.WriteLine(a + " нас не остановят!");
        }

        public static void Task2429(String a)
        {
            Console.WriteLine("Программирование это " + a + "!");
        }

        public static void Task7472(String a, String b)
        {
            Console.WriteLine(b + " " + a);
        }

        public static void Task3862()
        {
            Console.WriteLine("{0:F4}\n{1:F4}", Math.PI, Math.E);
        }

        public static void Task9231(double a)
        {
            Console.WriteLine("{0:F4}", a);
        }

        public static void Task8624(int a)
        {
            Console.WriteLine("\"" + a + "\"");
        }

        public static void Task2959(String id)
        {
            Console.WriteLine("SELECT first_name, last_name, group");
            Console.WriteLine("FROM students WHERE student_id = '" + id + "';");
            Console.WriteLine();
        }

        public static void Task7271(int x, int y)
        {
            Console.WriteLine("INSERT INTO points (x, y)");
            Console.WriteLine("VALUES ('" + x + "','" + y + "');");
            Console.WriteLine();
        }

        public static void Task2632(int cx, int cy, int r, String fill)
        {
            Console.WriteLine("<circle cx=\"" + cx + "\" cy=\"" + cy + "\"");
            Console.WriteLine("r=\"" + r + "\" fill=\"" + fill + "\"/>");
            Console.WriteLine();
        }

        public static void Task4343(String user, String pass, String host, String port, String db)
        {
            Console.WriteLine("User ID=" + user + ";Password=" + pass + ";");
            Console.WriteLine("Host=" + host + ";Port=" + port + ";Database=" + db + ";");
            Console.WriteLine();
        }

        public static void Task7474(int a, int b, int c)
        {
            Console.WriteLine($"Квадратное уравнение {a}*x*x + {b}*x + {c} = 0.\n" +
                $"Его дискриминант вычисляется по формуле: d = {b}*{b} - 4*{a}*{c}");
        }

        public static String Task8693()
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
    }
}