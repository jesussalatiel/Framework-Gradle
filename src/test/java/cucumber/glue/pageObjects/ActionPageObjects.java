package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import cucumber.glue.pageObjects.initPageFactory.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import us.abstracta.jmeter.javadsl.core.TestPlanStats;

import java.time.Duration;
import java.time.Instant;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

@PageObject
public class ActionPageObjects extends BasePage {


    public ActionPageObjects(WebDriverFactory webDriverFactory) {
        super(webDriverFactory);
    }

    @FindBy (how= How.CSS,  using=".Header-nav-item[href*=jam]")
    private WebElement menuJam;

    public void clickJamMenu() {
        //menuJam.click();
        /*TestPlanStats stats = testPlan(
                threadGroup(2, 10,
                        httpSampler("http://my.service")
                ),
                //this is just to log details of each request stats
                jtlWriter("test" + Instant.now().toString().replace(":", "-") + ".jtl")
        ).run();*/
        //assertThat(stats.overall().sampleTimePercentile99()).isLessThan(Duration.ofSeconds(5));
    }

}
