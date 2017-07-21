using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.lab17
{
    public class Product
    {
        public String Id { private set; get; }
        public String Description { private set; get; }
        public String ProductGroupId { private set; get; }
        public String UnitId { private set; get; }
        public Decimal Weight { private set; get; }
        public Decimal Cost { private set; get; }
        public int Quantity { private set; get; }

        public Product(String id, String description, String productGroupId, String unitId, Decimal weight, Decimal cost, int quantity)
        {
            Id = id;
            Description = description;
            ProductGroupId = productGroupId;
            UnitId = unitId;
            Weight = weight;
            Cost = cost;
            Quantity = quantity;
        }
    }
}
