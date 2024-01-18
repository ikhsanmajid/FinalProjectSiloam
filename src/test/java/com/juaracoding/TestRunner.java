package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/1_Login_Sales.feature", "src/main/resources/features/2_Sales_Input_Data.feature", "src/main/resources/features/3_Sales_Upload_Dokumen.feature", "src/main/resources/features/4_Sales_Tanda_Tangan.feature", "src/main/resources/features/5_Sales_New.feature", "src/main/resources/features/6_Login_Admin.feature", "src/main/resources/features/7_Admin_ViewExport.feature" },
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}