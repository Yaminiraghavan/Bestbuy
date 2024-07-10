package pages;

import org.openqa.selenium.WebDriver;

public class HomePage{
    private WebDriver driver;
// Constructor
public HomePage(WebDriver driver) {
        this.driver = driver;
    }
// Method to navigate to website and maximize window
public void navigateTo() {
        // Navigate to Best Buy website
        driver.get("https://www.bestbuy.com/");

        // Maximize the window
        driver.manage().window().maximize();
    }
}

