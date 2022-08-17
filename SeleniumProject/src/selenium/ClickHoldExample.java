package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementE= driver.findElement(By.xpath("//li[@name='E']"));
        WebElement elementH= driver.findElement(By.xpath("//li[@name='H']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",elementE);

        Actions actions=new Actions(driver);
        actions.clickAndHold(elementE).perform();
        actions.moveToElement(elementH).perform();
            Thread.sleep(6000);
            driver.close();


    }
}
