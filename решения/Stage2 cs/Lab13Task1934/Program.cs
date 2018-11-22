using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CodeProject;

namespace Lab13Task1934
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Начало работы программы");
            try
            {
                Step1934();
                Console.WriteLine("Программа завершена успешно");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удалось преобразовать строку в число");
            }
        }

        public static void Step1934()
        {
            Console.WriteLine("Введите значения A и B");
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            double result = Methods.Task1934(a, b);
            Console.WriteLine("Результат равен {0:F4}", result);
        }
    }
}
