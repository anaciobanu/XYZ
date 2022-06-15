package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerTransactionsPage extends BasePage{

    By transactionsTable = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(2) > table");
    By transactionsButton = By.xpath("//button[contains(text(), 'Transactions')]");
    By backButton = By.xpath(("/html/body/div/div/div[2]/div/div[1]/button[1]"));


    public CustomerTransactionsPage(WebDriver driver){
        this.driver = driver;}

    public void clickTransactionsButton(){
        driver.findElement(transactionsButton).click();}
    public void transactions(){
        driver.findElement(transactionsTable).click();}

    public void clickBackButton(){
        driver.findElement(backButton).click();
    }

}