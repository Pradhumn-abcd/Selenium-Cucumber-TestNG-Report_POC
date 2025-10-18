package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_credentials(String username, String password) {
        // Check if already logged in
        if (!driver.getCurrentUrl().contains("/dashboard")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            wait.until(ExpectedConditions.urlContains("/dashboard"));
        }
    }

    @Then("I should see the OrangeHRM dashboard")
    public void i_should_see_dashboard() {
        wait.until(ExpectedConditions.urlContains("/dashboard"));
    }
}
