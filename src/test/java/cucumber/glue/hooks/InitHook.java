package cucumber.glue.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class InitHook {

    @Autowired
    private WebDriverFactory factory;

    /*Cucumber Hook: */
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){
        if(factory.getDriver()!=null)
            factory.getDriver().quit();
    }
}
