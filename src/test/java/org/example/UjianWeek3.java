package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class UjianWeek3 {
      public void checkout() throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "D:\\webdriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/payment-gateway/index.php");

            driver.findElement(By.xpath("//select//option[@value='5']")).click();
            driver.findElement(By.xpath("//input[@class='button special']")).click();

        driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys("5197035190093748");
        driver.findElement(By.xpath("//select//option[@value='7']")).click();
        driver.findElement(By.xpath("//select[@id='year']//option[10]")).click();
        driver.findElement(By.xpath("//input[@id='cvv_code']")).sendKeys("111");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


//        driver.close();
    }
}
