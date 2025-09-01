package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Locators
    private final WebDriver driver;
    private final By username=By.id("user-name");
    private final By password =By.id("password");
    private final By loginButton=By.id("login-button");
    //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    /*
    we create parameter in action function to avoid passing row data
    and this to make different between parameter and variable
     */

    //Action >>wait >> scroll >>find >> sendkeys
    public void enterUserName(String username){
        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    //Validation
}
