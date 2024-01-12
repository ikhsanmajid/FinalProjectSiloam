package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSalesTest {

    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static ExtentTest extentTest;
    public LoginSalesTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Sales enter URL web Siloam")
    public void sales_enter_url_web_siloam(){
        String url = "https://staging.ptkta.com/siloam/panel/login/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        extentTest.log(LogStatus.PASS, "User enter URL web SwagLabs");
    }

    @When("Sales enter username and password")
    public
}
