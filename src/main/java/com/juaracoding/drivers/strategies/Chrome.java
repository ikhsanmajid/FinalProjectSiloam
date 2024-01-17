package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Chrome implements DriverStrategy{

    @Override
    public WebDriver setStrategy() {
        File driverPath = new File("src/main/resources/webdriver/chromedriver.exe");
        //String path = "C:\\MyTools\\chromedriver.exe";
        String path = driverPath.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension",false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
}
