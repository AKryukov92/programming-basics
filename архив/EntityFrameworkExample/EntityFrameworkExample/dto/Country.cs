using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations.Schema;

namespace EntityFrameworkExample
{
    [Table("countries", Schema="public")]
    public class Country
    {
        protected Country() { }
        [Column("country_id")]
        public string Id { get; private set; }
        [Column("country_name")]
        public String Name { get; private set; }
        [Column("region_id")]
        public int RegionId { get; private set; }

        public override string ToString()
        {
            return Name;
        }
    }
}
