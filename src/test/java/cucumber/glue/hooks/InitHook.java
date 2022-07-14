package cucumber.glue.hooks;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.springframework.beans.factory.annotation.Autowired;

public class InitHook {

    @Autowired
    private WebDriverFactory factory;

    /*Cucumber Hook: */
    @Before
    public void setUp(){

    }

    @AfterAll
    public void tearDown(){
        if(factory.getDriver()!=null)
            factory.getDriver().quit();
    }
}
