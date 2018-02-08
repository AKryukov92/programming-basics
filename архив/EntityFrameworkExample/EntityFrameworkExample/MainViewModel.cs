using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityFrameworkExample
{
    public class MainViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected virtual void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }
        DatabaseContext context = new DatabaseContext();
        private ObservableCollection<Region> regions;
        private ObservableCollection<Country> countries = new ObservableCollection<Country>();
        private Region _selected;

        public MainViewModel()
        {
            regions = new ObservableCollection<Region>(context.regions);
            Regions = new ReadOnlyObservableCollection<Region>(regions);
        }

        public ReadOnlyObservableCollection<Region> Regions { get; set; }

        public Region SelectedRegion
        {
            get
            {
                return _selected;
            }
            set
            {
                _selected = value;
                countries.Clear();
                if (_selected != null)
                {
                    countries.Clear();
                    foreach (var item in context.countries)
                    {
                        if (item.RegionId == SelectedRegion.Id)
                        {
                            countries.Add(item);
                        }
                    }
                    Countries = new ReadOnlyObservableCollection<Country>(countries);
                }
                OnPropertyChanged("SelectedRegion");
                OnPropertyChanged("Countries");
            }
        }

        public ReadOnlyObservableCollection<Country> Countries { get; set; }
    }
}
