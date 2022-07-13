package cucumber.glue.pageObjects;

import cucumber.glue.customAnnotations.PageObject;
import cucumber.glue.hooks.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;

@PageObject
public class SignUpFormPageObjects {

    @Autowired
    private WebDriverFactory webDriverFactory;

    private static final String USER_LOGIN = "user[login]";
    private static final String USER_EMAIL = "user[email]";
    private static final String USER_PASSWORD = "user[password]";
    private static final String USER_INPUT = "[name^='user[']";
    private static final String USER_INPUT_ATTRIBUTE_NAME = "name";

    public void signUp(String login, String email, String password) {
        /**
         * Standard way to send keys:
         *         webDriverFactory.getDriver().findElement(By.id(USER_LOGIN)).sendKeys(login);
         *         webDriverFactory.getDriver().findElement(By.id(USER_EMAIL)).sendKeys(email);
         *         webDriverFactory.getDriver().findElement(By.id(USER_PASSWORD)).sendKeys(password);
         */

        /**
         * lamdbda-way to send keys (imagine there is no id for inputs):
         */
        sendKeysForInputWithAttributeName("login", login);
        sendKeysForInputWithAttributeName("email", email);
        sendKeysForInputWithAttributeName("password", password);
    }

    public String shouldSeeLoginData() {
        return javaScriptGetData(USER_LOGIN);
    }

    public String shouldSeeEmailData() {
        return javaScriptGetData(USER_EMAIL);
    }

    public String shouldSeePasswordData() {
        return javaScriptGetData(USER_PASSWORD);
    }

    private void sendKeysForInputWithAttributeName(String partValueName, String keyToSend){
        webDriverFactory.getDriver().findElements(By.cssSelector(USER_INPUT))
                .stream()
                .filter(elem->elem.getAttribute(USER_INPUT_ATTRIBUTE_NAME).contains(partValueName))
                .findFirst()
                .get()
                .sendKeys(keyToSend);
    }

    private String javaScriptGetData(String data){
        JavascriptExecutor js=(JavascriptExecutor) webDriverFactory.getDriver();
        return (String)js.executeScript("return document.getElementById('"+ data +"').value");
    }
}
