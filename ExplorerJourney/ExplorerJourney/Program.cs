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
            Grid world = Grid.builder().buildFromStream("1.grid");
            Explorer explorer = Explorer.builder()
                .withDelay(10)
                .withPosition(6, 1)
                .withGrid(world)
                .build();
            //Commands for explorer
            explorer.StepRight();
            explorer.StepRight();
            explorer.StepRight();
            explorer.Mark();
            explorer.StepLeft();
            explorer.StepDown();
            explorer.StepUp();

            if (world.Validate())
            {
                Console.WriteLine("Мир построен верно");
            }
            Console.ReadKey();
        }
    }
}
