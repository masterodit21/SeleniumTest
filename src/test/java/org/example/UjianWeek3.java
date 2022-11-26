package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class UjianWeek3 {
    public void checkout() throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "D:\\webdriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/payment-gateway/index.php");

        driver.findElement(By.xpath("//input[@class='button special']")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.id("card-nmuber")).sendKeys("tedy");

        driver.close();
    }
}
