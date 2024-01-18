package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;
import java.io.File;

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

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelUploadBtn;

    @FindBy(xpath = "//*[@id='message']")
    WebElement uploadErrorMsgUpload;

    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement successMsgUpload;

    @FindBy(xpath = "//tbody/tr/td[1]/div[1]/img")
    List<WebElement> imageThumbnailUpload;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement confirmationModalBtnUpload;

    @FindBy(xpath = "//tbody[4]/tr/td/code")
    WebElement errorNextStepMsgUpload;

    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    WebElement successNextStepMsgUpload;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement nextBtnUpload;

    // Tanda Tangan

    @FindBy(xpath = "//input[@id='name']")
    WebElement namaInputTtd;

    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement noBPJSInputTtd;

    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement noKTPInputTtd;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement alamatInputTtd;

    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement selectKotaKTPInputTtd;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement selectFaskesAwalInputTtd;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement selectFaskesTujuanInputTtd;

    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasanInputTtd;

    @FindBy(xpath = "//button[@id='btnEdit']")
    WebElement editBtnTtd;

    @FindBy(xpath = "//button[@id='btnCancelUpdate']")
    WebElement cancelBtnTtd;

    @FindBy(xpath = "//button[@id='btnUpdate']")
    WebElement simpanDataEditBtnTtd;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/a[2]/i")
    List<WebElement> deleteImageBtnTtd;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/a")
    List<WebElement> addFilesBtnTtd;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement submitBtnTtd;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement ttdSaveSuccessMsg;




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
        this.namaInput.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
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
        this.noBPJSInputTtd.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        this.noBPJSInput.sendKeys(noBPJSInput);
    }

    public void setNoKTPInput(String noKTPInput) {
        this.noKTPInputTtd.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
        this.noKTPInput.sendKeys(noKTPInput);
    }

    public void setAlamatInput(String alamatInput){
        this.alamatInput.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
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
        this.faskesAwalInput.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
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

    public String getAlasanDisplay(){
        return this.alasanInput.getAttribute("style");
    }

    public void setAlasanInput(String alasan){
        this.alasanInput.sendKeys(Keys.CONTROL + "A" + Keys.DELETE);
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

    // click

    public void clickFaskesAwalUpload(){
        actions.click(fotoFaskesAwalBtnUpload).perform();
    }

    public void clickFaskesTujuanUpload(){
        actions.click(fotoFaskesTujuanBtnUpload).perform();
    }

    public void clickTandaTanganDigitalUpload(){
        actions.click(tandaTanganDigitalBtnUpload).perform();
    }

    public void insertFotoFaskesAwal(String filename){
        String relativePath = "src/test/resources/files/" + filename;
        File uploadFile = new File(relativePath);
        this.inputFileUpload.sendKeys(uploadFile.getAbsolutePath());
    }

    public void insertTxtFoto(String filename){
        String relativePath = "src/test/resources/files/"+filename;
        File uploadFile = new File(relativePath);
        this.inputFileUpload.sendKeys(uploadFile.getAbsolutePath());
    }

    public String getErrorMsgUpload(){
        return this.uploadErrorMsgUpload.getText();
    }

    public void clickSimpanFile(){
        actions.click(this.saveUploadFotoBtnUpload).perform();
    }

    public void clickCancelBtn(){
        actions.click(this.cancelUploadBtn).perform();
    }

    public String getThumbnailFaskesAwal(){
        String thumb = this.imageThumbnailUpload.get(0).getAttribute("src");
        return thumb;
    }

    public String getThumbnailFaskesTujuan(){
        String thumb = this.imageThumbnailUpload.get(1).getAttribute("src");
        return thumb;
    }

    public String getThumbnailTandaTangan(){
        String thumb = this.imageThumbnailUpload.get(2).getAttribute("src");
        return thumb;
    }

    public String getSuccessUpload(){
        return this.successMsgUpload.getText();
    }

    public String getDokumenLengkapMsgUpload(){
        return this.successNextStepMsgUpload.getText();
    }

    public void clickOkModal(){
        actions.click(this.confirmationModalBtnUpload).perform();
    }

    public void clickSelanjutnyaBtnUpload(){
        actions.click(this.nextBtnUpload).perform();
    }

    // Modul Tanda Tangan

    public void clickEditBtnTtd(){
        actions.click(this.editBtnTtd).perform();
    }

    public Boolean checkNameEnabledTtd(){
        String element = this.namaInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkNoBPJSEnabledTtd(){
        String element = this.noBPJSInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkNoKTPEnabledTtd(){
        String element = this.noKTPInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkAlamatEnabledTtd(){
        String element = this.alamatInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkKotaKTPEnabledTtd(){
        String element = this.selectKotaKTPInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkFaskesAwalEnabledTtd(){
        String element = this.selectFaskesAwalInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkFaskesTujuanEnabledTtd(){
        String element = this.selectFaskesTujuanInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean checkAlasanEnabledTtd(){
        String element = this.alasanInputTtd.getAttribute("disabled");
        if (element == null){
            return true;
        }else {
            return false;
        }
    }

    public void clickSimpanDataEditBtn(){
       actions.click(this.simpanDataEditBtnTtd).perform();
    }

    public void clickCancelDataEditBtn(){
        actions.click(this.cancelBtnTtd).perform();
    }

    public void clickSubmitDataTtd(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        actions.click(this.submitBtnTtd).perform();
    }

    public String getSuccessSubmitMsg(){
        return this.ttdSaveSuccessMsg.getText().substring(0, this.ttdSaveSuccessMsg.getText().length() - 2);
    }

}
