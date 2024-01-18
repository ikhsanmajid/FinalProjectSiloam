package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    List<WebElement> prevPdf;
    @FindBy(xpath = "//*[@id='data-table-default2']/tbody")
    WebElement table;

    private WebDriver driver;
    private final Actions actions;

    public AdminViewExportPage(){
        this.driver = DriverSingleton.getDriver();
        this.actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }

    public void clickHomeNavMenu(){
        this.homeNavMenu.click();
    }
    public void buka(){
        System.out.println(table.getText());
    }
    public void clickStartDate(){
        this.startDate.click();
    }
    public void setStartDate(String startDateIn){
        this.startDate.sendKeys(startDateIn);
    }
    public void clickEndDate(){
        this.endDate.click();
    }
    public void setEndDate(String endDateIn){
        this.endDate.sendKeys(endDateIn);
    }
    public void clickFilterBtn(){
        this.filterBtn.click();
    }
    public void clickRefreshBtn(){
        this.refreshBtn.click();
    }
    public void clickExportBtn(){
        this.exportBtn.click();
    }
    public void clickViewBtn(int n){
        this.viewBtn.get(n).click();
    }
    public void clickPrevFaskesAwal(int n){
        this.prevFaskesAwal.get(n).click();
    }
    public void clickPrevFaskeTujuanl(int n){
        this.prevFaskesTujuan.get(n).click();
    }
    public void clickPrevPdf(int n){
        this.prevPdf.get(n).click();
    }
    public String getStartDatedMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.startDate);
        return message;
    }
    public String getEndDatedMsg(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return arguments[0].validationMessage;", this.endDate);
        return message;
    }
}
