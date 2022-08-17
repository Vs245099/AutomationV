package selenium.multiplewindo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='click']")).click();

        String windowId= driver.getWindowHandle();
        Set<String>windowIds= driver.getWindowHandles();

        for (String s : windowIds){
            if (s.contains(windowId)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
            }
            driver.switchTo().window(windowId);

        }
        driver.quit();


    }
}
