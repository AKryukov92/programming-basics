using System;
using System.Collections.Generic;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            HashSet<String> fragments;//объявляю переменную для хранения множества строк
            fragments = new HashSet<String>();//создаю экземпляр класса множества
            String line = Console.ReadLine();
            fragments.Add(line);//добавляю элемент в множество
            line = Console.ReadLine();
            fragments.Add(line);
            line = Console.ReadLine();
            fragments.Add(line);
            line = Console.ReadLine();
            fragments.Add(line);
            //печать элементов множества на экран
            //из за того, что к элементам нельзя обращаться по индексу,
            // нужно использовать специальный синтаксис цикла
            foreach (String item in fragments)
            {
                Console.Write(fragments + " ");//печатаю элемент множества на экране
                i = i + 1;
            }
        }
    }
}