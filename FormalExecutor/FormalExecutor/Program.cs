using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FormalExecutor
{
    class Program
    {
        static void Main(string[] args)
        {
            ExecutorScheme executor = new ExecutorScheme(1, 1, 1000, new RandomDottedBorderGrid());
            executor.StepRight();
            executor.StepRight();
            executor.StepRight();
            executor.StepRight();
            executor.StepRight();
            executor.StepRight();
            Console.ReadKey();
        }
    }
}
