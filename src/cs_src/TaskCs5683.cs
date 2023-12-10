using System;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            String str = Console.ReadLine();
            String[] mas;
            mas = str.Split(' ');
            int index = 0;//переменная объединяет два назначения:
            //* Будущий счётчик цикла
            //* Индекс (номер) элемента
            if (index < mas.Length)
            {
                Console.WriteLine(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.Length)
            {
                Console.WriteLine(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.Length)
            {
                Console.WriteLine(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.Length)
            {
                Console.WriteLine(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.Length)
            {
                Console.WriteLine(mas[index] + " " + index);
                index = index + 1;
            }
        }
    }
}