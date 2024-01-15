package com.juaracoding;

import com.juaracoding.pages.SalesHomePage;
import com.juaracoding.pages.SalesInputPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SalesInputPageTest {

    private static WebDriver driver;
    private static SalesInputPage salesInputPage = new SalesInputPage();
    private static SalesHomePage salesHomePage = new SalesHomePage();
    private static ExtentTest extentTest;
    public SalesInputPageTest(){
        driver = Hooks.driver;
        //extentTest = Hooks.extentTest;
    }

    @Given("Sales Form Input")
    public void sales_form_input(){
        salesHomePage.clickInputPage();
    }

    @When("Sales Input Nama")
    public void sales_input_nama(){

    }

    @And("Sales Input Nomor BPJS")
    public void sales_input_nomor_bpjs(){

    }

    @And("Sales Input Nomor KTP")
    public void sales_input_nomor_ktp(){

    }

    @And("Sales Input Alamat")
    public void sales_input_alamat(){

    }

    @And("Sales Select Kota KTP")
    public void sales_select_kota_ktp(){

    }

    @And("Sales Input Faskes Awal")
    public void sales_input_faskes_awal(){

    }

    @And("Sales Select Faskes Tujuan")
    public void sales_select_faskes_tujuan(){

    }

    @And("Sales Klik Simpan Data")
    public void sales_klik_simpan_data(){

    }

    @Then("Sales Data Berhasil Disimpan")
    public void sales_data_berhasil_disimpan(){

    }


}
