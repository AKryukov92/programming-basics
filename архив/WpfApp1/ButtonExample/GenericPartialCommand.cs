using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace ButtonExample
{
    public class GenericPartialCommand<T> : ICommand
    {
        private Action<T> _f;
        private Func<bool> _check;
        public GenericPartialCommand(Action<T> f, Func<bool> check)
        {
            _f = f;
            _check = check;
        }

        public event EventHandler CanExecuteChanged;
        public void CanExecuteChangedInvoke()
        {
            CanExecuteChanged?.Invoke(this, null);
        }

        public bool CanExecute(object parameter)
        {
            return _check();
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
