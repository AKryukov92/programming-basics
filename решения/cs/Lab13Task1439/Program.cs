using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab13Task1439
{
    class Program
    {
        static void Main(string[] args)
        {
            String data = Console.ReadLine();
            String[] arr = data.Split(' ');
            double sum = 0;
            int count = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                try
                {
                    sum += Int32.Parse(arr[i]);
                    count++;
                }
                catch (FormatException ex)
                {
                    Console.WriteLine("Элемент №{0} со значением {1} не число", i, arr[i]);
                }
            }
            if (count > 0)
            {
                double result = sum / count;
                Console.WriteLine("{0:F4}", result);
            }
            else
            {
                Console.WriteLine("В исходном массиве отсутствовали числа");
            }
        }
    }
}
