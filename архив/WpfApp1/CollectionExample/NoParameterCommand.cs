using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace CollectionExample
{
    public class ActionCommand : ICommand
    {
        private Action _d;
        public ActionCommand(Action d)
        {
            _d = d;
        }

        public event EventHandler CanExecuteChanged;

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            _d();
        }
    }
}
