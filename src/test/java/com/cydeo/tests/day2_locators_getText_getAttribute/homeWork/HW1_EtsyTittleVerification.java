package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTittleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.etsy.com");

        driver.manage().window().maximize();

        WebElement searchBox=driver.findElement(By.tagName("input"));

        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String actualTitle=driver.getTitle();
        String expectedTitle="Wooden spoon | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verifivation failled");
        }

        driver.close();


    }
}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */