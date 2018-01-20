using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionExample
{
    public class Circle : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        private int _cx;
        private int _cy;
        private int _r;
        public Circle(int cx, int cy, int r)
        {
            _cx = cx;
            _cy = cy;
            _r = r;
        }

        public int Cx
        {
            get { return _cx; }
            set
            {
                _cx = value;
                OnPropertyChanged("Cx");
            }
        }
        public int Cy
        {
            get { return _cy; }
            set
            {
                _cy = value;
                OnPropertyChanged("Cy");
            }
        }
        public int R
        {
            get { return _r; }
            set
            {
                _r = value;
                OnPropertyChanged("R");
            }
        }

        public override string ToString()
        {
            return "{" + Cx + ";" + Cy + " - " + R + "}";
        }

        public override bool Equals(Object o)
        {
            if (this == o) return true;
            if (o == null || GetType() != o.GetType()) return false;

            Circle circle = (Circle)o;

            if (Cx != circle.Cx) return false;
            if (Cy != circle.Cy) return false;
            return R == circle.R;
        }

        public override int GetHashCode()
        {
            int result = Cx;
            result = 31 * result + Cy;
            result = 31 * result + R;
            return result;
        }
    }
}
