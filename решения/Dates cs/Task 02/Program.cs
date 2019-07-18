using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_02
{
    class Program
    {
        static void Main(string[] args)
        {
            String format = "dd.MM.yyyy HH:mm:ss";
            String firstString = Console.ReadLine();
            long secondUnix = long.Parse(Console.ReadLine());
            try
            {
                DateTime firstDate = DateTime.ParseExact(firstString, format, null);
                DateTime epochStart = new DateTime(1970, 1, 1);
                long firstUnix = (long)(firstDate - epochStart).TotalMilliseconds;
                Console.WriteLine(firstString + " это " + firstUnix);

                DateTime secondDate = epochStart.AddMilliseconds(secondUnix);
                Console.WriteLine(secondUnix + " это " + secondDate.ToString(format));
                if (firstUnix < secondUnix)
                {
                    Console.WriteLine("Вторая дата позже, чем первая.");
                }
                else if (firstUnix > secondUnix)
                {
                    Console.WriteLine("Первая дата позже, чем вторая.");
                }
                else
                {
                    Console.WriteLine("Даты равны.");
                }
            } catch (FormatException e)
            {
                Console.WriteLine("Первая дата была введена в некорректном формате");
            }
        }
    }
}
