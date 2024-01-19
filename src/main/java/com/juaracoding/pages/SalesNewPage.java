package com.juaracoding.pages;


import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

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

    @FindBy(xpath = "//a[normalize-space()='2']")
    WebElement btnPaggination;
    @FindBy(xpath= "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
    WebElement btnViewData ;

    @FindBy(xpath= "//button[@id='btnEdit']")
    WebElement btnEditData;

    @FindBy(xpath= "//textarea[@id='address']")
    WebElement updateAlamat;

    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement errorMessageAlamat;

    @FindBy(xpath= "//button[@id='btnUpdate']")
    WebElement btnSaveData;

    @FindBy(xpath= "//button[@id='btnCancelUpdate']")
    WebElement btnCancelEdit;

    @FindBy(xpath= "//tbody/tr[1]/td[3]/div[1]/a[2]/i[1]")
    WebElement btnIconDeleteUpload;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]/span[1]")
    WebElement btnAddFilesBefore;

    @FindBy(xpath = "//input[@id='file']")
    WebElement btnChooseFile;

    @FindBy(xpath = "//button[@id='btnSaveFoto']")
    WebElement btnSaveFoto;

    @FindBy(xpath= "//a[@class='btn btn-primary']")
    WebElement btnSubmit;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement userBtn;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement logoutBtn;

    public void delay(int d){
        try{
            Thread.sleep(d * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void clickNavMenu(){
        this.newMenu.click();
    }

//    public void setStartDate(String startDate) {
//        this.startDate.sendKeys(startDate);
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate.sendKeys(endDate);
//    }

//    public void clickStartDate(String startDateFilter){
//        this.startDate.sendKeys(startDateFilter);
//    }



//    public void clickEndDate(String endDateFilter){
//        this.endDate.sendKeys(endDateFilter);
//    }

    public void clickStartDate() {
        this.startDate.click();
    }

    public void setStartDate(String startDateSet){
        this.startDate.sendKeys(startDateSet);
    }

    public void clickEndDate() {
        this.endDate.click();
    }

    public void setEndDate(String endDateSet){
        this.endDate.sendKeys(endDateSet);
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

    public void clickBtnSearchIcon(){
        this.btnSearchIcon.click();
    }

    public void clickbtnActionView(){
        this.btnViewData.click();
    }
    public void clickBtnRefreshData(){
        this.btnRefreshData.click();
    }

    public void clickBtnPaggination(){
        this.btnPaggination.click();
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

    public void clickbtnAddFilesBefore(){
        this.btnAddFilesBefore.click();

    }

    public void insertFoto(String filename){
        String relativePath = "src/test/resources/files/" + filename;
        File uploadFile = new File(relativePath);
        this.btnChooseFile.sendKeys(uploadFile.getAbsolutePath());
    }

    public void clickBtnSaveFoto(){
        this.btnSaveFoto.click();

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

    public String getErrorMsgAlamat(){
        return this.errorMessageAlamat.getText();
    }

    public void clickUserBtn(){
        this.userBtn.click();
    }

    public void logoutBtnClick(){
        this.logoutBtn.click();
    }
}
