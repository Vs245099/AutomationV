package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement element=driver.findElement(By.xpath("//input[@id='benzradio']"));

        WebElement redioBtn=driver.findElement(By.id("benzradio"));
        redioBtn.click();
        Thread.sleep(4000);
        driver.close();

    }
}
