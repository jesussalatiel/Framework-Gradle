package cucumber.glue.steps;

import cucumber.api.java8.En;
import cucumber.glue.assertions.NavigationPageAssertions;
import cucumber.glue.pageObjects.NavigationPageObjects;
import org.springframework.beans.factory.annotation.Autowired;

public class NavigationPageSteps implements En {

    @Autowired
    private NavigationPageObjects navigationPageObjects;
    @Autowired
    private NavigationPageAssertions assertions;


    public NavigationPageSteps(){
        Given("^I go to (.*?) page", (String urlName) -> {
            navigationPageObjects.getPage(urlName);
        });

        Then("^I should be on (.*?) page", (String name) -> {
            String currentPage = navigationPageObjects.getCurrentUrl();
            assertions.assertPageIsCorrect(currentPage, name);
        });
    }
}
