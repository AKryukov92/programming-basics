using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Methods;

namespace tfa
{
    class Lab12Task5164
    {
        static void Main(string[] args)
        {
            Step1860();
            Step4764();
            Step2429();
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

        static void Step1860()
        {
            Console.WriteLine();
            Lab01.Task1860("знаниям");
            Lab01.Task1860("цели");
            Lab01.Task1860("результату");
        }

        static void Step4764()
        {
            Console.WriteLine();
            Lab01.Task4764("трудности");
            Lab01.Task4764("загадки");
            Lab01.Task4764("сложные задачи");
        }

        static void Step2429()
        {
            Console.WriteLine();
            Lab01.Task2429("просто");
            Lab01.Task2429("интересно");
            Lab01.Task2429("перспективно");
        }

        static void Step7472()
        {
            Console.WriteLine();
            Lab01.Task7472("начало", "конец");
            Lab01.Task7472("сила", "знание");
            Lab01.Task7472("курица", "яйцо");
            Lab01.Task7472("шаг", "шаг");
        }

        static void Step3862()
        {
            Console.WriteLine();
            Lab01.Task3862();
        }

        static void Step9231()
        {
            Console.WriteLine();
            Lab01.Task9231(9.780327);
            Lab01.Task9231(-273.15);
            Lab01.Task9231(0.00006);
        }

        static void Step8624()
        {
            Console.WriteLine();
            Lab01.Task8624(811);
            Lab01.Task8624(1583);
        }

        static void Step2959()
        {
            Console.WriteLine();
            Lab01.Task2959("123456789");
            Lab01.Task2959("fa93f");
        }

        static void Step7271()
        {
            Console.WriteLine();
            Lab01.Task7271(5, 7);
            Lab01.Task7271(-1, 1000);
        }

        static void Step2632()
        {
            Console.WriteLine();
            Lab01.Task2632(50, 50, 40, "yellow");
            Lab01.Task2632(400, 300, 200, "green");
            Lab01.Task2632(
                254,
                356,
                100,
                "#cc6600");
        }

        static void Step4343()
        {
            Console.WriteLine();
            Console.WriteLine("4343");
            Lab01.Task4343("test", "pass", "localhost", "5432", "my_db");
            Lab01.Task4343(
                    "admin",
                    "7e8efd48d69c",
                    "production-node1",
                    "5432",
                    "bank");
            Lab01.Task4343("akryukov", "123", "localhost", "dev-node1", "bank");
        }

        static void Step7474()
        {
            Console.WriteLine();
            Console.WriteLine("7474");
            Lab01.Task7474(1, 2, 3);
            Lab01.Task7474(-3, 0, 2);
        }
    }
}
