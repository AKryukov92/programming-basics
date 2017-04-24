import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //Задание: Нужно присвоить переменной text указанный текст.
        //Значения $RECIPIENT, $TIME, $BEGINDATE должен вводить пользователь
        //При запуске программы, на рабочем столе появится картинка с указанным текстом.

//Привет, $RECIPIENT!
//Думаю тебе редко приходилось получать от меня открытки.
//Мы с тобой не виделись целых $TIME.
//Самым близким людям мы уделяем времени меньше, чем бытовым проблемам.
//Для общения с тобой даже приходится искать повод.
//Но в этот раз повод есть! Я хочу поделиться с тобой важной новостью.
//Начиная с $BEGINDATE я учусь программировать.
//Скоро я смогу сделать этот мир немного лучше.
//Эта открытка - результат работы моей первой программы.
        String text = "";

        makeImage(text);
    }
    public static void makeImage(String text){
        File background = new File("./res/background.jpg");
        File result = new File(System.getProperty("user.home") + "/Desktop/result.png");
        try {
            BufferedImage bufferedImage = ImageIO.read(background);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(new Color(45,45,173));
            graphics.setFont(new Font("Monotype Corsiva", Font.ITALIC, 22));
            String[] rows = text.split("\n");
            for (int i = 0; i < rows.length; i++){
                graphics.drawString(rows[i], 10, 100 + 25 * i);
            }
            ImageIO.write(bufferedImage, "png", result);
            System.out.println("Image " + result.getAbsolutePath() + " created");
        } catch (IOException e) {
            System.out.println("Непредвиденная проблема. Скопируйте весь текст из консоли и принесите на следующее занятие.");
            System.out.println("Путь к фону: " + background.getAbsolutePath());
            System.out.println("Путь к результату: " + result.getAbsolutePath());
            System.out.println("Текст: " + text);
            e.printStackTrace();
        }
    }
}
