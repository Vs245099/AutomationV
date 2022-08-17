package selenium.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("C:\\Users\\vs245\\Pictures\\Camera Roll\\Screenshot (23).png"));

        Thread.sleep(3000);
        driver.close();
    }
}
