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
            task1662();
        }

        static void task1662()
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

        public static void task1860(String a)
        {
            Console.WriteLine("Мы стремимся к " + a);
        }

        public static void task4764(String a)
        {
            Console.WriteLine(a + " нас не остановят!");
        }

        public static void task2429(String a)
        {
            Console.WriteLine("Программирование это " + a + "!");
        }

        public static void task7472(String a, String b)
        {
            Console.WriteLine(b + " " + a);
        }

        public static void task3862()
        {
            Console.WriteLine("{0:F4}\n{1:F4}", Math.PI, Math.E);
        }

        public static void task9231(double a)
        {
            Console.WriteLine("{0:F4}", a);
        }

        public static void task8624(int a)
        {
            Console.WriteLine("\"" + a + "\"");
        }

        public static void task2959(String id)
        {
            Console.WriteLine("SELECT first_name, last_name, group");
            Console.WriteLine("FROM students WHERE student_id = '" + id + "';");
            Console.WriteLine();
        }

        public static void task7271(int x, int y)
        {
            Console.WriteLine("INSERT INTO points (x, y)");
            Console.WriteLine("VALUES ('" + x + "','" + y + "');");
            Console.WriteLine();
        }

        public static void task2632(int cx, int cy, int r, String fill)
        {
            Console.WriteLine("<circle cx=\"" + cx + "\" cy=\"" + cy + "\"");
            Console.WriteLine("r=\"" + r + "\" fill=\"" + fill + "\"/>");
            Console.WriteLine();
        }

        public static void task4343(String user, String pass, String host, String port, String db)
        {
            Console.WriteLine("User ID=" + user + ";Password=" + pass + ";");
            Console.WriteLine("Host=" + host + ";Port=" + port + ";Database=" + db + ";");
            Console.WriteLine();
        }
    }
}