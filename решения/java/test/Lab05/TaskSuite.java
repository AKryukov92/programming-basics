package Lab05;

import org.junit.Assert;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Created by Александр on 23.11.2017.
 */
public abstract class TaskSuite {
    static String POSITIVE = "Принадлежит";
    static String NEGATIVE = "Не принадлежит";
    private Locale locale;

    abstract void run();

    @Before
    public void setup(){
        locale = Locale.forLanguageTag("ru-RU");
        Locale.setDefault(locale);
    }

    void compare(double x, double y, String expected) {
        try {
            String item = String.format(locale, "%f\n%f\n", x, y);
            System.setIn(new ByteArrayInputStream(item.getBytes(StandardCharsets.UTF_8.name())));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));
            this.run();
            Assert.assertTrue(baos.toString().contains(expected));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
