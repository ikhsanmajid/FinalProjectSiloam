package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminViewExportPage {
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[2]/a")
    WebElement homeNavMenu;
    @FindBy(xpath = "//*[@id=\"datepicker\"]")
    WebElement startDate;
    @FindBy(xpath = "//*[@id=\"datepicker2\"]")
    WebElement endDate;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[3]/div/button")
    WebElement filterBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[3]/div/a")
    WebElement refreshBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/form/button")
    WebElement exportBtn;
    @FindBy(xpath = " //*[@id=\"data-table-default2\"]/tbody/tr[2]/td[2]/a")
    List<WebElement> viewBtn;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[7]/a")
    List<WebElement> prevFaskesAwal;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[8]/a")
    List<WebElement> prevFaskesTujuan;
    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[8]/a")
    List<WebElement> prevdfAgreement;

}
