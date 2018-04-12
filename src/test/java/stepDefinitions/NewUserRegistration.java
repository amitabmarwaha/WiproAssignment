package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CreateAccount;
import utilities.DriverObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;

public class NewUserRegistration extends DriverObjects {

    HomePage objHomePage = new HomePage();
    CreateAccount objCreateAccount = new CreateAccount();

    @Given("^User navigates to homepage$")
    public void navigateToHomePage(){
        driver.get("http://automationpractice.com/");
    }

    @And("^User clicks on SignIn button$")
    public void clickSignInButton(){
        objHomePage.clickSignInButton();
    }

    @When("^User enters \"([^\"]*)\" email address and clicks on Create Account button$")
    public void enterValidEmailAndSubmit(String emailAddress){
        objCreateAccount.setEmailAddress(emailAddress);
        objCreateAccount.clickCreateAccount();
    }

    @Then("^Verify user is taken to YourPersonalInformation page$")
    public void verifyCreateAccountPage(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
        WebElement element = driver.findElement(By.xpath("//h3[text()='Your personal information']"));
        Assert.assertEquals(element.getText(),"YOUR PERSONAL INFORMATION");
    }

    @Then("^Verify error message is displayed$")
    public void verifyErrorMessageDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Invalid email address.']")));
        WebElement element = driver.findElement(By.xpath("//li[text()='Invalid email address.']"));
        Assert.assertEquals(element.getText(),"Invalid email address.");
    }

}
