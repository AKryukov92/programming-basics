using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab13Task7740
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
				//Команда double.Parse потенциально может выбросить исключение.
				//Чтобы решить задачу, нужно это исключение обработать.
                double x = double.Parse(Console.ReadLine());
				//Область видимости переменной x - внутри блока try
				//Поэтому все расчеты, которые используют переменную x также помещаются в блок try
                double result = x + 7;
                Console.WriteLine("{0:F4}", result);
            } catch (FormatException ex)
            {
				//Если пользователь введет что-нибудь, что не удается преобразовать в числовозникает
				//Возникает исключение, которое обрабатывается кодом в блоке catch
                Console.WriteLine("Не удалось преобразовать строку в число");
            }
        }
    }
}
