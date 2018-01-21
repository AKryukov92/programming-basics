import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Александр on 21.01.2018.
 */
public class NavigationTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        //Селениуму нужно указать exe-шник хрома, чтобы его запускать.
        //Можно установить хром и поискать его (где то в системных папках юзера)
        //Еще можно просто скачать и положить в проект
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("localhost:80/page1.html");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void linkTest(){
        new Actions(driver)
                .moveToElement(driver.findElement(By.linkText("page 2")))
                .click().perform();
        WebElement title = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Page 2", title.getText());

        new Actions(driver)
                .moveToElement(driver.findElement(By.linkText("page 1")))
                .click().perform();
        title = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Page 1", title.getText());

    }
}
