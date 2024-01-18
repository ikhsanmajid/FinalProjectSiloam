package com.juaracoding.pages;


import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
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
    WebElement newMenu;

    @FindBy(xpath="//input[@id='tgl']")
    WebElement startDate;

    @FindBy(xpath="//input[@id='tgl2']")
    WebElement endDate;

    @FindBy(xpath="//button[@id='btn-filter']")
    WebElement btnFilterData;

    @FindBy(xpath="//button[@id='btn-reset']")
    WebElement btnResetDate;

    @FindBy(xpath="//input[@type='search']")
    WebElement searchKeywordInput;

    @FindBy(xpath="//i[@class='fa fa-search']")
    WebElement btnSearchIcon;

    @FindBy(xpath= "//span[@id='btnRefresh']")
    WebElement btnRefreshData;

    @FindBy(xpath= "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
    WebElement btnViewData ;


    @FindBy(xpath= "//button[@id='btnEdit']")
    WebElement btnEditData;

    @FindBy(xpath= "//textarea[@id='address']")
    WebElement updateAlamat;

    @FindBy(xpath= "//button[@id='btnUpdate']")
    WebElement btnSaveData;

    @FindBy(xpath= "//button[@id='btnCancelUpdate']")
    WebElement btnCancelEdit;

    @FindBy(xpath= "//tbody/tr[1]/td[3]/div[1]/a[2]/i[1]")
    WebElement btnIconDeleteUpload;

    @FindBy(xpath= "//a[@class='btn btn-primary']")
    WebElement btnSubmit;


    public void clickNavMenu(){
        this.newMenu.click();
    }

    public void clickStartDate(){
        this.startDate.click();
    }

    public void clickStartDate(String startDateFilter){
        this.startDate.sendKeys(startDateFilter);
    }

    public void clickEndDate(){
        this.endDate.click();
    }

    public void clickEndDate(String endDateFilter){
        this.endDate.sendKeys(endDateFilter);
    }

    public void clickBtnFilterData() {
        this.btnFilterData.click();

    }

    public void clickBtnResetDate(){
        this.btnResetDate.click();
    }

    public void setInputSearchKeyword(String searchKeywordInput){
        this.searchKeywordInput.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        this.searchKeywordInput.sendKeys(searchKeywordInput);
    }

    public void clickBtnRefreshData(){
        this.btnRefreshData.click();
    }

    public void clickBtnViewData(){
        this.btnViewData.click();
    }

    public void clickBtnEditData(){
        this.btnEditData.click();
    }

    public void setInputUpdateAlamat(String updateAlamat){
    this.updateAlamat.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
    this.updateAlamat.sendKeys(updateAlamat);
    }
    public void clickBtnSaveData(){
        this.btnSaveData.click();
    }
    public void clickbtnCancelEdit(){
        this.btnCancelEdit.click();
    }
    public void clickBtnIconDeleteUpload(){
        this.btnIconDeleteUpload.click();
    }

    public void clickBtnSubmit(){
        this.btnSubmit.click();
    }
}
