package selenium.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement element= driver.findElement(By.id("file-upload"));
        Thread.sleep(6000);
        element.sendKeys("C:\\Users\\vs245\\Documents\\APNA GURU");
        driver.findElement(By.id("file-submit")).click();

            Thread.sleep(6000);
            driver.quit();

    }

}
