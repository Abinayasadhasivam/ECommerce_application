package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.ProductPage;

public class ShoppingCartTest {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void testAddToCart() {
        homePage.navigateToCategory("phones");
        productPage.addToCart();
        // Add assertions for successful cart addition
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
