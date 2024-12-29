package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login("abinaya.nov5@gmail.com", "abinaya@5");
        // Add assertions for successful login
        Assert.assertTrue(driver.getPageSource().contains("Welcome validUsername"));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
