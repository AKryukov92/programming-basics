using System;

namespace CsExample
{
    class Program
    {
        static void Main(string[] args)
        {
            String format_yMd = "yyyy-MM-dd";
            String str = "2023-06-28";
            DateTime dt = DateTime.ParseExact(str, format_yMd, null);
            Console.WriteLine("Выражение " + str + " означает");
            Console.WriteLine("Год: " + dt.Year);
            Console.WriteLine("Месяц: " + dt.Month);
            Console.WriteLine("День: " + dt.Day);
            Console.WriteLine("Час: " + dt.Hour);
            Console.WriteLine("Минута " + dt.Minute);
            Console.WriteLine("Секунда " + dt.Second);
        }
    }
}