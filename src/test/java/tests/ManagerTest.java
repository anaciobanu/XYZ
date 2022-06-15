package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerPage;

public class ManagerTest extends BaseTest{

    @Test
    public void testAddCustomerButton() {
        logger.info("Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        logger.info("Test Case: Add Customer");
        ManagerPage addCustomer = new ManagerPage(driver);
        addCustomer.clickAddCustomerButton();
        textExists("First Name");}


    @Test
    public void testAddCustomer(){
        logger.info("Test: Add customer");
        LoginPage login  = new LoginPage(driver);
        ManagerPage manager = new ManagerPage(driver);
        login.managerLogin();
        manager.addCustomer();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.contains("Customer added successfully"));
        alert.accept();
    }

}