package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class FormyElement {
    public void formyelement() throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "D:\\webdriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get(" https://formy-project.herokuapp.com/buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']"));button1.click();
        Thread.sleep(500);
        WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']"));button2.click();
        Thread.sleep(500);
        WebElement button3 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']"));button3.click();
        Thread.sleep(500);
        WebElement button4 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']"));button4.click();
        Thread.sleep(500);
        WebElement button5 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']"));button5.click();
        Thread.sleep(500);
        WebElement button6 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']"));button6.click();
        Thread.sleep(500);

        WebElement button7 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(1)"));button7.click();
        Thread.sleep(500);
        WebElement button8 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(2)"));button8.click();
        Thread.sleep(500);
        WebElement button9 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(3)"));button9.click();
        Thread.sleep(500);

        WebElement button10 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(1)"));button10.click();
        Thread.sleep(500);
        WebElement button11 = driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(2)"));button11.click();
        Thread.sleep(500);
        WebElement button12 = driver.findElement(By.cssSelector("#btnGroupDrop1"));button12.click();
        Thread.sleep(500);

        String expectPrimary = "Primary";
        assertEquals(button1.getText(), expectPrimary);
        String expectSucces = "Success";
        assertEquals(button2.getText(), expectSucces);
        String expectInfo = "Info";
        assertEquals(button3.getText(), expectInfo);
        String expectWarning = "Warning";
        assertEquals(button4.getText(), expectWarning);
        String expectDanger = "Danger";
        assertEquals(button5.getText(), expectDanger);
        String expectLink = "Link";
        assertEquals(button6.getText(), expectLink);
        String expectLeft = "Left";
        assertEquals(button7.getText(), expectLeft);
        String expectMiddle = "Middle";
        assertEquals(button8.getText(), expectMiddle);
        String expectRight = "Right";
        assertEquals(button9.getText(), expectRight);
        String expectSatu = "1";
        assertEquals(button10.getText(), expectSatu);
        String expectDua = "2";
        assertEquals(button11.getText(), expectDua);
        String expectDropDown = "Dropdown";
        assertEquals(button12.getText(), expectDropDown);

        driver.close();
    }
}
