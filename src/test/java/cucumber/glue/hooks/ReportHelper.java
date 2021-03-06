package cucumber.glue.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.glue.utils.TakesScreenshots;
import org.springframework.beans.factory.annotation.Autowired;

public class ReportHelper {

    @Autowired
    private WebDriverFactory factory;

    @Autowired
    private TakesScreenshots takesScreenshots;

    @AfterStep()
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            takesScreenshots.takesScreenshot(scenario);
        }
    }


}
