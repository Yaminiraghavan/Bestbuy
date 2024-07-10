package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SignupPage{
        private WebDriver driver;
// Constructor
public SignupPage(WebDriver driver){
       this.driver=driver;
    }
public void SignUp(String firstname,String lastname,String email,String password,String repassword ,String phone){

        //Click on the img link
        driver.findElement(By.xpath("(//h4[text()='United States'])[1]")).click();

        // Click on "Account" link to reveal sign-up options
        driver.findElement(By.xpath("//span[text()='Account']")).click();

        // Click on "Create Account" link
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();

        // Enter first name
        driver.findElement(By.id("firstName")).sendKeys(firstname);

        // Enter last name
        driver.findElement(By.id("lastName")).sendKeys(lastname);

        // Enter email
        driver.findElement(By.id("email")).sendKeys(email);

        // Enter password
        driver.findElement(By.id("fld-p1")).sendKeys(password);

        // Enter repassword
        driver.findElement(By.id("reenterPassword")).sendKeys(repassword);

       // Enter phone
       driver.findElement(By.id("phone")).sendKeys(phone);

        // Click on "Create Account" button
        driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();

        //driver.findElement(By.xpath("//button[contains(text(),'Thanks')]")).click();
        }
    }


