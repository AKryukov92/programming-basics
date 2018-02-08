using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityFrameworkExample
{
    public class DatabaseContext : DbContext
    {
        public DatabaseContext() : base(new Npgsql.NpgsqlConnection("User ID=postgres;Password=;Host=localhost;Port=5432;Database=human_resources;"), true)
        {

        }
        public DbSet<Region> regions { get; set; }
        public DbSet<Country> countries { get; set; }
    }
}
