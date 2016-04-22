using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.PlainArithmetics
{
    public class Tasks1to11
    {
        public void task1_1_printPi()
        {
            Console.Write("{0:F2}", Math.PI);
        }

        public void task1_2_printExp()
        {
            Console.Write("{0:F1}", Math.E);
        }

        public void task1_3_printInputPrefix()
        {
            Console.Write("Вы ввели число " + Console.ReadLine());
        }

        public void task1_4_printInputPostfix()
        {
            Console.Write(Console.ReadLine() + " - вот какое число Вы ввели");
        }

        public void task1_5_printNumbersSingleSpace()
        {
            Console.Write("1 13 49");
        }

        public void task1_6_printNumbersDoubleSpace()
        {
            Console.Write("7  15  100");
        }

        public void task1_7_print3NumbersDoubleSpace()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();

            Console.Write(first + "  " + second + "  " + third);
        }

        public void task1_8_print4NumbersSingleSpace()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();
            String fourth = Console.ReadLine();

            Console.Write(first + " " + second + " " + third + " " + fourth);
        }

        public void task1_9_print50and10Column()
        {
            Console.Write("50\n10");
        }

        public void task1_10_print5and10and21Column()
        {
            Console.WriteLine("5");
            Console.WriteLine("10");
            Console.WriteLine("21");
        }

        public void task1_11_print4NumbersColumn()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();
            String fourth = Console.ReadLine();
            Console.WriteLine(first);
            Console.WriteLine(second);
            Console.WriteLine(third);
            Console.WriteLine(fourth);
        }
    }
}
