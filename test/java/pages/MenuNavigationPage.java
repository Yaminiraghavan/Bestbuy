package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class MenuNavigationPage {
    private WebDriver driver;
// Constructor
public MenuNavigationPage(WebDriver driver){
        this.driver = driver;
    }
public void MenuNavigateToValidate(){
    // Get all menu items
    List<WebElement> menuItems = driver.findElements(By.cssSelector(".header-nav li a"));

    // Iterate through each menu item
    for (WebElement menuItem : menuItems) {
    // Get the menu item text and href
       String menuText = menuItem.getText();
       String menuHref = menuItem.getAttribute("href");

    // Click on the menu item
       menuItem.click();

    // Wait for the page to load
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.titleContains(menuText));

    // Validate the title of the page
       String pageTitle = driver.getTitle();
       System.out.println("Menu Item: " + menuText + ", Page Title: " + pageTitle);
       if (!pageTitle.contains(menuText)) {
            System.out.println("Title validation failed for menu item: " + menuText);
        }
    }
  }
}
