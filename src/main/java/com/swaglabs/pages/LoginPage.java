package com.swaglabs.pages;

import com.swaglabs.utils.BroawserActions;
import com.swaglabs.utils.ElementAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    //Locators
    private final WebDriver driver;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //navigate to the login page
    public void navigateToLoginPage() {
        BroawserActions.navigateToURL(driver, "https://www.saucedemo.com/");
    }

    /*
    we create parameter in action function to avoid passing row data
    and this to make different between parameter and variable
     */

    //Action >>wait >> scroll >>find >> sendKeys
    public void enterUserName(String username) {
        ElementAction.sendData(driver, this.username, username);
    }

    public void enterPassword(String password) {
        ElementAction.sendData(driver, this.password, password);
    }

    public void clickLogin() {
        ElementAction.clickElement(driver, loginButton);
    }

    //Validation
    /*
    depend in testng
     */

    public void assertSuccessfulLogin() {
        Assert.assertEquals(BroawserActions.getCurrentURL(driver), "https://www.saucedemo.com/inventory.html");
    }


}
