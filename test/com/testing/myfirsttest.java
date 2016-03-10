package com.testing;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class myfirsttest {

    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://demo.opencart.com");

        Assert.assertTrue("title should start differently",driver.getTitle().startsWith("Your Store"));

        driver.close();
        driver.quit();
    }

}
