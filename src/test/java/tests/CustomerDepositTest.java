package tests;

import org.testng.annotations.Test;
import pages.CustomerDepositPage;

public class CustomerDepositTest extends BaseTest{

    @Test
    public void testCustomerDeposit(){
        logger.info("Test Case: Deposit button");
        customerAccount();
        CustomerDepositPage deposit = new CustomerDepositPage(driver);
        deposit.clickDepositButton();
        textExists("Amount to be Deposited");}

    @Test
    public void testEnterAmount(){
        logger.info("Test Case: Entering Amount");
        customerAccount();
        CustomerDepositPage deposit = new CustomerDepositPage(driver);
        deposit.clickDepositButton();
        CustomerDepositPage amount = new CustomerDepositPage(driver);
        amount.enterAmountField();
        CustomerDepositPage depositField = new CustomerDepositPage(driver);
        depositField.depositAmountField();
        textExists("Deposit Successful");}
}