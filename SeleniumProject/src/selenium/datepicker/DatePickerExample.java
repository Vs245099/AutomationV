package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        String date = "25";
        String month = "july";
        String year = "2022";

        driver.findElement(By.id("onward_cal")).click();
        String Month =
                driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
        String Year =
                driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
        if (Month.equals(month) && Year.equals(year)){
            List<WebElement> allDate=
                    driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
            for (WebElement date1:allDate){
                if (date1.getText().equals(date)){
                    date1.click();
                    break;
                }
            }
        }
        }
    }