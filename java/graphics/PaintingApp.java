package graphics;

public class PaintingApp {
    public static void main(String[] args) {
        square();
//        dog();
//        heart();
//        cat();
        //house();
        //snake();
        //spiral();
    }

    public static void square() {
        Pen p = Pen.prepare();
        p.down();
        p.right();
        p.startLine();
        for (int i = 0; i < 5; i++) {
            p.right();
        }
        for (int i = 0; i < 5; i++) {
            p.down();
        }
        for (int i = 0; i < 5; i++) {
            p.left();
        }
        for (int i = 0; i < 5; i++) {
            p.up();
        }
        p.endLine();
    }

    public static void dog() {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.right();
        p.up();
        p.right();
        p.right();
        p.up();
        p.right();
        for (int i = 0; i < 5; i++) {
            p.down();
        }
        for (int i = 0; i < 7; i++) {
            p.right();
        }
        p.up();
        p.up();
        p.right();
        p.down();
        p.down();
        p.down();
        p.left();
        for (int i = 0; i < 7; i++) {
            p.down();
        }
        p.left();
        p.left();
        p.up();
        p.right();
        p.up();
        p.up();
        p.up();
        for (int i = 0; i < 6; i++) {
            p.left();
        }
        for (int i = 0; i < 4; i++) {
            p.down();
        }
        p.left();
        p.left();
        p.up();
        p.right();
        p.up();
        p.up();
        p.up();
        p.left();
        for (int i = 0; i < 5; i++) {
            p.up();
        }
        p.left();
        p.left();
        p.left();
        p.up();
        p.up();
    }

    public static void heart() {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.up();
        p.right();
        p.right();
        p.down();
        p.right();
        p.down();
        p.right();
        p.up();
        p.right();
        p.up();
        p.right();
        p.right();
        p.down();
        p.right();
        p.down();
        p.down();
        p.down();
        for (int i = 0; i < 4; i++) {
            p.left();
            p.down();
        }
        for (int i = 0; i < 5; i++) {
            p.left();
            p.up();
        }
        p.up();
        p.up();
        p.endLine();
    }

    public static void cat() {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.down();
        p.right();
        p.up();
        p.right();
        p.down();
        p.down();
        for (int i = 0; i < 5; i++) {
            p.right();
        }
        p.up();
        p.up();
        p.left();
        p.up();
        p.right();
        p.right();
        for (int i = 0; i < 6; i++) {
            p.down();
        }
        for (int i = 0; i < 4; i++) {
            p.down();
            p.down();
            p.down();
            p.left();
            p.up();
            p.up();
            p.up();
            p.left();
        }
        p.up();
        p.up();
        p.left();
        for (int i = 0; i < 3; i++) {
            p.up();
        }
        p.endLine();
    }

    public static void house() {
        Pen p = Pen.prepare();
        for (int i = 0; i < 5; i++) {
            p.down();
        }
        p.right();
        p.startLine();
        for (int i = 0; i < 4; i++) {
            p.right();
            p.up();
        }
        for (int i = 0; i < 5; i++) {
            p.right();
            p.down();
        }
        p.left();
        for (int i = 0; i < 4; i++) {
            p.down();
        }
        p.left();
        p.up();
        p.up();
        p.up();
        p.left();
        p.left();
        p.down();
        p.down();
        p.right();
        p.right();
        p.down();
        p.left();
        p.left();
        p.left();
        p.left();
        p.right();
        p.up();
        p.up();
        p.up();
        p.left();
        p.left();
        p.down();
        p.down();
        p.down();
        p.right();
        p.left();
        p.left();
        for (int i = 0; i < 4; i++) {
            p.up();
        }
        p.left();
        p.up();
        p.endLine();
    }

    public static void snake() {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.right();
        p.up();
        p.right();
        for (int i = 0; i < 6; i++) {
            p.down();
        }
        for (int j = 0; j < 3; j++) {
            p.right();
            for (int i = 0; i < 5; i++) {
                p.up();
            }
            p.right();
            p.right();
            p.right();
            for (int i = 0; i < 5; i++) {
                p.down();
            }
        }
        p.right();
        for (int i = 0; i < 5; i++) {
            p.up();
        }
        p.right();
        p.down();
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                p.down();
            }
            p.left();
            p.left();
            p.left();
            for (int i = 0; i < 5; i++) {
                p.up();
            }
            p.left();
        }
        p.left();
        p.up();
        p.endLine();
    }

    public static void spiral() {
        Pen p = Pen.prepare();
        p.right();
        p.down();
        p.startLine();
        for (int j = 10; j > 0; j -= 2) {
            for (int i = 0; i < j; i++) {
                p.right();
            }
            for (int i = 0; i < j; i++) {
                p.down();
            }
            for (int i = 0; i < j; i++) {
                p.left();
            }
            for (int i = 0; i < j - 1; i++) {
                p.up();
            }
            p.right();
        }
    }
}
