package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.SalesHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSalesTest {

    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static SalesHomePage salesHomePage = new SalesHomePage();
    private static ExtentTest extentTest;
    public LoginSalesTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Sales enter URL web Siloam")
    public void sales_enter_url_web_siloam(){
        String url = "https://dev.ptdika.com/siloam/panel/login/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        extentTest.log(LogStatus.PASS, "Sales enter URL web Siloam");
    }

    @When("Sales enter username and password")
    public void sales_enter_username_and_password(){
        String username = "K6400001";
        String password = "a";
        loginPage.setUsernameInput(username);
        loginPage.setPasswordInput(password);
        extentTest.log(LogStatus.PASS, "Sales enter username and password");

    }

    @When("Sales enter {string} or {string}")
    public void user_enter_invalid_username_or_password(String username, String password){
        loginPage.setUsernameInput(username);
        loginPage.setPasswordInput(password);
        extentTest.log(LogStatus.PASS, "Sales enter invalid username and password");
    }

    @And("Sales click login button")
    public void sales_click_login_button(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "Sales click login button");
    }

    @Then("Sales login successful")
    public void sales_login_successful(){
        Assert.assertEquals(salesHomePage.getHomeText(), "Home");
        Assert.assertEquals(salesHomePage.getUserText(), "YESSA AINURROCHMA");
        extentTest.log(LogStatus.PASS, "Sales login successful");
    }

    @Then("Sales login empty failed")
    public void sales_login_empty_failed(){
        Assert.assertEquals(loginPage.checkRequiredUsername(), "passed");
        Assert.assertEquals(loginPage.checkRequiredPassword(), "passed");
        extentTest.log(LogStatus.PASS, "Sales login empty failed");
    }

    @Then("Sales login wrong failed")
    public void sales_login_wrong_failed(){
        Assert.assertEquals(loginPage.checkRedirectToLogin(), "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "Sales login wrong failed");
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

}
