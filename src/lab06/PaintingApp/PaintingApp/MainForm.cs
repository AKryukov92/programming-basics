using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PaintingApp
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
            PenTool p = PenTool.prepare(this);
            //движение к началу линии
            //после команд не остается следов на рисунке
            p.down();
            p.right();
            //начало рисования
            p.startLine();
            //рисование
            //после команд остаются следы на рисунке
            p.right();
            p.right();
            p.right();
            p.right();
            p.right();

            p.down();
            p.down();
            p.down();
            p.down();
            p.down();

            p.left();
            p.left();
            p.left();
            p.left();
            p.left();

            p.up();
            p.up();
            p.up();
            p.up();
            p.up();

            p.endLine();
        }
    }
}
