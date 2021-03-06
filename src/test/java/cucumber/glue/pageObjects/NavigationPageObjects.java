package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import cucumber.glue.utils.Support;
import org.springframework.beans.factory.annotation.Autowired;

@PageObject
public class NavigationPageObjects {

    @Autowired
    private WebDriverFactory webDriverFactory;

    @Autowired
    Support ac;

    public void getPage(String url) {
       webDriverFactory.getDriver().navigate().to(url);
    }

    public String getCurrentUrl() {
        return webDriverFactory.getDriver().getCurrentUrl();
    }
}
