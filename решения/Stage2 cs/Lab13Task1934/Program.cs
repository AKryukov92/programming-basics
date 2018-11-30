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
        //По инструкции в задаче, от вас ожидается вот такой "Исходный результат"
        static void Main(string[] args)
        {
            Console.WriteLine("Начало работы программы");
            Step1934();
            Console.WriteLine("Программа завершена успешно");
        }

        //В этом коде может возникнуть два разных исключения.
        //Если оформить обработку этих исключений, то получится "Желаемый результат" как во фрагменте ниже
        //static void Main(string[] args)
        //{
        //    Console.WriteLine("Начало работы программы");
        //    try
        //    {
        //        Step1934();
        //        Console.WriteLine("Программа завершена успешно");
        //    }
        //    catch (ArgumentException ex)
        //    {
        //        Console.WriteLine(ex.Message);
        //    }
        //    catch (FormatException ex)
        //    {
        //        Console.WriteLine("Не удалось преобразовать строку в число");
        //    }
        //}

        public static void Step1934()
        {
            Console.WriteLine("Введите значения A и B");
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            double result = Methods.Task1934(a, b);
            Console.WriteLine("Результат равен {0:F4}", result);
        }

        //Перенес реализацию метода Task1934 сюда, чтобы разбор задачи остался в одном файле
        //По задумке, этот метод должен быть в классе Methods, проекте CodeProject
        //public static double Task1934(int a, int b)
        //{
        //Проверяем исходные данные как в консольном приложении
        //    if (b > 0)
        //    {
        //Вместо простого вывода сообщения в консоль
        //Формируем отчет об ошибке
        //        ArgumentException exception = new ArgumentException("Подкоренное выражение должно быть неотрицательно");
        //"выбрасываем" отчет об ошибке на уровень выше
        //        throw exception;
        //    }
        //Если данные корректны, то вычисляем результат
        //    double result;
        //    result = a* Math.Sqrt(-7 * b);
        //    return result;
        //}
    }
}
