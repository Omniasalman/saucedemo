package com.swaglabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementAction {
    private ElementAction(){
    }
    //sendKeys
public static void sendData(WebDriver driver, By locator ,String data){
        Waits.waitElementVisible(driver,locator);
        Scrolling.ScrollToElement(driver,locator);
        driver.findElement(locator).sendKeys(data);
    }

    public static void clickElement(WebDriver driver, By locator ){
        Waits.waitElementVisible(driver,locator);
        Scrolling.ScrollToElement(driver,locator);
        driver.findElement(locator).click();
    }
}
