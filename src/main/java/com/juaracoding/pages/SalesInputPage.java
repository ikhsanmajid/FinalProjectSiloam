package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesInputPage {

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



}
