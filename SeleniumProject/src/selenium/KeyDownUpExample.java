package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class KeyDownUpExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialspoint.com/index.htm");

        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@id='search-strings']"));

        WebElement searchString=driver.findElement(By.id("search-strings"));

        Actions actions=new Actions(driver);
        actions.moveToElement(searchString).perform();
        actions.keyDown(Keys.SHIFT).click();
        actions.sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(7000);

        driver.close();






    }
}
