package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverObjects;

public class SummerDresses extends DriverObjects {

    public By drpSortBy = By.xpath("//select[@id='selectProductSort']");

    public void selectSortByOption(String option){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,1000)");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(drpSortBy));
        Select select = new Select(driver.findElement(drpSortBy));
//        select.selectByValue(option);
        select.selectByIndex(1);
    }
}
