using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace ExamTask
{
    class Program
    {
        static void Main(string[] args)
        {
            string dirPath = "C:\\Temp\\exam";
            string[] filenames = Directory.GetFiles(dirPath);
            int i = 0;
            int maxValue = 0;
            string maxName = "";
            if (filenames.Length == 0)
            {
                Console.WriteLine("В папке " + dirPath + " нет файлов");
                return;
            }
            while (i < filenames.Length)
            {
                int width;
                int height;
                string temp;
                StreamReader reader = new StreamReader(filenames[i]);
                temp = reader.ReadLine();
                bool isNumber = int.TryParse(temp, out width);
                if (!isNumber)
                {
                    Console.WriteLine("Ширина должна быть числом");
                    reader.Close();
                    return;
                }
                if (width <= 0)
                {
                    Console.WriteLine("Ширина должна быть положительной");
                    reader.Close();
                    return;
                }
                temp = reader.ReadLine();
                isNumber = int.TryParse(temp, out height);
                if (!isNumber)
                {
                    Console.WriteLine("Длина должна быть числом");
                    reader.Close();
                    return;
                }
                if (height <= 0)
                {
                    Console.WriteLine("Длина должна быть положительной");
                    reader.Close();
                    return;
                }
                reader.Close();
                int currValue = width * height;
                if (currValue > maxValue)
                {
                    maxValue = currValue;
                    maxName = filenames[i];
                }
                Console.WriteLine("В файле " + filenames[i] + " находится прямоугольник с площадью " + currValue);
                i++;
            }
            Console.WriteLine("В файле " + maxName + " находится самый большой прямоугольник с площадью " + maxValue);
        }
    }
}
