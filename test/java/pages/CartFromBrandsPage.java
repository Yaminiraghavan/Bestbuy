package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartFromBrandsPage {
    private WebDriver driver;
// Constructor
public CartFromBrandsPage(WebDriver driver){
    this.driver = driver;
    }
public void AddToCartBrand(){
    //Click on the menu
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

    // Click on the "Brands" menu
    WebElement brandsMenu = driver.findElement(By.xpath("//button[text()='Brands']"));
    brandsMenu.click();

    // Select a specific brand (e.g., Samsung)
    WebElement samsungBrandLink = driver.findElement(By.xpath("//a[text()='Samsung']"));
    samsungBrandLink.click();

    // Click on the first item
    driver.findElement(By.xpath("(//img[@class='sr-only'])[1]")).click();
    driver.findElement(By.xpath("(//a[@class='image-link'])[1]")).click();
    driver.findElement(By.xpath("//button[@data-sku-id='6575135']")).click();
    /*List<WebElement> itemsList = driver.findElements(By.cssSelector("div.sku-title > a"));
    if (!itemsList.isEmpty()) {
        WebElement firstItem = itemsList.get(0);
        firstItem.click();
    } else {
        System.out.println("No items found for the selected brand.");
    }*/
  }
}
