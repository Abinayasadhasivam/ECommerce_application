package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "Phones")
    WebElement phonesCategory;

    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;

    @FindBy(linkText = "Monitors")
    WebElement monitorsCategory;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToCategory(String category) {
        switch (category.toLowerCase()) {
            case "phones":
                phonesCategory.click();
                break;
            case "laptops":
                laptopsCategory.click();
                break;
            case "monitors":
                monitorsCategory.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }
}
