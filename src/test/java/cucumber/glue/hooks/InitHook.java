package cucumber.glue.hooks;

import org.junit.After;
import org.junit.Before;
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

    }
}
