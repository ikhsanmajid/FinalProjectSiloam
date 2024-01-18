package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AdminHomePage;
import com.juaracoding.pages.AdminViewDataPage;
import com.juaracoding.pages.AdminViewExportPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AdminViewExportTest {
    private static WebDriver driver;
    private static AdminHomePage adminHomePage = new AdminHomePage();
    private static AdminViewExportPage adminViewExportPage = new AdminViewExportPage();

    private static ExtentTest extentTest;

    public AdminViewExportTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin home")
    public void admin_home(){
        String url = "https://dev.ptdika.com/siloam/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        extentTest.log(LogStatus.PASS, "Admin home");
    }
    @When("Click View and Export")
    public void click_view_export_navmenu(){
        adminHomePage.clickViewAndExportNavMenu();
        String expectedUrl = "https://dev.ptdika.com/siloam/bd/export_data";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Click View and Export");
    }
    @And("Click Start date")
    public void click_start_date(){
        adminViewExportPage.clickStartDate();
        extentTest.log(LogStatus.PASS,"Click Start date");
    }
    @And("Click End date")
    public void click_end_date(){
        adminViewExportPage.clickEndDate();
        extentTest.log(LogStatus.PASS,"Click End date");
    }
    @And("Click refresh button")
    public void click_refresh_button(){
        adminViewExportPage.clickRefreshBtn();
        extentTest.log(LogStatus.PASS,"Click refresh button");
    }
    @And("Click filter button")
    public void click_filter_button(){
        adminViewExportPage.clickFilterBtn();
        extentTest.log(LogStatus.PASS,"Click filter button");
    }
    @And("Enter Start date 1 Januari 2024")
    public void enter_start_date_1_januari_2024(){
        adminViewExportPage.setStartDate("2024-01-01");
        extentTest.log(LogStatus.PASS,"Enter Start date 1 Januari 2024");
    }
    @And("Enter Start date 31 Januari 2024")
    public void enter_start_date_31_januari_2024(){
        adminViewExportPage.setStartDate("2024-01-31");
        extentTest.log(LogStatus.PASS,"Enter Start date 31 Januari 2024");
    }
    @And("Enter End date 1 Januari 2024")
    public void enter_end_date_1_januari_2024(){
        adminViewExportPage.setStartDate("2024-01-01");
        extentTest.log(LogStatus.PASS,"Enter Endt date 1 Januari 2024");
    }
    @And("Enter End date 31 Januari 2024")
    public void enter_end_date_31_januari_2024(){
        adminViewExportPage.setStartDate("2024-01-31");
        extentTest.log(LogStatus.PASS,"Enter End date 31 Januari 2024");
    }
    @Then("Message start date fill out this")
    public void message_start_date_fill_out_this(){
        String actualMsg = adminViewExportPage.getStartDatedMsg();
        String expectMsg = "fill out this";
        Assert.assertEquals(actualMsg, expectMsg, "Message start date fill out this");
    }
    @Then("Message end date fill out this")
    public void message_end_date_fill_out_this(){
        String actualMsg = adminViewExportPage.getStartDatedMsg();
        String expectMsg = "fill out this";
        Assert.assertEquals(actualMsg, expectMsg, "Message end date fill out this");
    }
    @Then("Shows Valid Data")
    public void show_valid_data(){
        adminViewExportPage.buka();
    }
}
