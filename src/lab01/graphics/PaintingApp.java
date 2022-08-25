package graphics;

public class PaintingApp {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
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
