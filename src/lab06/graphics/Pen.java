package graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Pen extends JPanel {
    private int x;
    private int y;
    private boolean draw;
    private static final int PIXELS_IN_STEP = 20;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private ArrayList<Point> points = new ArrayList<>();
    private ArrayList<Boolean> draws = new ArrayList<>();

    public static Pen prepare(){
        JFrame frame = new JFrame("Графический диктант");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        Pen p = new Pen();
        frame.getContentPane().add(p);
        return p;
    }

    private Pen() {
        this.x = 0;
        this.y = 0;
        this.draw = false;
    }

    @Override
    public void paint(Graphics g) {
        if (points.size() == 0) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.RED);
        for (int i = 1; i < points.size(); i++) {
            if (draws.get(i)) {
                Point prev = points.get(i - 1);
                Point current = points.get(i);
                g2d.drawLine(prev.x, prev.y, current.x, current.y);
            }
        }
    }

    public void down() {
        if (this.y + PIXELS_IN_STEP > WINDOW_HEIGHT){
            System.out.println("Ручка вышла за границу окна снизу на шаге " + points.size());
        }
        this.y += PIXELS_IN_STEP;
        points.add(new Point(x, y));
        draws.add(draw);
    }

    public void up() {
        if (this.y - PIXELS_IN_STEP < 0){
            System.out.println("Ручка вышла за границу окна сверху на шаге " + points.size());
        }
        this.y -= PIXELS_IN_STEP;
        points.add(new Point(x, y));
        draws.add(draw);
    }

    public void left() {
        if (this.x - PIXELS_IN_STEP < 0){
            System.out.println("Ручка вышла за границу окна слева на шаге " + points.size());
        }
        this.x -= PIXELS_IN_STEP;
        points.add(new Point(x, y));
        draws.add(draw);
    }

    public void right() {
        if (this.x + PIXELS_IN_STEP > WINDOW_WIDTH){
            System.out.println("Ручка вышла за границу окна справа на шаге " + points.size());
        }
        this.x += PIXELS_IN_STEP;
        points.add(new Point(x, y));
        draws.add(draw);
    }

    public void startLine() {
        this.draw = true;
    }

    public void endLine() {
        this.draw = false;
    }
}
