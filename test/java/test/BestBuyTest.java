package test;

import base.BestBuyAutomation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BestBuyTest extends BestBuyAutomation {
    private BestBuyAutomation automation;

    @BeforeClass
    public void setUp() {
        automation = new BestBuyAutomation();
    }

    @Test
    public void testNavigationToHomepage() {
        automation.navigateToHomepage();
    }

    @Test
    public void testUrlValidation() {
        automation.urlValidateWebsite("https://www.bestbuy.com/");
    }

    @Test
    public void testSignUpUser() {
        automation.signUpUser("Johndeal", "Michael", "myainiragavan98@gmail.com", "Bestbuy24@", "Bestbuy24@", "3426451289");
    }

    @Test
    public void testLoginUser() {
        automation.LoginUser("myainiragavan98@gmail.com", "Bestbuy24@");
    }

    @Test
    public void testMenuValidation() {
        automation.MenuValidation();
    }

    @Test
    public void testBottomLinksValidation() {
        automation.BottomLinksValidate();
    }

    @Test
    public void testShopCart() {
        automation.ShopCart();
    }

    @Test
    public void testShopDept() {
        automation.ShopDept();
    }

    @Test
    public void testShopBrands() {
        automation.ShopBrands();
    }

    @Test
    public void testOrder(){
        automation.Order();
    }

    @AfterClass
    public void tearDown() {
        automation.closeBrowser();
    }

}

