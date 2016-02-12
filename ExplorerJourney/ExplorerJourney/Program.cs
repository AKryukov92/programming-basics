using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExplorerJourney
{
    class Program
    {
        static void Main(string[] args)
        {
            Explorer explorer = Explorer.builder()
                .withDelay(1000)
                .withPosition(6, 1)
                .withGrid(new RandomNumberedGrid())
                .build();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            Console.ReadKey();
        }
    }
}
