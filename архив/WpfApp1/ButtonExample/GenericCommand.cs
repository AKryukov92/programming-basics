using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace ButtonExample
{
    public class GenericCommand<T> : ICommand
    {
        private Action<T> _f;
        public GenericCommand(Action<T> f)
        {
            _f = f;
        }

        public event EventHandler CanExecuteChanged;

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            if (parameter.GetType() == typeof(T))
            {
                _f((T)parameter);
            }
        }
    }
}
