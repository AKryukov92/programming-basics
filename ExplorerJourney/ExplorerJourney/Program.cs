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
            Grid world = Grid.builder().buildFromStream("2.grid"); //Создание мира
            Explorer explorer = Explorer.builder()
                .withDelay(100)     //Время (в миллисекундах) между выполнениями команд
                .withPosition(6, 1) //Координаты стартовой позиции
                .withGrid(world)    //Указание мира
                .build();           //Создание путешественника
            //Команды путешественнику
            explorer.StepRight();//Шагнуть вправо
            explorer.StepRight();
            explorer.StepRight();
            explorer.Mark();    //Поставить отметку
            explorer.StepLeft();//Шагнуть влево
            explorer.StepDown();//Шагнуть вниз
            explorer.StepUp();  //Шагнуть вверх
            explorer.StepUp();

            //Проверка мира
            if (world.Validate())
            {
                Console.WriteLine("Мир построен верно");
            }
            Console.ReadKey();
        }
    }
}
