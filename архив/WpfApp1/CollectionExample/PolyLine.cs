using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionExample
{
    public class PolyLine : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        private ObservableCollection<Point> _points = new ObservableCollection<Point>();
        private String _name;

        public PolyLine(String name)
        {
            _name = name;
            Points = new ReadOnlyObservableCollection<Point>(_points);
        }

        public ReadOnlyObservableCollection<Point> Points { get; private set; }
        public String Name
        {
            get { return _name; }
            set
            {
                _name = value;
                OnPropertyChanged("Name");
            }
        }

        public void AddPoint(Point point)
        {
            _points.Add(point);
        }

        public void RemovePoint(Point point)
        {
            _points.Remove(point);
        }

        public override string ToString()
        {
            return _name;
        }

        public override bool Equals(Object o)
        {
            if (this == o) return true;
            if (o == null || GetType() != o.GetType()) return false;

            PolyLine polyLine = (PolyLine)o;

            return Name == polyLine.Name;
        }

        public override int GetHashCode()
        {
            return Name.GetHashCode();
        }
    }
}
