package selenium.alert.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.id("disabled-button")).isEnabled());
        System.out.println(driver.findElement(By.id("enabled-button")).isEnabled());

        WebElement showBtn=driver.findElement(By.id("show-textbox"));
        WebElement hideBtn=driver.findElement(By.id("hide-textbox"));
        WebElement displayTextBox=driver.findElement(By.id("displayed-text"));

        System.out.println(displayTextBox.isDisplayed());
        hideBtn.click();
        Thread.sleep(4000);
        System.out.println(displayTextBox.isDisplayed());
        showBtn.click();
        Thread.sleep(4000);
        System.out.println(displayTextBox.isDisplayed());
        Thread.sleep(4000);
        driver.close();




    }
}
