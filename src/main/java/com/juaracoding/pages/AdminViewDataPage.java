package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminViewDataPage {
    @FindBy(xpath = "//*[@id=\"preview\"]")
    WebElement prevDataBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div/a[1]")
    WebElement compress;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div/a[2]/i")
    WebElement expand;

    public void clickPrevDataBtn(){
        this.prevDataBtn.click();
    }
    public void clickCompress(){
        this.compress.click();
    }
    public void clickExpand(){
        this.expand.click();
    }
}
