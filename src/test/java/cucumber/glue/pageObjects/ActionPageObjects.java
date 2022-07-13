package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import cucumber.glue.pageObjects.initPageFactory.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@PageObject
public class ActionPageObjects extends BasePage {


    public ActionPageObjects(WebDriverFactory webDriverFactory) {
        super(webDriverFactory);
    }

    @FindBy (how= How.CSS,  using=".Header-nav-item[href*=jam]")
    private WebElement menuJam;

    public void clickJamMenu() {
        menuJam.click();
    }
}
