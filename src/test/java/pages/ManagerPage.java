package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerPage extends BasePage{

    By addCustomerButton = By.xpath("//button[contains(text(), 'Add Customer')]");
    By firstNameInput = By.cssSelector("[placeholder='First Name']");
    By lastNameInput = By.cssSelector("[placeholder='Last Name']");
    By postCodeInput = By.cssSelector("[placeholder='Post Code']");
    By addCustomerButton2 = By.xpath("//button[text()='Add Customer']");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickAddCustomerButton(){
        driver.findElement(addCustomerButton).click();}

    public void addCustomer(){
        driver.findElement(addCustomerButton).click();
        driver.findElement(firstNameInput).sendKeys("Ana");
        driver.findElement(lastNameInput).sendKeys("Ciobanu");
        driver.findElement(postCodeInput).sendKeys("32258");
        driver.findElement(addCustomerButton2).click();}

    }
