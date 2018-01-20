using ButtonExample;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionExample
{
    public class CollectionVM : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        private Random rnd;
        public CollectionVM()
        {
            rnd = new Random();
            SetUpExample1();
            SetUpExample2();
            SetUpExample3();
            SetUpExample4();
        }

        #region Пример 1 Коллекция примитивных типов
        private void SetUpExample1()
        {
            Items = new ReadOnlyObservableCollection<int>(_items);
            AddCommand = new GenericCommand<int>(val => _items.Add(val));
            RemoveCommand = new GenericCommand<int>(val => _items.Remove(val));
        }
        private ObservableCollection<int> _items = new ObservableCollection<int>();
        private int _item;
        public ReadOnlyObservableCollection<int> Items { get; private set; }
        public int Item
        {
            get { return _item; }
            set
            {
                _item = value;
                OnPropertyChanged("Item");
            }
        }
        public GenericCommand<int> AddCommand { get; private set; }
        public GenericCommand<int> RemoveCommand { get; private set; }
        #endregion


        #region Пример 2 Коллекция неизменяемых объектов
        private void SetUpExample2()
        {
            X = rnd.Next(0, 100);
            Y = rnd.Next(0, 100);
            Points = new ReadOnlyObservableCollection<Point>(_points);
            AddPointCommand = new ActionCommand(() =>
            {
                _points.Add(Point);
                X = rnd.Next(0, 100);
                Y = rnd.Next(0, 100);
            });
            RemovePointCommand = new ActionCommand(() => _points.Remove(Point));
        }
        private ObservableCollection<Point> _points = new ObservableCollection<Point>();
        public ReadOnlyObservableCollection<Point> Points { get; private set; }

        private int _x;
        private int _y;
        public int X
        {
            get { return _x; }
            set
            {
                _x = value;
                OnPropertyChanged("X");
            }
        }
        public int Y
        {
            get { return _y; }
            set
            {
                _y = value;
                OnPropertyChanged("Y");
            }
        }
        public Point Point
        {
            get { return new Point(_x, _y); }
        }
        public ActionCommand AddPointCommand { get; private set; }
        public ActionCommand RemovePointCommand { get; private set; }

        #endregion


        #region Пример 3 Коллекция изменяемых объектов с детализацией
        private void SetUpExample3()
        {
            Circle = new Circle(rnd.Next(0, 100), rnd.Next(0, 100), rnd.Next(0, 100));
            AddCircleCommand = new ActionCommand(() =>
            {
                _circles.Add(_circle);
                Circle = new Circle(rnd.Next(0, 100), rnd.Next(0, 100), rnd.Next(0, 100));
            });
            RemoveCircleCommand = new ActionCommand(() => _circles.Remove(_circle));
            Circles = new ReadOnlyObservableCollection<Circle>(_circles);
        }
        private ObservableCollection<Circle> _circles = new ObservableCollection<Circle>();
        public ReadOnlyObservableCollection<Circle> Circles { get; private set; }

        private Circle _circle;
        public Circle Circle
        {
            get { return _circle; }
            set
            {
                _circle = value;
                OnPropertyChanged("Circle");
            }
        }
        public ActionCommand AddCircleCommand { get; private set; }
        public ActionCommand RemoveCircleCommand { get; private set; }
        #endregion


        #region Пример 4 Коллекция коллекций с детализацией
        private void SetUpExample4()
        {
            PolyLine = new PolyLine("line1");
            AddPolyLineCommand = new ActionCommand(() =>
            {
                _polyLines.Add(PolyLine);
                PolyLine = new PolyLine("line" + rnd.Next());
            });
            RemovePolyLineCommand = new ActionCommand(() => _polyLines.Remove(_polyLine));
            PolyLines = new ReadOnlyObservableCollection<PolyLine>(_polyLines);

            LinePoint = new Point(rnd.Next(), rnd.Next());
            AddLinePointCommand = new ActionCommand(() =>
            {
                PolyLine.AddPoint(LinePoint);
                LinePoint = new Point(rnd.Next(), rnd.Next());
            });
            RemovePolyLineCommand = new ActionCommand(() => PolyLine.RemovePoint(LinePoint));
        }
        private ObservableCollection<PolyLine> _polyLines = new ObservableCollection<PolyLine>();
        public ReadOnlyObservableCollection<PolyLine> PolyLines { get; private set; }

        private PolyLine _polyLine;
        private int _linePointX;
        private int _linePointY;
        public PolyLine PolyLine
        {
            get { return _polyLine; }
            set
            {
                _polyLine = value;
                OnPropertyChanged("PolyLine");
            }
        }
        public Point LinePoint
        {
            get { return new Point(_linePointX, _linePointY); }
            set
            {
                _linePointX = value.X;
                _linePointY = value.Y;
            }
        }
        public int LinePointX
        {
            get { return _linePointX; }
            set
            {
                _linePointX = value;
                OnPropertyChanged("LinePointX");
            }
        }
        public int LinePointY
        {
            get { return _linePointY; }
            set
            {
                _linePointY = value;
                OnPropertyChanged("LinePointY");
            }
        }
        public ActionCommand AddPolyLineCommand { get; private set; }
        public ActionCommand RemovePolyLineCommand { get; private set; }
        public ActionCommand AddLinePointCommand { get; private set; }
        public ActionCommand RemoveLinePoint { get; private set; }
        #endregion
    }
}
