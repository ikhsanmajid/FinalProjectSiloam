package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
    @FindBy(xpath = "//*[@id=\"content\"]/ol/li[1]/a")
    WebElement homeText;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[3]/a/span")
    WebElement viewAndExportNavMenu;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a")
    WebElement sidebar;
    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/a/span")
    WebElement userAdmin;
    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/div/a")
    WebElement logout;

    private WebDriver driver;

    public AdminHomePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void clickHomeText(){
        this.homeText.click();
    }

    public void clickviewAndExportNavMenu(){
        this.viewAndExportNavMenu.click();
    }

    public void clickSidebar(){
        this.sidebar.click();
    }

    public void clickUserAdmin(){
        this.userAdmin.click();
    }

    public void clickLogout(){
        this.logout.click();
    }

}
