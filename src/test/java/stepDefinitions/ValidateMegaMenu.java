package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;
import pageObjects.SummerDresses;
import utilities.DriverObjects;
import utilities.Hooks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidateMegaMenu extends DriverObjects {

    HomePage objHomePage = new HomePage();
    SummerDresses objSummerDresses = new SummerDresses();


    @When("^User clicks on SummerDresses link from MegaMenu$")
    public void clickSummerDressesLink() throws InterruptedException {
        objHomePage.clickSummerDresses();
    }

    @Then("^Verify Summer Dresses page is displayed$")
    public void verifySummerDressesPage(){
        WebDriverWait wait= new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-heading product-listing']/span[1]")));
        WebElement element = driver.findElement(By.xpath("//h1[@class='page-heading product-listing']/span[1]"));
        Assert.assertEquals(element.getText(), "SUMMER DRESSES ");
    }

    @And("^User selects \"([^\"]*)\" option to sort display$")
    public void userSelectsSortByOption(String option) throws InterruptedException {
        objSummerDresses.selectSortByOption(option);
        Thread.sleep(10000);
    }

    @Then("^Verify products are shown in correct sorted order$")
    public void verifyProductsSorted(){
        String price;
        List<String> arr = new ArrayList<String>();
        List<WebElement> values = driver.findElements(By.xpath("//span[@itemprop='price']"));
        Iterator<WebElement> it = values.iterator();
        while (it.hasNext()){
            price = it.next().getText();
            if(!price.toString().equals(""))
                arr.add(price.trim().replace("$",""));
        }

        boolean flag = false;

        for (int i = 0; i<arr.size()-1; i++){
            if ( Double.parseDouble(arr.get(i)) < Double.parseDouble(arr.get(i+1)))
                flag = true;
            else
                flag = false;
        }

        Assert.assertTrue("Elements sorted in correct order", flag);


    }

}
