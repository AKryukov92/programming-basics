using System;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            int dividend, divider;//Объявление переменных типа int для целых чисел
            dividend = int.Parse(Console.ReadLine());//читаем значение от пользователя
            divider = int.Parse(Console.ReadLine());
            if (divider == 0)//если значение переменной divider строго равно 0
            {
                Console.WriteLine("Делитель не может быть равен 0");
            }
            if (divider != 0)//если значение переменной divider не равно 0
            {
                int quotient = dividend / divider;
                int remainder = dividend % divider;//Нахождение остатка от деления dividend на divider
                Console.Write("Делимое {0}, делитель {1}", dividend, divider);
                Console.WriteLine(", частное {0}, остаток {1}", quotient, remainder);
            }
        }
    }
}