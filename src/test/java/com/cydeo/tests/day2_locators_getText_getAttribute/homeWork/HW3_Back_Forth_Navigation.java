package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_Back_Forth_Navigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement gmailLink=driver.findElement(By.className("gb_d"));
        gmailLink.click();

        String actualTitle= driver.getTitle();
        String expectedTitleContain="Gmail";

        if(actualTitle.contains(expectedTitleContain)){
            System.out.println("Verification passed");
        }else{
            System.err.println("Verifivation failled");
        }

        driver.navigate().back();

        actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.err.println("Verifivation failled");
        }

        driver.close();

    }
}
