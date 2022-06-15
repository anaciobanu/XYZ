package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{
    By logoutButton = By.xpath("//button[contains(text(), 'Logout')]");


    public LogoutPage(WebDriver driver){
        this.driver = driver;}

    public void clickLogoutButton(){
        driver.findElement(logoutButton).click();}

}