package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws Exception{
        //"https://www.facebook.com"
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        System.out.println("Current tittle = "+driver.getTitle());
        System.out.println("Current Url = "+driver.getCurrentUrl());

        driver.get("https://www.google.com");

        System.out.println("Current tittle = "+driver.getTitle());
        System.out.println("Current Url = "+driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("Current tittle = "+driver.getTitle());
        System.out.println("Current Url = "+driver.getCurrentUrl());


        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();




    }
}
