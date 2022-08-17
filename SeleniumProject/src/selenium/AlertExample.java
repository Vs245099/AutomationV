package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();

       // driver.findElement(By.id("alertbtn")).click();
        driver.findElement(By.id("confirmbtn")).click();
            Thread.sleep(5000);


        Alert alert= driver.switchTo().alert();
        alert.accept();

        Thread.sleep(5000);
        driver.close();


    }







}
