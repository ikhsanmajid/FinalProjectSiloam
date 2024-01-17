package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage {
    @FindBy(xpath = "//*[@id=\"content\"]/ol/li[1]/a")
    WebElement homeText;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[3]/a/span")
    WebElement viewAndExport;
}
