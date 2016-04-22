using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.PlainArithmetics
{
    public class Task12
    {
        public void task1_12a_printText()
        {
            Console.WriteLine("5 10");
            Console.WriteLine("5 см");
        }

        public void task1_12b_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int t;
            Boolean success;
            success = int.TryParse(temp, out t);
            if (success != true)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int v;
            success = int.TryParse(temp, out v);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine("100 " + t);
            Console.WriteLine("1949 " + v);
        }

        public void task1_12c_printText()
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
            Console.WriteLine(x + " 25");
            Console.WriteLine(x + " " + y);
        }
    }
}
