package pageObjects;

import org.openqa.selenium.By;
import utilities.DriverObjects;

public class CreateAccount extends DriverObjects {

    By txtEmailAddress = By.xpath("//input[@id='email_create']");

    By btnCreateAccount = By.xpath("//button[@id='SubmitCreate']");

    public void setEmailAddress(String email){
        driver.findElement(txtEmailAddress).sendKeys(email);
    }

    public void clickCreateAccount(){
        driver.findElement(btnCreateAccount).click();
    }

}
