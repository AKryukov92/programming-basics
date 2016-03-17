using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ExplorerJourney
{
    /// <summary>
    /// Класс "Путешественник".
    /// Пример формального исполнителя
    /// Для создания экземпляра, нужно пользоваться шаблоном "Строитель"
    /// Понимает команды:
    ///  Шаг вверх
    ///  Шаг вниз
    ///  Шаг вправо
    ///  Шаг влево
    ///  Поставить отметку
    ///  Снять отметку
    /// Об ошибках сообщает в консоль
    /// </summary>
    class Explorer
    {
        #region Поля
        private int x;
        private int y;
        private int delay;
        private char mark = 'O';
        private Grid grid;
        private String name = "Кук";
        #endregion

        #region Конструктор
        private Explorer(int x, int y, int delay, Grid grid)
        {
            this.grid = grid;
            this.delay = delay;
            this.x = x;
            this.y = y;
            Console.SetCursorPosition(this.x, this.y);
            Console.Write(mark);
        }
        #endregion
        
        #region Методы
        public void StepUp()
        {
            if (Move(0, -1))
            {
                SayMessage("Не могу шагнуть вверх");
            }
        }

        public void StepDown()
        {
            if(Move(0, 1))
            {
                SayMessage("Не могу шагнуть вниз");
            }
        }

        public void StepRight()
        {
            if (Move(1, 0))
            {
                SayMessage("Не могу шагнуть вправо");
            }
        }

        public void StepLeft()
        {
            if (Move(-1, 0))
            {
                SayMessage("Не могу шагнуть влево");
            }
        }

        public void Mark()
        {
            grid.Increment(this.x, this.y);
        }

        public void Unmark()
        {
            grid.Decrement(this.x, this.y);
        }

        private Boolean Move(int dx, int dy)
        {
            if (grid.GetContent(this.x + dx, this.y + dy) == Grid.WALL)
            {
                return false;
            }
            Console.SetCursorPosition(this.x, this.y);
            grid.UpdateTile(this.x, this.y);
            this.x += dx;
            this.y += dy;
            Console.SetCursorPosition(this.x, this.y);
            Console.Write(mark);
            Console.SetCursorPosition(0, grid.Height + 2);
            Thread.Sleep(this.delay);
            return true;
        }
        
        private void ClearMessage()
        {
            Console.SetCursorPosition(0, grid.Height + 1);
            Console.WriteLine(new string(' ', Console.WindowWidth));
        }

        private void SayMessage(String message)
        {
            ClearMessage();
            Console.SetCursorPosition(0, grid.Height + 1);
            Console.WriteLine(name + "(" + this.x + ":" + this.y + "):" + message);
        }

        public int Examine()
        {
            int value = grid.GetContent(this.x, this.y);
            if (value == 0)
            {
                SayMessage("В точке пусто");
            }
            else
            {
                SayMessage("В точке содержится " + value);
            }
            Thread.Sleep(this.delay);
            return value;
        }
        #endregion

        #region Реализация шаблона "Строитель"
        public static Builder builder()
        {
            return new Builder();
        }
        
        public class Builder
        {
            private int x;
            private int y;
            private Grid grid;

            private String name;
            private int delay = 1000;
            private char mark = 'O';

            public Builder withPosition(int posX, int posY)
            {
                this.x = posX;
                this.y = posY;
                return this;
            }

            public Builder withDelay(int delay)
            {
                this.delay = delay;
                return this;
            }

            public Builder withMark(char value)
            {
                this.mark = value;
                return this;
            }

            public Builder withGrid(Grid value)
            {
                this.grid = value;
                return this;
            }

            public Builder withName(String value)
            {
                this.name = value;
                return this;
            }

            public Builder withGrid(String filename)
            {
                this.grid = Grid.builder().buildFromStream(filename);
                return this;
            }

            public Explorer build()
            {
                if (grid == null)
                {
                    grid = new Grid(10, 10);
                }
                Explorer explorer = new Explorer(x, y, delay, grid);
                if (!String.IsNullOrWhiteSpace(name))
                {
                    explorer.name = name;
                }
                return explorer;
            }
        }
        #endregion
    }
}
