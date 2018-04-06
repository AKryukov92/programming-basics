using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EntityFrameworkExample
{
    [Table("regions", Schema = "public")]
    public class Region
    {
        protected Region() { }
        [Column("region_id")]
        public int Id { get; private set; }
        [Column("region_name")]
        public String RegionName { get; private set; }

        public override string ToString()
        {
            return RegionName;
        }
    }
}
