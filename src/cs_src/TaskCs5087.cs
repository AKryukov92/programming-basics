using System;
using System.Collections.Generic;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            List<String> fragments;//объявляю переменную для хранения листа строк
            fragments = new List<String>();//создаю экземпляр класса листа
            String line = Console.ReadLine();
            fragments.Add(line);//добавляю элемент в лист
            line = Console.ReadLine();
            fragments.Add(line);
            line = Console.ReadLine();
            fragments.Add(line);
            line = Console.ReadLine();
            fragments.Add(line);
            //печать элементов листа на экран
            int i = 0;
            while (i < fragments.Count)//ограничение цикла - количество элементов в листе
            {
                Console.Write(fragments[i] + " ");//печатаю элемент листа на экране
                i = i + 1;
            }
        }
    }
}