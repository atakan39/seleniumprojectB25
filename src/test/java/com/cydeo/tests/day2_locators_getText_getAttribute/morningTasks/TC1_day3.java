package com.cydeo.tests.day2_locators_getText_getAttribute.morningTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_day3 {
    public static void main(String[] args) throws InterruptedException{

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://login1.nextbasecrm.com");
        Thread.sleep(3000);
        WebElement loginBox=driver.findElement(By.className("login-inp"));
        loginBox.sendKeys("incorrect");
        Thread.sleep(3000);
        WebElement passwordBox=driver.findElement(By.name("USER_PASSWORD"));
       passwordBox.sendKeys("incorrect");
        Thread.sleep(3000);
       WebElement loginButton=driver.findElement(By.className("login-btn"));
       loginButton.click();
        Thread.sleep(3000);
       WebElement errorMessage=driver.findElement(By.className("errortext"));
       String actualErrorMsg=errorMessage.getText();
       String expectedErrorMsg="Incorrect login or password";

       if(actualErrorMsg.equals(expectedErrorMsg)){
           System.out.println("Verification passed");
       }else{
           System.out.println("Verification failed");
       }





    }
}
