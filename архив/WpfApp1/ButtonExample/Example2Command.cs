using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace ButtonExample
{
    class Example2Command : ICommand
    {
        public event EventHandler CanExecuteChanged;
        private ButtonVM _vm;
        private int _multiplier;

        public Example2Command(ButtonVM vm, int multiplier)
        {
            _vm = vm;
            _multiplier = multiplier;
        }

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            if (parameter.GetType() == typeof(int))
            {
                _vm.Sum += (int)parameter * _multiplier;
            }
        }
    }
}
