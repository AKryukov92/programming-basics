using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.lab17
{
    public class Employee
    {
        public String Id { private set; get; }
        public String LastName { private set; get; }
        public String FirstName { private set; get; }
        public String FatherName { private set; get; }
        public String Gender { private set; get; }
        public String BirthDate { private set; get; }
        public bool Marriage { private set; get; }
        public String PostalIndex { private set; get; }
        public String Address { private set; get; }
        public String Position { private set; get; }
        public String HireType { private set; get; }
        public String Notes { private set; get; }

        public Employee(String id, String lastName, String firstName, String fatherName,
            String gender, String birthDate, bool marriage, String postalIndex, String address,
            String position, String hireType, String notes)
        {
            Id = id;
            LastName = lastName;
            FirstName = firstName;
            FatherName = fatherName;
            Gender = gender;
            BirthDate = birthDate;
            Marriage = marriage;
            PostalIndex = postalIndex;
            Address = address;
            Position = position;
            HireType = hireType;
            Notes = notes;
        }
    }
}
