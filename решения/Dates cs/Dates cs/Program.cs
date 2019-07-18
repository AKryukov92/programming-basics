using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dates_cs
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Задача 7397");
            DateTime today = DateTime.Now;
            Console.WriteLine("Текущее время: " + today.ToString("dd.MM.yyyy HH:mm:ss"));
            DateTime epochStart = new DateTime(1970, 1, 1);
            TimeSpan fromStartToNow = today - epochStart;
            long todayUnix = (long)fromStartToNow.TotalSeconds;
            Console.WriteLine("Текущее unix-время: " + todayUnix);
            DateTime tomorrow = today.AddDays(1);
            Console.WriteLine("Время через 1 день: " + tomorrow);
            long tomorrowUnix = (long)(tomorrow - epochStart).TotalSeconds;
            Console.WriteLine("Unix-время через 1 день: " + tomorrowUnix);
        }
    }
}
