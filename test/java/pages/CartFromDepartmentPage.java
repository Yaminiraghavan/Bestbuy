package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartFromDepartmentPage {
    private WebDriver driver;
// Constructor
public CartFromDepartmentPage(WebDriver driver){
    this.driver = driver;
}
public void AddToCartDepart(){
    //Click on the menu
    driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();

    // Click on the "Shop by Department" menu
    driver.findElement(By.xpath("//button[@data-track='Shop By Department']")).click();

    // Example: Selecting a department (e.g., Computers & Tablets)
    driver.findElement(By.xpath("//button[text()='Computers & Tablets']")).click();

    // Example: Selecting an item (e.g., laptops)
    driver.findElement(By.xpath("//button[text()='Laptops & Desktops']")).click();

    // Example: Adding an item to the cart (first item in the list)
    driver.findElement(By.cssSelector("div.sku-title > a")).click();

   }
}
