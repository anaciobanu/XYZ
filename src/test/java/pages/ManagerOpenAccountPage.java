package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ManagerOpenAccountPage extends BasePage{

    By openAccountButton = By.xpath("//*[contains(text(),'Open Account')]");
    By userSelectDropdown = By.id("userSelect");
    By currencySelectDropdown = By.id("currency");
    By processButton = By.xpath("//button[text()='Process']");

    public ManagerOpenAccountPage(WebDriver driver){
        this.driver = driver;}

    public void openAccountPage(){
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        ManagerOpenAccountPage managerOpenAccount = new ManagerOpenAccountPage(driver);
        managerOpenAccount.clickOpenAccountButton();}

    public void clickOpenAccountButton(){
        driver.findElement(openAccountButton).click();}

    public void accountPage(){
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        ManagerOpenAccountPage managerOpenAccount = new ManagerOpenAccountPage(driver);
        managerOpenAccount.clickOpenAccountButton();
        Select select1  = new Select(driver.findElement(userSelectDropdown));
        select1.selectByVisibleText("Neville Longbottom");
        Select select2  = new Select(driver.findElement(currencySelectDropdown));
        select2.selectByVisibleText("Rupee");
        driver.findElement(processButton).click();

    }

}