using System;
using System.Collections.Generic;
namespace Example
{
    class Program
    {
        static List<int> Task3305(int first, int second)
        {
            List<int> listInts = new List<int>();
            if (first < second)
            {
                while (first <= second)
                {
                    listInts.Add(first);
                    first++;
                }
            }
            else
            {
                while (second <= first)
                {
                    listInts.Add(second);
                    second++;
                }
            }
            return listInts;
        }

        static void Main(string[] args)
        {
            int first = int.Parse(Console.ReadLine());
            int second = int.Parse(Console.ReadLine());
            List<int> result = Task3305(first, second);
            int i = 0;
            while (i < result.Count)
            {
                Console.Write(result[i] + " ");
                i = i + 1;
            }
        }
    }
}