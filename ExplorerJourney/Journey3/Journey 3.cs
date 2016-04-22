using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Supplies;

namespace Journey3
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
                Задача: Снять все метки
            */
            Grid world = Grid.builder().buildFromStream("3.grid"); //Создание мира
            Explorer explorer = Explorer.builder()
                .withDelay(100)     //Время (в миллисекундах) между выполнениями команд
                .withPosition(6, 1) //Координаты стартовой позиции
                .withGrid(world)    //Указание мира
                .build();           //Создание путешественника
            //Команды путешественнику

            if (world.Validate())//Проверка меток
            {
                //После движения путешественника, в консоли должно появиться такое сообщение
                Console.WriteLine("Мир построен верно");
            }
            Console.ReadKey(); //Ждем нажатия какой-нибудь клавиши
        }
    }
}
