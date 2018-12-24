using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab15Task5087
{
    class Program
    {
        static void Main(string[] args)
        {
            List<String> list = new List<string>();
            String data = Console.ReadLine();
            String[] arr = data.Split(' ');
            for (int i = 0; i < arr.Length; i++)
            {
                list.Add(arr[i]);
            }
            Console.WriteLine(String.Join(" ", list));
        }
    }
}
