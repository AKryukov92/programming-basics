using System;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            double x;                             //объявление переменной типа double для исходных данных
            x = Double.Parse(Console.ReadLine()); //читаем значение от пользователя
            double result;                        //объявление переменной для результата
            result = x + 7;                       //вычисление результата
            Console.WriteLine("Результат равен {0:F4}", result); //Выражение {0:F4} обозначает, что нужно напечатать 4 знака после запятой
        }
    }
}