package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[1]/input")
    WebElement usernameInput;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[2]/input")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div[1]/b")
    WebElement loginPageTitle;

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void setUsernameInput(String username){
        this.usernameInput.sendKeys(username);
    }

    public void setPasswordInput(String password) {
        this.passwordInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        this.loginBtn.click();
    }

    public String checkRequiredUsername(){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;", this.usernameInput);
        if(isRequired )
        {
            return "passed";
        }else{
            return "failed";
        }
    }

    public String checkRequiredPassword(){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;", this.passwordInput);
        if(isRequired )
        {
            return "passed";
        }else{
            return "failed";
        }
    }

    public String checkRedirectToLogin(){
        return this.loginPageTitle.getText().trim();
    }
    public String getUsernameMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.usernameInput);
        return message;
    }
    public String getPasswordMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.passwordInput);
        return message;
    }
    public String getPasswordValue(){
        String value = this.passwordInput.getAttribute("value");
        return value;
    }
}
