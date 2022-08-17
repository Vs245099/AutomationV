package selenium.ssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslExample {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setHeadless(true);
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");

        Thread.sleep(3000);
        driver.close();
    }
}
