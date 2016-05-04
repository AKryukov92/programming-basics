using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit2
{
    public class Task24to33
    {

        public void task25()
        {
            string temp;
            temp = Console.ReadLine();
            int n;
            int x;
            n = int.Parse(temp);
            if (n < 100)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            if (n >= 1000)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            int step2, step1;
            step2 = n / 100;
            step1 = n % 100 * 10;
            x = step1 + step2;
            Console.WriteLine(x);
        }

        public void task25rev()
        {
            string temp;
            temp = Console.ReadLine();
            int x;
            int n;
            x = int.Parse(temp);
            if (x < 100)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            if (x >= 1000)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            n = x - x % 10;
            n = n / 10;
            n = n + (x % 10) * 100;
            Console.WriteLine(n);
        }

        public void task26()
        {
            string temp;
            temp = Console.ReadLine();
            int n;
            int x;
            n = int.Parse(temp);
            if (n < 100)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            if (n >= 1000)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            int step1, step2;
            step1 = n % 10;
            step2 = n / 10;
            x = step2 + step1 * 100;
            Console.WriteLine(x);
        }

        public void task26rev()
        {
            string temp;
            temp = Console.ReadLine();
            int n;
            int x;
            x = int.Parse(temp);
            if (x < 100)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            if (x >= 1000)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            n = x % 100;
            n = n * 10;
            n = n + x / 100;
            Console.WriteLine(n);
        }

        public void task27rev()
        {
            string temp;
            temp = Console.ReadLine();
            int n;
            int x;
            x = int.Parse(temp);
            if (x < 100)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            if (x >= 1000)
            {
                Console.WriteLine("Введенное число не подходит для решения задачи.");
                return;
            }
            n = x % 10 + x / 100 * 10;
            n = n + (x / 10 % 10) * 100;
            Console.WriteLine(n);
        }
    }
}
