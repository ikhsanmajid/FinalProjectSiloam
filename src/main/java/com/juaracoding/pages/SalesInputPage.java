package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public SalesInputPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


}
