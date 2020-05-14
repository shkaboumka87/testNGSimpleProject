package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGrid {

    private WebDriver driver;


    @Parameters({"tipPretrazivaca", "verzijaPretrazivaca", "operativniSistem"})
    @Test
    public void setUpWebBrowser(String tipPret, String verzijaPret, String operSistem)
            throws InterruptedException, MalformedURLException {

        if (tipPret.equalsIgnoreCase("chrome")) {

            // remote masina

            ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.setCapability("version",  verzijaPret);
            chromeOptions.setCapability("platform", operSistem);


            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"), chromeOptions);

        } else if (tipPret.equalsIgnoreCase("firefox")) {

            FirefoxOptions firefoxOptions = new FirefoxOptions();

            firefoxOptions.setCapability("version",  verzijaPret);
            firefoxOptions.setCapability("platform", operSistem);

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"), firefoxOptions);
        }

        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("TestTestTestTest");


        Thread.sleep(10000L);

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){

        if(driver != null){
            driver.quit();
        }
    }

}