package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage {
    @FindBy()
    WebElement homeText;
    @FindBy()
    WebElement userText;
    @FindBy()
    WebElement sidebar;
    @FindBy()
    WebElement viewAndExportMenu;
}
