package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDepositPage extends BasePage{

    By depositButton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
    By enterAmount = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    By depositAmount = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");

    public CustomerDepositPage(WebDriver driver){
        this.driver = driver;}

    public void clickDepositButton(){
        driver.findElement(depositButton).click();}

    public void enterAmountField(){
        driver.findElement(enterAmount).sendKeys("1000");}

    public void depositAmountField(){
        driver.findElement(depositAmount).click();
    }

}