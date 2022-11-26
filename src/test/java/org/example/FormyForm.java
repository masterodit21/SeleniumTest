package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FormyForm {
    @Test
    public void input() throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
        String baseURL = "https://formy-project.herokuapp.com/form";
        WebDriver driver = new EdgeDriver();
        driver.get(baseURL);

        driver.findElement(By.id("first-name")).sendKeys("Tedy");
        Thread.sleep(1500);

        driver.findElement(By.id("last-name")).sendKeys("Aditia");
        Thread.sleep(1500);

        driver.findElement(By.id("job-title")).sendKeys("Staff IT Programmer");
        Thread.sleep(1500);

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


//        String expectedText = "The form was successfully submitted!";
//        WebElement actualtext = driver.findElement(By.className("alert alert-success"));
//        assertEquals(actualtext, expectedText);
//
//        assertEquals("The form was successfully submitted!", driver.findElement(By.cssSelector("#alert alert-success")));
//
//        driver.close();
    }
}
