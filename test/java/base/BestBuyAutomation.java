package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import pages.*;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class BestBuyAutomation {
    private static WebDriver driver;

    public BestBuyAutomation() {
        // Set Chrome options to disable notifications
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("disable notifications");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }

    // Method to perform navigation to homepage and maximize window
    public void navigateToHomepage() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
    }

    // Method to perform Url Validation
    public void urlValidateWebsite(String urlToTest) {
        UrlValidatorPage urlValidator = new UrlValidatorPage(driver);
        urlValidator.urlValidate(urlToTest);
    }

    // Method to perform SignUp Functionality
    public void signUpUser(String firstname, String lastname, String email, String password, String repassword, String phone) {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.SignUp(firstname, lastname, email, password, repassword, phone);
    }

    // Method to perform Login Functionality
    public void LoginUser(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginPage(email, password);
    }

    // Method to perform MenuValidation
    public void MenuValidation() {
        MenuNavigationPage menuNavigationPage = new MenuNavigationPage(driver);
        menuNavigationPage.MenuNavigateToValidate();
    }

    // Method to perform BottomLinksValidation
    public void BottomLinksValidate() {
        FooterLinksValidationPage footerLinksValidationPage = new FooterLinksValidationPage(driver);
        footerLinksValidationPage.FoFooterLinksValidation();
    }

    // Method to perform Add to Cart
    public void ShopCart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.AddtoCartPage();
    }

    // Method to perform Add to Cart by Department
    public void ShopDept() {
        CartFromDepartmentPage cartFromDepartmentPage = new CartFromDepartmentPage(driver);
        cartFromDepartmentPage.AddToCartDepart();
    }

    // Method to perform Add to Cart by Brands
    public void ShopBrands() {
        CartFromBrandsPage cartFromBrandsPage = new CartFromBrandsPage(driver);
        cartFromBrandsPage.AddToCartBrand();
    }
    //Method to perform Checkout
   public void Order(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.OrderPlace();
   }
    public static String takeScreenshot(String testCaseName){
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("Screenshot/"+testCaseName+ ".png");
        try {
            FileUtils.copyFile(srcFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path = "<img src = " + destinationFile.getAbsolutePath() + "width = 200px height = 200px/>";
        Reporter.log(path);
        return destinationFile.getAbsolutePath();
    }

}
