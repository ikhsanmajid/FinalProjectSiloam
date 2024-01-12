package com.juaracoding.pages;


import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesNewPage {

    private WebDriver driver;

    public SalesNewPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a")
    private WebElement newMenu;

    @FindBy(xpath="//input[@id='tgl']")
    private WebElement startDate;

    @FindBy(xpath="//input[@id='tgl2']")
    private WebElement endDate;

    @FindBy(xpath="//button[@id='btn-filter']")
    private WebElement btnFilterData;

    @FindBy(xpath="//button[@id='btn-reset']")
    private WebElement btnResetDate;

    @FindBy(xpath="//input[@type='search']")
    private WebElement searchKeywordInput;

    @FindBy(xpath="//i[@class='fa fa-search']")
    private WebElement btnSearchIcon;

    @FindBy(xpath= "//span[@id='btnRefresh']")
    private WebElement btnRefreshData;

    @FindBy(xpath= "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
    private WebElement btnViewData ;


    @FindBy(xpath= "//button[@id='btnEdit']")
    private WebElement btnEditData;

    @FindBy(xpath= "//textarea[@id='address']")
    private WebElement updateAlamat;

    @FindBy(xpath= "//button[@id='btnUpdate']")
    private WebElement btnSaveData;

    @FindBy(xpath= "//button[@id='btnCancelUpdate']")
    private WebElement btnCancelEdit;

    @FindBy(xpath= "//tbody/tr[1]/td[3]/div[1]/a[2]/i[1]")
    private WebElement btnIconDeleteUpload;

    @FindBy(xpath= "//a[@class='btn btn-primary']")
    private WebElement btnSubmit;

}
