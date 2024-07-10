package pages;

import org.openqa.selenium.WebDriver;

public class CloseBrowserPage {
    private WebDriver driver;
// Constructor
public CloseBrowserPage(WebDriver driver) {
        this.driver = driver;
    }
public void navigateToClose(){
    // Close the browser
    driver.quit();
}
}
