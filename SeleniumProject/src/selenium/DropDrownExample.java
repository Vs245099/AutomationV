package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDrownExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
       // WebElement element=driver.findElement(By.xpath("//select[@name='country']"));
       // WebElement drpDown=driver.findElement(By.name("country"));
        WebElement element=driver.findElement(By.xpath("//select[@name='Month']"));
        WebElement drpDown=driver.findElement(By.name("Month"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",drpDown);

        Select select=new Select(drpDown);
       // select.selectByIndex(3);
       // select.selectByValue("BR");
       // select.selectByVisibleText("India");
       // select.selectByIndex(3);
       // select.selectByValue("Ap");
        select.selectByVisibleText("October");

        Thread.sleep(6000);
        driver.close();

    }
}
