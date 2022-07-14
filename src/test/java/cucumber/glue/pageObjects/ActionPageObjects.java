package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import cucumber.glue.pageObjects.initPageFactory.BasePage;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;

import static io.restassured.RestAssured.given;


@PageObject
public class ActionPageObjects extends BasePage {


    public ActionPageObjects(WebDriverFactory webDriverFactory) {
        super(webDriverFactory);
    }

    @FindBy (how= How.CSS,  using=".Header-nav-item[href*=jam]")
    private WebElement menuJam;

    public void clickJamMenu() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/";

        Response response = given().get("pokemon/ditto");
        System.out.println("-------------------->"+response.asString());

        //menuJam.click();
    }

}
