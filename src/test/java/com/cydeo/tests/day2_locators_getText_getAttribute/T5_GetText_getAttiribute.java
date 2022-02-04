package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_getAttiribute {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText=driver.findElement(By.tagName("h2"));

        String actualHeaderText=headerText.getText();
        String expectedHeaderTest="Registration form";

        if(actualHeaderText.equals(expectedHeaderTest)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }

        //Expected: Registration form


        //4- Locate “First name” input box

        WebElement inputBox=driver.findElement(By.name("firstname"));

        String actualAttributeValue=inputBox.getAttribute("placeholder");
        String expectedAttributeValue="first name";

        //5- Verify placeholder attribute’s value is as expected: Expected: first name

        if(actualAttributeValue.equals(expectedAttributeValue)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }

    }
}
