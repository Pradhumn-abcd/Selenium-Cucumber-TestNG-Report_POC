
package common;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterSuite
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
