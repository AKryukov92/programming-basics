using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.lab17
{
    public class Order
    {
        public String Id { private set; get; }
        public String Date { private set; get; }
        public String ProductId { private set; get; }
        public int Quantity { private set; get; }
        public String ClientId { private set; get; }
        public String EmployeeId { private set; get; }
        public bool IsFinished { private set; get; }

        public Order(String id, String date, String productId, int quantity,
            String clientId, String employeeId, bool isFinished)
        {
            Id = id;
            Date = date;
            ProductId = productId;
            Quantity = quantity;
            ClientId = clientId;
            EmployeeId = employeeId;
            IsFinished = isFinished;
        }
    }
}
