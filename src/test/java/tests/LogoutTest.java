package tests;

import org.testng.annotations.Test;
import pages.CustomerTransactionsPage;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest{

    @Test
    public void testLogout(){
        logger.info("######## Test Case: Logout Page");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerTransactionsPage customer = new CustomerTransactionsPage(driver);
        customer.clickTransactionsButton();
        LogoutPage logout = new LogoutPage(driver);
        logout.clickLogoutButton();
        textExists("Home");
    }
}