using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.lab17
{
    public class Client
    {
        public String Id {private set; get;}
        public String CheckingAccount {private set; get; }
        public String Inn { private set; get; }
        public String Name { private set; get; }

        public Client(String id, String checkingAccount, String inn, String name)
        {
            Id = id;
            CheckingAccount = checkingAccount;
            Inn = inn;
            Name = name;
        }
    }
}
