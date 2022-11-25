package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class FormyForm {
    @Test
    public void input() throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
        String baseURL = "https://formy-project.herokuapp.com/form";
        WebDriver driver = new EdgeDriver();
        driver.get(baseURL);

        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Tedy");
        Thread.sleep(1500);
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Aditia");
        Thread.sleep(1500);
        WebElement job = driver.findElement(By.id("job-title"));
        job.sendKeys("Staff IT Programmer");
        Thread.sleep(1500);
        WebElement radio = driver.findElement(By.id("radio-button-1"));
        radio.click();
        Thread.sleep(600);
        WebElement radio2 = driver.findElement(By.id("radio-button-2"));
        radio2.click();
        Thread.sleep(600);
        WebElement checkbox = driver.findElement(By.id("checkbox-1"));
        checkbox.click();
        Thread.sleep(600);

        Select menu = new Select(driver.findElement(By.id("select-menu")));
        menu.selectByValue("1");
        Thread.sleep(600);

        WebElement selectDate = driver.findElement(By.id("datepicker"));
        selectDate.click();
        Thread.sleep(2000);
        List<WebElement> dates = driver.findElements(By.className("day"));

        int count = driver.findElements(By.className("day")).size();

        for(int i=0;i<count;i++){
            String text=driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("25")){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }

        Thread.sleep(1500);

        driver.findElement(By.xpath("//a[@role='button']")).click();

//        driver.close();
    }
}
