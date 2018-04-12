package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverObjects;
import org.openqa.selenium.By;

public class HomePage extends DriverObjects {

    public By lnkSignIn = By.xpath("//a[@class='login']");

    public By lnkDresses= By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a");

    public By lnkSummerDresses = By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a");

    public void clickSignInButton(){
        driver.findElement(lnkSignIn).click();
    }

    public void clickSummerDresses() throws InterruptedException {
        WebDriverWait wait= new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lnkDresses));
        WebElement mainMenu = driver.findElement(lnkDresses);
        WebElement subMenu = driver.findElement(lnkSummerDresses);
        Actions action = new Actions(driver);
        action.moveToElement(mainMenu);
        action.click(subMenu);
        action.build().perform();
    }

}
