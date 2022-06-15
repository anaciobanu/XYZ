package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerWithdrawlPage;

public class CustomerWithdrawlTest extends BaseTest {

    @Test
    public void testCustomerWithdrawl() {
        logger.info("Test Case: Withdrawl button");
        customerAccount();
        CustomerWithdrawlPage withdrawl = new CustomerWithdrawlPage(driver);
        withdrawl.clickwithdrawlButton();
        textExists("Amount to be Withdrawn");}
}