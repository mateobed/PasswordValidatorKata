package com.example.junittdd;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class SeleniumGoogleTest {


    @Test
    void testSeleniumWithFireFoxAndGoogle() throws Exception {
        System.setProperty("webdriver.gecko.driver","/Users/Mateusz/Downloads/geckodriver/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        FirefoxDriver driver = new FirefoxDriver(options);

        driver.get("https://google.com");

        WebElement agreeButton = driver.findElements(By.className("tHlp8d")).get(3);
        agreeButton.click();

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Bike");
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

//        Thread.sleep(5000);

        driver.quit();

    }
}
