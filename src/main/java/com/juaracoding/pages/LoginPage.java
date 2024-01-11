package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy()
    WebElement usernameInput;
    @FindBy()
    WebElement passwordInput;
    @FindBy()
    WebElement btnLogin;
    @FindBy()
    WebElement btnLogin;
    @FindBy()
    WebElement btnLogin;
    //Contoh




}
