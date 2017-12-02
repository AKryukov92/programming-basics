using Methods;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Caller
{
    class Program
    {
        static void Main(string[] args)
        {
            Step1703();
        }

        static void Step1703()
        {
            Console.WriteLine();
            Console.WriteLine("1703");
            String[] in1703 = {
                "x>3",
                "r >= 1000",
                "value <=-2",
                "y < 0",
                "x <",
                ">13",
                "y   0",
                "x+7",
                "a < b < c",
                "x < xA && x + w > xA",
                "x > y > z",
                "a x < 17",
                "y > 19 23"};
            String[] out1703 = {
                "Значение переменной x больше числа 3",
                "Значение переменной r больше либо равно числу 1000",
                "Значение переменной value меньше либо равно числу -2",
                "Значение переменной y меньше числа 0",
                "Справа от знака сравнения ожидается ограничение",
                "Слева от знака сравнения ожидается переменная",
                "Отсутствует знак сравнения",
                "Отсутствует знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "Неожиданное выражение \"a\" слева от переменной \"x\"",
                "Неожиданное выражение \"23\" справа от ограничения \"19\""};
            for (int i = 0; i < in1703.Length; i++)
            {
                try
                {
                    String result = Lab07.Task1703(in1703[i]);
                    Console.WriteLine("Получилось: " + result);
                    Console.WriteLine("Ожидалось : " + out1703[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine("Получилось: " + e.Message);
                    Console.WriteLine("Ожидалось : " + out1703[i]);
                }
                Console.WriteLine();
            }
        }
    }
}
