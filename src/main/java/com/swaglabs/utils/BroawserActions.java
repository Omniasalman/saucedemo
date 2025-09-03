package com.swaglabs.utils;

import org.openqa.selenium.WebDriver;

public class BroawserActions {
    private BroawserActions() {

    }

    public static void navigateToURL(WebDriver driver, String url) {
        driver.get(url);
    }

    public static String getCurrentURL(WebDriver driver){
        return driver.getCurrentUrl();
    }
}
