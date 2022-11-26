package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class UjianWeek3 {
      public void checkout() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/payment-gateway/index.php");

        driver.findElement(By.xpath("//input[@class='button special']")).click();

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys("5197035190093748");
//        Thread.sleep(1000);

//        driver.close();
    }
}
