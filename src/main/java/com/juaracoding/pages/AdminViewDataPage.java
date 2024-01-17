package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminViewDataPage {
    @FindBy(xpath = "//*[@id=\"content\"]/ol/li[1]/a")
    WebElement homeText;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[2]/a")
    WebElement homeNavMenu;
    @FindBy(xpath = "//*[@id=\"preview\"]")
    WebElement previewDataBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div/a[1]")
    WebElement compress;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div/a[2]/i")
    WebElement expand;
}
