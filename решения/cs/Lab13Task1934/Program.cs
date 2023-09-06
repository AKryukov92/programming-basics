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
                Console.WriteLine("Введите значения A и B");
                int a, b;
                a = int.Parse(Console.ReadLine());
                b = int.Parse(Console.ReadLine());
                double result;
                result = Methods.Task1934(a, b);
                Console.WriteLine("Результат равен {0:F4}", result);
                Console.WriteLine("Программа завершена успешно");
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удалось преобразовать строку в число");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
