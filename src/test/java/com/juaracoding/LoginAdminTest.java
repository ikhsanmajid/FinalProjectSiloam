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
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginAdminTest {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static SalesHomePage salesHomePage = new SalesHomePage();
    private static ExtentTest extentTest;
    public LoginAdminTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin enter URL web Siloam")
    public void admin_enter_url_web_siloam(){
        String url = "https://dev.ptdika.com/siloam/panel/login/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        extentTest.log(LogStatus.PASS, "Admin enter URL web Siloam");
    }
    @When("Admin enter valid username")
    public void admin_enter_valid_username(){
        String username = "admindika";
        loginPage.setUsernameInput(username);
        extentTest.log(LogStatus.PASS, "Admin enter valid username");
    }
    @And("Admin enter valid password")
    public void admin_enter_valid_password(){
        String password = "d1k4@passw0rd";
        loginPage.setPasswordInput(password);
        extentTest.log(LogStatus.PASS, "Admin enter valid password");
    }
    @And("Admin click login button")
    public void Admin_click_login_button(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "Admin click login button");
    }
    @Then("Admin login successful")
    public void admin_login_successful(){
        Assert.assertEquals(salesHomePage.getHomeText(), "Home");
        Assert.assertEquals(salesHomePage.getUserText(), "Administrator");
        extentTest.log(LogStatus.PASS, "Admin login successful");
    }
    @Then("Message harap isi bidang ini")
    public void message_harap_isi_bidang_ini(){
        String realMsg = loginPage.getValidationNameMsg();
        String expMsg = "Please fill out this field.";
        System.out.println(realMsg);
        System.out.println(expMsg);
        Assert.assertEquals(realMsg,expMsg, "Message harap isi bidang ini");
    }

    @Then("Admin back to login page")
    public void admin_back_to_login_page(){
        String expectedUrl = "https://dev.ptdika.com/siloam/panel/login/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Admin gagal kembali ke halaman login");
    }
    @When("Admin enter invalid username")
    public void admin_enter_invalid_username(){
        String invUsername = "invalidUsername";
        loginPage.setUsernameInput(invUsername);
        extentTest.log(LogStatus.PASS, "Admin enter invalid username");
    }
    @And("Admin enter invalid password")
    public void admin_enter_invalid_password(){
        String invPassword = "invalidPassword";
        loginPage.setPasswordInput(invPassword);
        extentTest.log(LogStatus.PASS, "Admin enter invalid password");
    }
    @When("Admin enter valid username capital letters")
        public void admin_enter_valid_username_capital_letters(){
            String usernameCl = "ADMINDIKA";
            loginPage.setUsernameInput(usernameCl);
            extentTest.log(LogStatus.PASS, "Admin enter valid username capital letters");
    }
    @And("Admin enter valid password capital letters")
    public void admin_enter_valid_password_capital_letters(){
        String invPassword = "D1K4@PASSWORD0RD";
        loginPage.setPasswordInput(invPassword);
        extentTest.log(LogStatus.PASS, "Admin enter valid password capital letters");
    }
    @And("Admin enter password with more than 16 length char")
    public void admin_enter_password_with_more_than_16_length_char(){
        String passwordMore16 = "1234567890123456-------";
        loginPage.setPasswordInput(passwordMore16);
        extentTest.log(LogStatus.PASS, "Admin enter password with more than 16 length char");
    }
    @Then("password length cannot increased")
    public void password_length_cannot_increased(){
        String passwordValue = loginPage.getPasswordValue();
        String passwordExpected = "1234567890123456";
        Assert.assertEquals(passwordValue,passwordExpected, "password length cannot increased");
    }
    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
