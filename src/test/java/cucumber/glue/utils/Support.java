package cucumber.glue.utils;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Duration;

@PageObject
public class Support {

    @Autowired
    private WebDriverFactory driver;
    @Value("${driver.timeout.seconds}")
    private String waitForWebElement;
    private WebElement webElement;
    private WebDriverWait wait;

    public void navigateTo(String URI){
        driver.getDriver().get(URI);
    }

    public boolean waitElementIsDisplayed(WebElement element){
        wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(Integer.parseInt(waitForWebElement)));
        webElement = wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed();
    }
    public boolean waitElementIsDisplayed(By element){
        wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(Integer.parseInt(waitForWebElement)));
        webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return webElement.isDisplayed();
    }
    public boolean clickOnElementByActions(By element){
        if(waitElementIsDisplayed(element)){
            webElement = driver.getDriver().findElement(element);
            webElement.click();
            return true;
        }
        return false;
    }
}
