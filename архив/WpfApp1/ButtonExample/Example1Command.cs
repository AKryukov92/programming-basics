using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace ButtonExample
{
    public class Example1Command : ICommand
    {
        public event EventHandler CanExecuteChanged;

        private int _dx;
        private ButtonVM _vm;

        public Example1Command(ButtonVM vm, int dx)
        {
            _dx = dx;
            _vm = vm;
        }

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            _vm.X += _dx;
        }
    }
}
