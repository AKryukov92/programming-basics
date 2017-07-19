using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab15
{
    class Program
    {
        static void Main(string[] args)
        {
            Caller8258.Step1();
            Caller8258.Step2();
            Caller8258.Step3();
            Caller8258.Step4();
            Caller8258.Step5();

            Console.WriteLine();
            Console.WriteLine("7186");
            Console.WriteLine("step1");
            Caller7186.Step1();
            Console.WriteLine("step2");
            Caller7186.Step2();
            Console.WriteLine("step3");
            Caller7186.Step3();
            Console.WriteLine("step4");
            Caller7186.Step4();
            Console.WriteLine("step5");
            Caller7186.Step5();

            Console.WriteLine();
            Console.WriteLine("1457");
            Caller1457.Step1();
            Caller1457.Step2();
            Caller1457.Step3();
            Caller1457.Step4();
            Caller1457.Step5();
            Caller1457.Step6();

            Console.WriteLine();
            Console.WriteLine("6876");
            Caller6876.Step1();
            Caller6876.Step2();
            Caller6876.Step3();
        }
    }
}
