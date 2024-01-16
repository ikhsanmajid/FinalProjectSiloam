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

import java.util.concurrent.TimeUnit;

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
        salesInputPage.delay(1);
        salesHomePage.clickInputPage();
    }

    @When("Sales Input Nama")
    public void sales_input_nama(){
        salesInputPage.setNamaInput("Ikhsan");
    }

    @When("Sales Input Empty Nama")
    public void sales_input_empty_nama(){
        salesInputPage.setNamaInput("");
    }

    @And("Sales Input Nomor BPJS")
    public void sales_input_nomor_bpjs(){
        salesInputPage.setNoBPJSInput("1234231432111");
    }

    @And("Sales Input Empty Nomor BPJS")
    public void sales_input_empty_nomor_bpjs(){
        salesInputPage.setNoBPJSInput("");
    }

    @And("Sales Input Nomor BPJS less than 13")
    public void sales_input_nomor_bpjs_less_than_13(){
        salesInputPage.setNoBPJSInput("12312312312");
    }


    @And("Sales Input Nomor KTP")
    public void sales_input_nomor_ktp(){
        salesInputPage.setNoKTPInput("1231232531235531");
    }

    @And("Sales Input Empty Nomor KTP")
    public void sales_input_empty_nomor_ktp(){
        salesInputPage.setNoKTPInput("");
    }

    @And("Sales Input Nomor KTP less than 16")
    public void sales_input_nomor_ktp_less_than_16(){
        salesInputPage.setNoKTPInput("12312312312");
    }

    @And("Sales Input Alamat")
    public void sales_input_alamat(){
        salesInputPage.setAlamatInput("Jakarta");
    }

    @And("Sales Input Empty Alamat")
    public void sales_input_empty_alamat(){
        salesInputPage.setAlamatInput("");
    }

    @And("Sales Select Kota KTP")
    public void sales_select_kota_ktp(){
        salesInputPage.clickKotaKTP();
        salesInputPage.setSearchBoxKotaInput("Pusat");
        salesInputPage.clickKotaKTPList(0);
    }

    @And("Sales Input Faskes Awal")
    public void sales_input_faskes_awal(){
        salesInputPage.setFaskesAwalInput("Jakarta Pusat");
    }

    @And("Sales Select Faskes Tujuan")
    public void sales_select_faskes_tujuan(){
        salesInputPage.clickFaskesTujuan();
        salesInputPage.setSearchBoxFaskesInput("Pusat");
        salesInputPage.clickFaskesTujuanList(0);
    }

    @And("Sales Select Faskes Tujuan Different")
    public void sales_select_faskes_tujuan_different(){
        salesInputPage.clickFaskesTujuan();
        salesInputPage.setSearchBoxFaskesInput("Selatan");
        salesInputPage.clickFaskesTujuanList(0);
    }

    @And("Sales Input Alasan")
    public void sales_input_alasan(){
        salesInputPage.delay(2);
        salesInputPage.setAlasanInput("Pindah Domisili");
    }

    @And("Sales Input Empty Alasan")
    public void sales_input_empty_alasan(){
        salesInputPage.delay(2);
        salesInputPage.setAlasanInput("");
    }

    @And("Sales Klik Simpan Data")
    public void sales_klik_simpan_data(){
        salesInputPage.clickSimpanData();
    }

    @Then("Sales Data Berhasil Disimpan")
    public void sales_data_berhasil_disimpan(){
        Assert.assertEquals(salesInputPage.getDataBerhasilDisimpan(), "Data berhasil Di Simpan");
    }

    @Then("Sales Validation Name Empty Appear")
    public void sales_validation_name_empty_appear(){
        Assert.assertEquals(salesInputPage.getValidationNameMsg(), "Please fill out this field.");
    }

    @Then("Sales Validation BPJS Empty Appear")
    public void sales_validation_bpjs_empty_appear(){
        Assert.assertEquals(salesInputPage.getValidationBPJSMsg(), "Please fill out this field.");
    }

    @Then("Sales Validation Nomor BPJS 13 character expected Appear")
    public void sales_validation_nomor_bpjs_13_character_expected_appear(){
        Assert.assertEquals(salesInputPage.getValidationBPJSMsg(), "Please match the requested format.");
    }

    @Then("Sales Validation No KTP Empty Appear")
    public void sales_validation_no_ktp_empty_appear(){
        Assert.assertEquals(salesInputPage.getValidationKTPMsg(), "Please fill out this field.");
    }

    @Then("Sales Validation No KTP 16 character expected Appear")
    public void sales_validation_no_ktp_16_character_expected_appear(){
        Assert.assertEquals(salesInputPage.getValidationKTPMsg(), "Please match the requested format.");
    }

    @Then("Sales Validation Alamat Empty Appear")
    public void sales_validation_alamat_empty_appear(){
        Assert.assertEquals(salesInputPage.getAlamatErrorMsg(), "Field Alamat Harus Diisi!");
    }

    @Then("Sales Validation Alasan Empty Appear")
    public void sales_validation_alasan_empty_appear(){
        salesInputPage.delay(1);
        Assert.assertEquals(salesInputPage.getAlasanErrorMsg(), "Field Alasan Harus Diisi!");
    }
}
