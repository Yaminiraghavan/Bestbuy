package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    private WebDriver driver;
// Constructor
public ShoppingCartPage(WebDriver driver){
        this.driver= driver;
    }
public void AddtoCartPage(){
        //Click on the img link
        //driver.findElement(By.xpath("//img[@alt='Canada'][1]")).click();

        // Search for an item
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("laptop");
        driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

        // Click on the first search result
        WebElement firstSearchResult = driver.findElement(By.xpath("//div[contains(@class, 'list-item') and contains(@class, 'wrapper')]"));
        firstSearchResult.click();

        // Add the item to the cart
        WebElement addToCartButton = driver.findElement(By.cssSelector(".add-to-cart-button"));
        addToCartButton.click();
    }
}
