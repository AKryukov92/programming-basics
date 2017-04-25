using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Drawing;
using System.Drawing.Imaging;

namespace postcard
{
    class Program
    {
        static void Main(string[] args)
        {
            //Задание: Нужно присвоить переменной text указанный текст.
            //Значения $RECIPIENT, $TIME, $BEGINDATE должен вводить пользователь
            //При запуске программы, на рабочем столе появится картинка с указанным текстом.

            //Привет, $RECIPIENT!
            //Думаю тебе редко приходилось получать от меня открытки.
            //Мы с тобой не виделись целых $TIME.
            //Самым близким людям мы уделяем времени меньше, чем бытовым проблемам.
            //Для общения с тобой даже приходится искать повод.
            //Но в этот раз повод есть! Я хочу поделиться с тобой важной новостью.
            //Начиная с $BEGINDATE я учусь программировать.
            //Скоро я смогу сделать этот мир немного лучше.
            //Эта открытка - результат работы моей первой программы.
            String text = "Строка 1\nСтрока 2\nСтрока 3";

            makeImage(text);

        }

        static void makeImage(String text)
        {
            Bitmap bitmap = (Bitmap)Image.FromFile("background.jpg");
            using (Graphics graphics = Graphics.FromImage(bitmap))
            {
                Font font = new Font("Monotype Corsiva", 22, FontStyle.Italic);
                SolidBrush brush = new SolidBrush(Color.FromArgb(45, 45, 173));
                String[] rows = text.Split('\n');
                for (int i = 0; i < rows.Length; i++)
                {
                    Point location = new Point(10, 100 + 25 * i);
                    graphics.DrawString(rows[i], font, brush, location);
                }
            }
            string desktop = Environment.GetFolderPath(Environment.SpecialFolder.Desktop);
            bitmap.Save(desktop + "/result.png", ImageFormat.Png);
        }
    }
}
