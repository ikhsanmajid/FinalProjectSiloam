package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.SalesHomePage;
import com.juaracoding.pages.SalesInputPage;
import com.juaracoding.pages.SalesNewPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class SalesNewTest {

    private static WebDriver driver;
    private static SalesNewPage salesNewPage = new SalesNewPage();
    private static ExtentTest extentTest;
//    private static WebDriver driver;
//    private static ExtentTest extentTest;


    public SalesNewTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User click menu New")
    public void user_click_menu_new(){
        salesNewPage.delay(1);
        salesNewPage.clickNavMenu();
        extentTest.log(LogStatus.PASS, "User click menu New");
    }

    @Given("User click page")
    public void user_click_page(){
        salesNewPage.delay(1);
        salesNewPage.clickBtnPaggination();
        extentTest.log(LogStatus.PASS, "User click menu New");
    }

    @When("User update existing data")
    public void user_update_existing_data(){
        salesNewPage.setInputUpdateAlamat("Jakarta");
        extentTest.log(LogStatus.PASS, "User update existing data");
    }

    @When("User input alphabet")
    public void user_input_alphabet(){
        salesNewPage.delay(2);
        salesNewPage.setInputSearchKeyword("Jakarta");
        extentTest.log(LogStatus.PASS, "User input alphabet");
    }
    @When("User input numeric")
    public void user_input_numeric(){
        salesNewPage.delay(2);
        salesNewPage.setInputSearchKeyword("123");
        extentTest.log(LogStatus.PASS, "User input numeric");
    }

    @When("User input symbol")
    public void user_input_symbol(){
        salesNewPage.delay(2);
        salesNewPage.setInputSearchKeyword("//");
        extentTest.log(LogStatus.PASS, "User input symbol");
    }

    @When("User input empty keyword")
    public void user_input_empty_keyword(){
        salesNewPage.delay(2);
        salesNewPage.setInputSearchKeyword("");
        extentTest.log(LogStatus.PASS, "User input empty keyword");
    }



    @When("User click action view")
    public void user_click_action_view(){
        salesNewPage.clickbtnActionView();
    }
    @And("Choose start date")
    public void choose_start_date(){
        salesNewPage.clickStartDate();
    }

    @And("Choose 19 Januari 2024")
    public void choose_19_januari_2024(){
        salesNewPage.setStartDate("2024-01-19");
        extentTest.log(LogStatus.PASS,"Choose 19 Januari 2024");
    }

    @And("Choose end date")
    public void choose_end_date(){
        salesNewPage.clickEndDate();
    }

    @And("Choose 07 Januari 2024")
    public void choose_07_januari_2024(){
        salesNewPage.setEndDate("2024-01-07");
        extentTest.log(LogStatus.PASS,"Choose 07 Januari 2024");
    }

    @And("Choose 17 Januari 2024")
    public void choose_17_januari_2024(){
        salesNewPage.setEndDate("2024-01-17");
        extentTest.log(LogStatus.PASS,"Choose 17 Januari 2024");
    }

    @And("User click filter button")
    public void user_click_filter_button(){
        salesNewPage.clickBtnFilterData();
    }

    @And("User click reset button")
    public void user_click_reset_button(){
        salesNewPage.clickBtnResetDate();
    }

    @And("User click search button")
    public void user_click_search_button(){
        salesNewPage.clickBtnSearchIcon();
    }

    @And("User click refresh button")
    public void user_click_refresh_button(){
        salesNewPage.clickBtnRefreshData();
    }


    @And("User click action signature")
    public void user_click_action_signature (){

    }

//    @And("User click action view")
//    public void user_click_action_view(){
//        salesNewPage.
//    }

    @When("User click edit button")
    public void user_click_edit_button(){
        salesNewPage.clickBtnEditData();
    }

//    @And("User update data")
//    public void user_update_data(){
//        salesNewPage.upda
//    }


    @And("User click submit button")
    public void user_click_submit_button(){
        salesNewPage.clickBtnSubmit();
    }

    @And("User click save button")
    public void user_click_save_button(){
        salesNewPage.clickBtnSaveData();
    }

    @And("User click cancel button")
    public void user_click_cancel_button(){
        salesNewPage.clickbtnCancelEdit();
    }

    @And("User update data alamat")
    public void user_update_data_alamat(){
        salesNewPage.setInputSearchKeyword("Bandung");
        extentTest.log(LogStatus.PASS, "User update data alamat");
    }
    @And("User click delete document")
    public void user_click_delete_document(){
        salesNewPage.clickBtnIconDeleteUpload();
    }

    @And("User click Add files button")
    public void user_click_and_files_button(){
        salesNewPage.clickbtnAddFilesBefore();
    }

    @When("User insert reupload foto")
    public void sales_insert_valid_foto_faskes_awal(){
        salesNewPage.insertFoto("update.png");
        extentTest.log(LogStatus.PASS, "lUser insert reupload foto");
    }
    @Then("View data")
    public void view_data(){

    }

    @Then("User Validation Alamat Empty")
    public void user_validation_alamat_empty(){
        salesNewPage.delay(1);
        Assert.assertEquals(salesNewPage.getErrorMsgAlamat(), "Field Alasan Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User Validation Alamat Empty");
    }

}
