package cucumber.glue.pageObjects.initPageFactory;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

@PageObject
public abstract class BasePage {

    @Autowired
    private WebDriverFactory webDriverFactory;

    public BasePage(WebDriverFactory webDriverFactory) {
        PageFactory.initElements(webDriverFactory.getDriver(), this);
    }
}
