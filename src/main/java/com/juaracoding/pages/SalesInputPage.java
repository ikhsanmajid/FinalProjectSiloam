package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;

public class SalesInputPage {

    @FindBy(xpath = "//input[@id='name']")
    WebElement namaInput;

    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement noBPJSInput;

    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement noKTPInput;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement alamatInput;

    @FindBy(xpath = "//form/div[4]//span")
    WebElement alamatErrorMsg;

    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement selectKotaKTPInput;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement searchBoxKotaInput;

    @FindBy(xpath = "//ul[@id='select2-ktp_city-results']/li")
    List<WebElement> listKotaKTPInput;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwalInput;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement selectFaskesTujuanInput;

    @FindBy(xpath = "//ul[@id='select2-destination_faskes-results']/li")
    List<WebElement> listFaskesTujuanInput;

    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasanInput;

    @FindBy(xpath = "//form/div[@id='row-reason']//span")
    WebElement alasanMsgInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement simpanDataBtnInput;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement dataBerhasilDisimpanMsg;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement fotoFaskesAwalBtnUpload;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement fotoFaskesTujuanBtnUpload;

    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement tandaTanganDigitalBtnUpload;

    @FindBy(xpath = "//*[@id='selectImage']//input[@id='file']")
    WebElement inputFileUpload;

    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement saveUploadFotoBtnUpload;

    @FindBy(xpath = "//*[@id='message']")
    WebElement uploadErrorMsgUpload;

    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement successMsgUpload;

    @FindBy(xpath = "//tbody[1]/tr[1]/td[1]/div[1]/img")
    List<WebElement> imageThumbnailUpload;

    @FindBy(xpath = "//tbody[4]/tr/td/code")
    WebElement errorNextStepMsgUpload;

    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    WebElement successNextStepMsgUpload;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement nextBtnUpload;

    @FindBy(xpath = "//button[@id='btnEdit']")
    WebElement editBtnTtd;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/a[2]/i")
    List<WebElement> deleteImageBtnTtd;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/a")
    List<WebElement> addFilesBtnTtd;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div/div[2]/div/div/div[2]/a")
    WebElement submitBtnTtd;




    private WebDriver driver;
    private final Actions actions;

    public SalesInputPage(){
        this.driver = DriverSingleton.getDriver();
        this.actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }

    public void delay(int d){
        try{
            Thread.sleep(d * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void setNamaInput(String namaInput) {
        this.namaInput.sendKeys(namaInput);
    }

    public String getValidationNameMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.namaInput);
        return message;
    }

    public String getValidationBPJSMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.noBPJSInput);
        return message;
    }

    public String getValidationKTPMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.noKTPInput);
        return message;
    }

    public void setNoBPJSInput(String noBPJSInput) {
        this.noBPJSInput.sendKeys(noBPJSInput);
    }

    public void setNoKTPInput(String noKTPInput) {
        this.noKTPInput.sendKeys(noKTPInput);
    }

    public void setAlamatInput(String alamatInput){
        this.alamatInput.sendKeys(alamatInput);
    }

    public void clickKotaKTP() {
        actions.click(selectKotaKTPInput).perform();
    }

    public void setSearchBoxKotaInput(String kota){
        this.searchBoxKotaInput.sendKeys(kota);
    }

    public void clickKotaKTPList(int index){
        this.listKotaKTPInput.get(index).click();
    }

    public void setFaskesAwalInput(String faskes){
        this.faskesAwalInput.sendKeys(faskes);
    }

    public void clickFaskesTujuan(){
        actions.click(selectFaskesTujuanInput).perform();
    }

    public void setSearchBoxFaskesInput(String faskes){
        this.searchBoxKotaInput.sendKeys(faskes);
    }

    public void clickFaskesTujuanList(int index){
        this.listFaskesTujuanInput.get(index).click();
    }

    public void setAlasanInput(String alasan){
        this.alasanInput.sendKeys(alasan);
    }

    public void clickSimpanData(){
        actions.click(simpanDataBtnInput).perform();
    }

    public String getDataBerhasilDisimpan(){
        String textMsg = dataBerhasilDisimpanMsg.getText();
        return textMsg.substring(0, textMsg.length() - 2);
    }

    public String getAlamatErrorMsg(){
        return this.alamatErrorMsg.getText();
    }

    public String getAlasanErrorMsg(){
        return this.alasanMsgInput.getText();
    }
}
