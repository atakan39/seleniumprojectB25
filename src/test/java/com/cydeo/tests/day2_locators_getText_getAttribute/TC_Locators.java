package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Locators {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://google.com");

     //  3. Write "apple" in search box

        WebElement searchBox= driver.findElement(By.name("q"));

        searchBox.sendKeys("apple"+ Keys.ENTER);


        // .sendKeys("String to be sent);.sendKeys("Apple")

        String actualTitle= driver.getTitle();

        if(actualTitle.startsWith("apple")){
            System.out.println("Verification is passed");
        }else{
            System.out.println("Verification is failled");
        }


        driver.close();

    }
}
/*
TC#3: Google search
1- Open a chrome browser
search apple in the console.
4- Click google search button
5- Verify title:
Expected: Title should start with "apple" word
 */