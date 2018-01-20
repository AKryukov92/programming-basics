using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace ButtonExample
{
    public class ButtonVM : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        public ButtonVM()
        {
            SetUpExample1();
            SetUpExample2();
            SetUpExample3();
            SetUpExample4();
        }

        #region Пример 1 Привязка команд к кнопкам
        public void SetUpExample1()
        {
            IncrementCommand = new Example1Command(this, 1);
            DecrementCommand = new Example1Command(this, -1);
        }
        private int _x;
        public int X
        {
            get { return _x; }
            set
            {
                _x = value;
                OnPropertyChanged("X");
            }
        }
        public ICommand IncrementCommand { get; private set; }
        public ICommand DecrementCommand { get; private set; }
        #endregion


        #region Пример 2 Команды с аргументами
        public void SetUpExample2()
        {
            AddCommand = new Example2Command(this, +1);
            SubCommand = new Example2Command(this, -1);
        }
        private int _sum;
        private int _summand = 2;
        public int Sum
        {
            get { return _sum; }
            set
            {
                _sum = value;
                OnPropertyChanged("Sum");
            }
        }
        public String AddCommandContent
        {
            get { return "Прибавить " + _summand; }
        }
        public String SubCommandContent
        {
            get { return "Вычесть " + _summand; }
        }
        public int Summand
        {
            get { return _summand; }
            set
            {
                _summand = value;
                OnPropertyChanged("Summand");
                OnPropertyChanged("AddCommandContent");
                OnPropertyChanged("SubCommandContent");
            }
        }
        public ICommand AddCommand { get; private set; }
        public ICommand SubCommand { get; private set; }
        #endregion


        #region Пример 3 Код команд во ViewModel
        public void SetUpExample3()
        {
            IncreaseCommand = new GenericCommand<int>(val =>
            {
                _total += val;
                OnPropertyChanged("Total");
            });
            SubstractCommand = new GenericCommand<int>(val =>
            {
                _total -= val;
                OnPropertyChanged("Total");
            });
        }
        private int _total;
        public int Total
        {
            get { return _total; }
            set
            {
                _total = value;
                OnPropertyChanged("Total");
            }
        }
        public ICommand IncreaseCommand { get; private set; }
        public ICommand SubstractCommand { get; private set; }
        #endregion


        #region Пример 4 Значение меняется в заданных пределах
        public void SetUpExample4()
        {
            AddInRangeCommand = new GenericPartialCommand<int>(val =>
            {
                ValInRange += 1;
            }, () =>
            {
                return ValInRange < _rangeEnd;
            });

            SubInRangeCommand = new GenericPartialCommand<int>(val =>
            {
                ValInRange -= 1;
            }, () =>
            {
                return _rangeBegin < ValInRange;
            });
        }
        private int _valInRange;
        private int _rangeBegin = -3;
        private int _rangeEnd = 3;
        public int RangeBegin
        {
            get { return _rangeBegin; }
            set
            {
                _rangeBegin = value;
                OnPropertyChanged("RangeBegin");
                
            }
        }
        public int RangeEnd
        {
            get { return _rangeEnd; }
            set
            {
                _rangeEnd = value;
                OnPropertyChanged("RangeEnd");
            }
        }
        public int ValInRange
        {
            get { return _valInRange; }
            set
            {
                _valInRange = value;
                OnPropertyChanged("ValInRange");
                AddInRangeCommand.CanExecuteChangedInvoke();
                SubInRangeCommand.CanExecuteChangedInvoke();
            }
        }
        public GenericPartialCommand<int> AddInRangeCommand { get; private set; }
        public GenericPartialCommand<int> SubInRangeCommand { get; private set; }
        #endregion
        
        //Задача: реализовать последний вариант со слагаемым так, чтобы кнопки отключались при указании слагаемого не числом
    }
}
