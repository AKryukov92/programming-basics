package root;

import java.util.Random;

public class RandomRunner {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(-500 + rnd.nextInt(1000));
                System.out.print(";");
            }
        }
    }
}
