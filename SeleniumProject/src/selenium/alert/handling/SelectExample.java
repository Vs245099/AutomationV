package selenium.alert.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();

        WebElement element1=driver.findElement(By.id("bmwcheck"));
        WebElement element2=driver.findElement(By.id("benzcheck"));
        System.out.println(element1.isSelected());
        element2.click();
        System.out.println(element2.isSelected());
        Thread.sleep(4000);
        driver.close();

    }
}
