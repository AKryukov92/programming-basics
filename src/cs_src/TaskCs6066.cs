using System;

namespace CsExample
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = Int32.Parse(Console.ReadLine());
            int b = Int32.Parse(Console.ReadLine());
            if (b < a)
            {
                Console.WriteLine("Значение A должно быть меньше или равно значению B");
            }
            if (a <= b)
            {
                while (a <= b)
                {
                    Console.Write(a + ";");
                    a = a + 1;
                }
            }
        }
    }
}