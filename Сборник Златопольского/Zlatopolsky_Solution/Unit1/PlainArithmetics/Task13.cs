using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.PlainArithmetics
{
    public class Task13
    {
        public void task1_13a_printText()
        {
            Console.WriteLine("2 кг");
            Console.WriteLine("13 17");
        }

        public void task1_13b_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int a;
            Boolean success;
            success = int.TryParse(temp, out a);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int b;
            success = int.TryParse(temp, out b);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine(a + " 1");
            Console.WriteLine("19 " + b);
        }

        public void task1_13c_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int x;
            Boolean success;
            success = int.TryParse(temp, out x);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int y;
            success = int.TryParse(temp, out y);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine(x + " " + y);
            Console.WriteLine("5 " + y);
        }
    }
}
