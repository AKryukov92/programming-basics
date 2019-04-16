package graphics;

public class PaintingApp {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
        Pen p2 = Pen.prepare();
        p.down();
        p.down();
        p.right();
        p.startDrawing();
        p.right();
        p.right();
        p.endDrawing();
        p.up();
        p.left();
        p.startDrawing();
        p.down();
        p.down();
        p.endDrawing();
        p.down();
        p.startDrawing();
        p.down();
        p.endDrawing();
    }
}
