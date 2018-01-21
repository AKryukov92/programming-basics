import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Александр on 21.01.2018.
 */

public class BoatTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        //Селениуму нужно указать exe-шник хрома, чтобы его запускать.
        //Можно установить хром и поискать его (где то в системных папках юзера)
        //Еще можно просто скачать и положить в проект
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    private WebDriverWait waitSeconds(int seconds){
        return new WebDriverWait(driver, seconds);
    }
    private boolean isElementAt(String id, WebElement container){
        return container.findElement(By.id(id)) != null;
    }

    @Test
    public void criticalPath() {
        driver.get("localhost:80/index.html");


        boolean isStepOk;
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", left_side) &&
                        isElementAt("cabbage", left_side) &&
                        isElementAt("goat", left_side) &&
                        isElementAt("peasant", left_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("goat")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", left_side) &&
                        isElementAt("cabbage", left_side) &&
                        isElementAt("goat", right_side) &&
                        isElementAt("peasant", right_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("peasant")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", left_side) &&
                        isElementAt("cabbage", left_side) &&
                        isElementAt("goat", right_side) &&
                        isElementAt("peasant", left_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("wolf")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", right_side) &&
                        isElementAt("cabbage", left_side) &&
                        isElementAt("goat", right_side) &&
                        isElementAt("peasant", right_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("goat")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", right_side) &&
                        isElementAt("cabbage", left_side) &&
                        isElementAt("goat", left_side) &&
                        isElementAt("peasant", left_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("cabbage")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", right_side) &&
                        isElementAt("cabbage", right_side) &&
                        isElementAt("goat", left_side) &&
                        isElementAt("peasant", right_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("peasant")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", right_side) &&
                        isElementAt("cabbage", right_side) &&
                        isElementAt("goat", left_side) &&
                        isElementAt("peasant", left_side);
            }
        });
        Assert.assertTrue(isStepOk);


        driver.findElement(By.id("goat")).click();
        isStepOk = waitSeconds(1).until(new ExpectedCondition<Boolean>() {
            @Nullable
            public Boolean apply(@Nullable WebDriver webDriver) {
                WebElement left_side = driver.findElement(By.id("left_side"));
                WebElement right_side = driver.findElement(By.id("right_side"));
                return isElementAt("wolf", right_side) &&
                        isElementAt("cabbage", right_side) &&
                        isElementAt("goat", right_side) &&
                        isElementAt("peasant", right_side);
            }
        });
        Assert.assertTrue(isStepOk);
    }

    @Test
    public void redBorderOnHover() {
        driver.get("localhost:80/index.html");
        List<WebElement> elements = driver.findElements(By.cssSelector(".active"));
        Assert.assertEquals(4, elements.size());
        Actions action = new Actions(driver);
        for (WebElement element : elements) {
            action.moveToElement(element).perform();
            Assert.assertEquals("2px solid rgb(255, 0, 0)", element.getCssValue("border"));
        }
    }
}
