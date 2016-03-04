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
                .withDelay(10)
                .withPosition(6, 1)
                .withGrid(Grid.builder().buildFromStream("1.grid"))
                .build();
            //Commands for explorer
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
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
