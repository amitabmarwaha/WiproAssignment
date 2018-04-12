package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends DriverObjects {

    @Before("@browser")
    public void intializeDriver(Scenario scenario){
        String browserName = System.getProperty("environment");
        System.out.println("Browser Name : " + browserName);
        System.out.println("Started scenario : " + scenario.getName());

        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Java\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("Browser name not specified. Cannot initialize browser");
        }


        driver.manage().window().maximize();
    }

    @After("@browser")
    public void closeDriver(Scenario scenario){
        System.out.println("Finished scenario: " + scenario.getName());
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        driver.quit();
    }

}
