package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerTransactionsPage;
import pages.LoginPage;
import pages.BasePage;

import static org.testng.Assert.assertTrue;
public class CustomerTransactionsTest extends BaseTest{

    @Test
    public void testCustomerTransactions(){
        logger.info("Test Case: Customer Transactions");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerTransactionsPage customer = new CustomerTransactionsPage(driver);
        customer.clickTransactionsButton();
        textExists("Amount");}

    @Test
    public void testCustomerTable(){
        logger.info("Test Case: Customer Table");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerTransactionsPage customer = new CustomerTransactionsPage(driver);
        customer.clickTransactionsButton();
        logger.info("Test Case: Customer Table, checking table click ability");
        customer.transactions();}

    @Test
    public void testClickBackButton(){
        logger.info("Test Case: Back button");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerTransactionsPage customer = new CustomerTransactionsPage(driver);
        customer.clickTransactionsButton();
        customer.clickBackButton();
        Assert.assertTrue(driver.getPageSource().contains("Account Number"));
    }

}