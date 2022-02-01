package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_YahooTittleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // make page full screen
        driver.manage().window().maximize();
        // go to the page
        driver.get("https://www.yahoo.com");

        //3.verify title:
        //Expected:Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification Passed!");
        } else {
            System.out.println("Title is NOT expected. Verification Failed!");
        }
    }
}
//  yahoo title verification
// open chrome browser
// go to https://www.yahoo.com
//verify title:
// expected: Yahoo