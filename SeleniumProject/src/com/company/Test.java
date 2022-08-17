package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("Vs245099@gmail.com");
        WebElement element1 =driver.findElement(By.xpath("//input[@name='login']"));
        Thread.sleep(3000);
      //  driver.findElements(By.tagName("input"));
        driver.quit();
       // System.out.println(driver.getTitle());
       // System.out.println(driver.getCurrentUrl());
      //  System.out.println(driver.getPageSource());
       // driver.close();



    }
}
