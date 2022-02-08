package com.cydeo.tests.day2_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_Practice_Cydeo_CLassLocater {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");



       WebElement homeLink=driver.findElement(By.className("nav-link"));
       homeLink.click();

        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.err.println("Verifivation failled");
        }

        driver.close();
    }
}
