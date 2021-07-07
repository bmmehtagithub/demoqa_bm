package com.demoqa.hooks;

import com.demoqa.browserfactory.DriverHelpers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private DriverHelpers driverHelpers = new DriverHelpers();

    @Before
    public void setUp() {
        driverHelpers.openBrowser();
        driverHelpers.maximiseBrowser();
        driverHelpers.applyImpWaits();
        driverHelpers.navigateToUrl();
    }
    @After
    public void tearDown() {
        driverHelpers.closeBrowser();
    }
}
