package stepDefinitions;

import common.TestBase;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.AdminPage;

public class AdminSteps extends TestBase {

    private LoginPage loginPage;
    private AdminPage adminPage;

    @Given("I am logged in as admin")
    public void i_am_logged_in_as_admin() {
        driver = DriverFactory.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        System.out.println("✅ Logged in successfully as Admin");
    }

    @When("I navigate to the Admin module")
    public void i_navigate_to_the_admin_module() {
        adminPage = new AdminPage(driver);
        adminPage.navigateToAdminModule();
        System.out.println("✅ Navigated to Admin module");
    }

    @And("I add a new user with username {string} and employee {string}")
    public void i_add_a_new_user_with_username_and_employee(String username, String employee) {
        try {
            adminPage.clickAddButton();
            adminPage.selectUserRole("ESS");
            adminPage.enterEmployeeName(employee);
            adminPage.selectEmployeeSuggestion();
            adminPage.selectStatus("Enabled");
            adminPage.enterUsername(username);
            adminPage.enterPassword("Password@123");
            adminPage.enterConfirmPassword("Password@123");
            adminPage.clickSaveButton();

            System.out.println("✅ User created successfully: " + username);
        } catch (Exception e) {
            throw new RuntimeException("❌ Failed to create new user: " + e.getMessage(), e);
        }
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        DriverFactory.quitDriver();
        System.out.println("✅ Browser closed successfully");
    }
}



//    @When("I edit the user {string} to {string}")
//    public void i_edit_the_user_to(String oldName, String newName) {
//        try {
//            adminPage.searchUser(oldName);
//            adminPage.editUser(newName);
//        } catch (Exception e) {
//            throw new RuntimeException("Error while editing user: " + e.getMessage(), e);
//        }
//    }
//
//    @When("I delete the user {string}")
//    public void i_delete_the_user(String username) {
//        try {
//            adminPage.deleteUser(username);
//        } catch (Exception e) {
//            throw new RuntimeException("Error while deleting user: " + e.getMessage(), e);
//        }
//    }
//
//    @Then("the user {string} should not appear in the list")
//    public void the_user_should_not_appear_in_the_list(String username) {
//        adminPage.verifyUserDeleted(username);
//    }
//}
