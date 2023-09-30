package org.qaminds;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Test {
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");

        driver.quit();
    }

    @BeforeTest
    public void beforeTest(){

    }

    @org.testng.annotations.Test
    public void openBrowserTest(){
        openBrowser();
    }
}
