package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void Before() {

    }

    @After
    public void After() {

        GWD.quitDriver();
    }
}
