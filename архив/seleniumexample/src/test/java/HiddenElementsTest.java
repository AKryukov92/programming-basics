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
public class HiddenElementsTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        //Селениуму нужно указать exe-шник хрома, чтобы его запускать.
        //Можно установить хром и поискать его (где то в системных папках юзера)
        //Еще можно просто скачать и положить в проект
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("localhost:80/hidden_inputs.html");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void task1Test1() {
        Actions scenario = new Actions(driver);
        WebElement taskElement = driver.findElement(By.id("task1"));
        scenario
                .moveToElement(taskElement)
                .moveToElement(taskElement.findElement(By.name("data")))
                .click()
                .sendKeys("знаниям")
                .moveToElement(taskElement.findElement(By.name("btn")))
                .click().perform();
        Assert.assertEquals("Мы стремимся к знаниям", driver.findElement(By.id("task1_out")).getText());
    }

    @Test
    public void task1Test2(){
        Actions scenario = new Actions(driver);
        WebElement taskElement = driver.findElement(By.id("task1"));
        scenario
                .moveToElement(taskElement)
                .moveToElement(taskElement.findElement(By.name("data")))
                .click()
                .sendKeys("умениям")
                .moveToElement(taskElement.findElement(By.name("btn")))
                .click().perform();
        Assert.assertEquals("Мы стремимся к умениям", driver.findElement(By.id("task1_out")).getText());
    }

    @Test
    public void task1Test3(){
        Actions scenario = new Actions(driver);
        WebElement taskElement = driver.findElement(By.id("task1"));
        scenario
                .moveToElement(taskElement)
                .moveToElement(taskElement.findElement(By.name("data")))
                .click()
                .sendKeys("результату")
                .moveToElement(taskElement.findElement(By.name("btn")))
                .click().perform();
        Assert.assertEquals("Мы стремимся к результату", driver.findElement(By.id("task1_out")).getText());
    }

    public void runScenario(WebElement taskElement, String input) {
        WebElement data = taskElement.findElement(By.name("data"));
        new Actions(driver).moveToElement(taskElement).perform();
        data.clear();
        new Actions(driver)
                .moveToElement(data)
                .click()
                .sendKeys(input)
                .moveToElement(taskElement.findElement(By.name("btn")))
                .click().perform();
    }

    @Test
    public void task2Test(){
        WebElement taskElement = driver.findElement(By.id("task2"));
        runScenario(taskElement, "Трудности");
        Assert.assertEquals("Трудности нас не остановят!", driver.findElement(By.id("task2_out")).getText());
        runScenario(taskElement, "Загадки");
        Assert.assertEquals("Загадки нас не остановят!", driver.findElement(By.id("task2_out")).getText());
        runScenario(taskElement, "Сложные задачи");
        Assert.assertEquals("Сложные задачи нас не остановят!", driver.findElement(By.id("task2_out")).getText());
    }
}
