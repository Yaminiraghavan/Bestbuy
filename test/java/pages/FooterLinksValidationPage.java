package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterLinksValidationPage {
    private WebDriver driver;
// Constructor
public FooterLinksValidationPage(WebDriver driver){
    this.driver = driver;
    }
public void FoFooterLinksValidation(){
    // Find all footer links
    List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//a"));

    // Iterate through each link and validate
    for (WebElement link : footerLinks) {
        String linkText = link.getText().trim();
        String url = link.getAttribute("href");

        if (link.isDisplayed() && link.isEnabled()) {
            System.out.println(linkText + " link is visible and enabled.");
            link.click();
            System.out.println("Clicked on " + linkText + " link. Current URL: " + driver.getCurrentUrl());
            // Validate URL if needed
            // Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.navigate().back(); // Navigate back to the homepage
        } else {
            System.out.println(linkText + " link is either not visible or not enabled.");
            // Handle error or log message if required
        }
    }
  }
}
