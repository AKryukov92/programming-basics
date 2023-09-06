using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CodeProject;

namespace Lab13Task3943
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Начало работы программы");
            Console.WriteLine("Введите значения x и y");
            try
            {
                int x = int.Parse(Console.ReadLine());
                int y = int.Parse(Console.ReadLine());
                double result = Methods.Task3943(x, y);
                Console.WriteLine("Результат равен {0:F4}", result); 
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удалось преобразовать строку в число");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine("Не удалось вычислить результат");
                Console.WriteLine(ex.Message);
            }
            Console.WriteLine("Конец работы программы");
        }
    }
}
