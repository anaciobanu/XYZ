package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerOpenAccountPage;

public class ManagerOpenAccountTest extends BaseTest {

    @Test
    public void testOpenAccountButton() {
        logger.info("Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        logger.info("Test Case: Open Account");
        ManagerOpenAccountPage managerOpenAccount = new ManagerOpenAccountPage(driver);
        managerOpenAccount.clickOpenAccountButton();
        textExists("Currency");}

    @Test
    public void testCustomerFields(){
        ManagerOpenAccountPage managerOpenAccount = new ManagerOpenAccountPage(driver);
        managerOpenAccount.accountPage();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.contains("Account created successfully with account Number"));
        alert.accept();
        textExists("Process");}
}
