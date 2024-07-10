package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckoutPage {

    private WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
public void OrderPlace(){

    // Find the search input element and enter "laptop" (example product)
    WebElement searchInput = driver.findElement(By.id("gh-search-input"));
        searchInput.sendKeys("laptop");
        searchInput.submit();

    // Click on a product (assuming the first result for simplicity)
    driver.findElement(By.cssSelector(".list-item .sku-header a")).click();

    // Add the product to cart (assuming there's an 'Add to Cart' button)
    driver.findElement(By.cssSelector(".add-to-cart-button")).click();

    // Wait for checkout button to be clickable
    // (You might need to implement a wait mechanism here using WebDriverWait)

    // Click on the checkout button
    WebElement checkoutButton = driver.findElement(By.cssSelector(".checkout-buttons .btn-primary"));
        checkoutButton.click();

    // Fill out the checkout form with dummy payment information
    WebElement firstNameInput = driver.findElement(By.id("user.first_name"));
        firstNameInput.sendKeys("John");

    WebElement lastNameInput = driver.findElement(By.id("user.last_name"));
        lastNameInput.sendKeys("Doe");

    WebElement creditCardNumberInput = driver.findElement(By.id("user.credit_card.number"));
        creditCardNumberInput.sendKeys("1234567890123456");

    // Fill out other necessary fields as needed

    // Submit the form (assuming there's a 'Place Order' button)
    WebElement placeOrderButton = driver.findElement(By.cssSelector(".place-order-button"));
        placeOrderButton.click();

    // Wait for order confirmation page to load
    // (You might need to implement another wait mechanism here)

    // Verify order confirmation message
    WebElement confirmationMessage = driver.findElement(By.cssSelector(".order-confirmation-message"));
    String messageText = confirmationMessage.getText();

        if (messageText.contains("Your order has been successfully placed")) {
        System.out.println("Order placed successfully!");
    } else {
        System.out.println("Order placement failed or confirmation message not found.");
    }
    }
}
