package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by jnunez on 6/16/17.
 */
public class Hook {

    @Before
    public void InitializeTest()
    {
        System.out.println("Opening browser : MOCK");
    }

    @After
    public void TearDownTest(Scenario scenario)
    {

        if (scenario.isFailed()) {
            //Take screenshot
            System.out.println(scenario.getName().toString() + " failed");
        }

        System.out.println("Closing browser : MOCK");
    }

}
