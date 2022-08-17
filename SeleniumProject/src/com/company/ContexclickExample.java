package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexclickExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement element =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();
        Thread.sleep(4000);

    }
}
