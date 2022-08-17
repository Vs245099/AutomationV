package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocaters {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vs245/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      //  driver.findElement(By.linkText("forgot password?")).click();
       // driver.findElement(By.className("signinbtn")).click();
        driver.findElement(By.partialLinkText("forgot")).click();
        Thread.sleep(3000);
        driver.close();


    }
}
