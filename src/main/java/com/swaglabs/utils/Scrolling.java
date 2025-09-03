package com.swaglabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
private Scrolling(){

}

//Scroll to element
    public static void ScrollToElement(WebDriver driver, By locator){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" ,
                driver.findElement(locator));
    }
}
