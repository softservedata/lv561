package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    private final Long ONE_SECOND_DELAY = 1000L;
    private static String currentUrl = "http://taqc-opencart.epizy.com";
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        // Chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\tgotoUrl(" + currentUrl + ")");
        driver.get(currentUrl);
        presentationSleep();
    }

    @After
    public void tearDown() throws Exception {
        driver.manage().deleteAllCookies();
        presentationSleep();
    }

    @Test
    public void findByXPath() {
        // Precondition
        // Choose Curency
        driver.findElement(
                By.xpath("//button[@class='btn btn-link dropdown-toggle']"))
                .click();
        presentationSleep(); // For Presentation Only
        driver.findElement(By.xpath("//button[@name='EUR']")).click();
        presentationSleep(); // For Presentation Only
        //
        // Steps
        // Type Search Field
        driver.findElement(By.xpath("//input[@name='search']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).clear();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
        presentationSleep(); // For Presentation Only
        //
        // Click Search Button
        driver.findElement(
                By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        presentationSleep(); // For Presentation Only
        //
        // Check
        WebElement price = driver.findElement(By.xpath(
                "//a[text()='MacBook']/../following-sibling::p[@class='price']"));
        Assert.assertTrue(price.getText().contains("472.33"));
        //
        // Return to Previous State
        driver.findElement(By.xpath("//img[contains(@src, '/logo.png')]"))
                .click();
        presentationSleep(); // For Presentation Only
    }

    protected void presentationSleep() {
        presentationSleep(1);
    }

    protected void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
