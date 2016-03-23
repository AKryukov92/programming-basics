using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Supplies;

namespace Journey2
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
                Задачи:
                - Обойти комнату по периметру.
                - Побывать в каждом поле комнаты один раз
                - Пройти по диагонали
                - Заполнить всю комнату метками
            */
            Grid world = Grid.builder().buildFromStream("2.grid"); //Создание мира
            Explorer explorer = Explorer.builder()
                .withDelay(100)     //Время (в миллисекундах) между выполнениями команд
                .withPosition(6, 1) //Координаты стартовой позиции
                .withGrid(world)    //Указание мира
                .build();           //Создание путешественника
            //Команды путешественнику

        }
    }
}
