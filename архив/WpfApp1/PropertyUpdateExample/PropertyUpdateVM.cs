using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PropertyUpdateExample
{
    class PropertyUpdateVM : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        private int _changeOnEnter;
        private int _changeOnInput;
        private int _wontDisplayChange;

        public int ChangeOnEnter
        {
            get { return _changeOnEnter; }
            set
            {
                _changeOnEnter = value;
                OnPropertyChanged("ChangeOnEnter");
            }
        }

        public int ChangeOnInput
        {
            get { return _changeOnInput; }
            set
            {
                _changeOnInput = value;
                OnPropertyChanged("ChangeOnInput");
            }
        }

        public int WontDisplayChange
        {
            get { return _wontDisplayChange; }
            set
            {
                _wontDisplayChange = value;
                //Соответствующее поле не будет обновляться
                //OnPropertyChanged("Number3");
            }
        }
    }
}
