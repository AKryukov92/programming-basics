using System;
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            String data = Console.ReadLine();
            int a;//тип переменной - целое число. Её назначение - хранить индекс элемента
            a = Int32.Parse(Console.ReadLine());
            if (String.IsNullOrEmpty(data)) //условие истинно если вы ничего не ввели и нажали Enter
            {
                Console.WriteLine("Исходная строка пуста");
            }
            if (!String.IsNullOrEmpty(data)) //Условие с восклицательным знаком в начале истинно, когда выражение после знака - ложно.
            {
                String[] arr;//объявление переменной для хранения массива текстовых фрагментов
                arr = data.Split('-');//разбиение текстового фрагмента на части. Знак "-" называется разделитель.
                //qw-er-ty-ui превращается в массив
                //на индексе 0 элемент qw
                //на индексе 1 элемент er
                //на индексе 2 элемент ty
                //на индексе 3 элемент ui
                if (a < 0)//индексы в массиве начинаются с 0
                {
                    Console.WriteLine("Индекс A должен быть больше или равен 0");
                }
                if (arr.Length <= a)//длина массива всегда на 1 больше, чем индекс последнего числа
                {
                    Console.WriteLine("Индекс A должен быть строго меньше длины массива");
                }
                if (0 <= a)
                {
                    if (a < arr.Length)
                    {
                        Console.WriteLine("В массиве длиной " + arr.Length);
                        Console.WriteLine("на индексе " + a);
                        Console.WriteLine("находится элемент со значением '" + arr[a] + "'");
                    }
                }
            }

        }
    }
}