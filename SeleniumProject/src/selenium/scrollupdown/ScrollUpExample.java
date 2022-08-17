package selenium.scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(4000);
       // js.executeScript("window.scrollBy(0,600)");
      //  Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("mousehover")));

        Thread.sleep(5000);
        driver.quit();


    }
}
