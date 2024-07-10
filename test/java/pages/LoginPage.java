package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private WebDriver driver;
// Constructor
public LoginPage(WebDriver driver){
    this.driver= driver;
    }
public void LoginPage(String email,String password) {

        // Click on "Account" link to reveal sign-in options
        driver.findElement(By.xpath("//span[text()='Account']")).click();

        // Click on "Sign In" link
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

        // Enter email
        driver.findElement(By.id("fld-e")).sendKeys(email);

        // Enter password
        driver.findElement(By.id("fld-p1")).sendKeys(password);

        // Click on "Sign In" button
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }
}
