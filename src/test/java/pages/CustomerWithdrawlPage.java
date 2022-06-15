package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerWithdrawlPage extends BasePage{

    By withdrawlButton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");


    public CustomerWithdrawlPage(WebDriver driver){
        this.driver = driver;}

    public void clickwithdrawlButton(){
        driver.findElement(withdrawlButton).click();
    }



}