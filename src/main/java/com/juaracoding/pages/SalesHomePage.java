package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesHomePage {
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement homeText;
    @FindBy(xpath = "//div[@class='info']")
    WebElement userText;

    @FindBy(xpath = "//span[normalize-space()='Input']")
    WebElement inputPage;

    private WebDriver driver;
    private final Actions actions;

    public SalesHomePage(){
        this.driver = DriverSingleton.getDriver();
        this.actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }


    public String getHomeText() {
        return homeText.getText();
    }

    public String getUserText() {
        return userText.getText();
    }

    public void clickInputPage(){
        actions.click(inputPage).perform();
    }
}
