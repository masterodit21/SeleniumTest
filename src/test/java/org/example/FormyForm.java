package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

@Test
public class FormyForm {
    public void input() throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
        String baseURL = "https://formy-project.herokuapp.com/form";
        WebDriver driver = new EdgeDriver();
        driver.get(baseURL);

        driver.findElement(By.id("first-name")).sendKeys("Tedy");
        Thread.sleep(1000);

        driver.findElement(By.id("last-name")).sendKeys("Aditia");
        Thread.sleep(1000);

        driver.findElement(By.id("job-title")).sendKeys("Staff IT Programmer");
        Thread.sleep(1000);

        driver.findElement(By.id("radio-button-1")).click();
        Thread.sleep(600);

        driver.findElement(By.id("radio-button-2")).click();
        Thread.sleep(600);

        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(600);

        Select menu = new Select(driver.findElement(By.id("select-menu")));
        menu.selectByValue("1");
        Thread.sleep(600);

        driver.findElement(By.id("datepicker")).sendKeys("12/12/2022");
        Thread.sleep(600);

        driver.findElement(By.xpath("//a[@role='button']")).click();
        Thread.sleep(1000);

        String expectText = "The form was successfully submitted!";
        WebElement actualText = driver.findElement(By.xpath("//div[@role='alert']"));
        assertEquals(actualText.getText(), expectText);

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement resultText = driver.findElement(By.xpath("//div[@role='alert']"));
//        String expecttext = "The form was successfully submitted!";
//        String actualtext = resultText.getText().toString();
//        assertEquals(actualtext,expecttext);

        driver.close();
    }
}
