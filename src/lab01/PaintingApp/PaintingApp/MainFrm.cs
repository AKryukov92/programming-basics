using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PaintingApp
{
    [System.ComponentModel.DesignerCategory("")]
    public class MainFrm : Form
    {
        public MainFrm()
        {
            InitializeComponent();
            PenTool p = PenTool.prepare(this);
            //движение от угла к началу линии
            //после этих команд не остается следов на рисунке
            p.down();
            p.right();
            //начало рисования
            p.startLine();
            //рисование
            //после этих команд остаются следы на рисунке
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

        #region Windows Form Designer generated code
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Text = "Form1";
        }

        #endregion
    }
}
