package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_ZeroBBankHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header=driver.findElement(By.tagName("h3"));
        String actualHeader=header.getText();

        String expectedHeader="Log in to ZeroBank";

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Verification passed");
         }else{
        System.out.println("Verifivation failled");
         }

        WebElement loginBox=driver.findElement(By.id("user_login"));
        loginBox.sendKeys("Atakan39");

        WebElement passwordBox=driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("234sdf45");

        WebElement checkBox=driver.findElement(By.id("user_remember_me"));
        checkBox.click();

        WebElement signInButton=driver.findElement(By.className("btn"));
        signInButton.click();




        driver.close();
    }
}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */