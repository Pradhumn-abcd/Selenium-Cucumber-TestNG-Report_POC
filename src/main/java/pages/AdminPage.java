//package pages;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//public class AdminPage {
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    private By adminTab = By.xpath("//span[text()='Admin']");
//    private By addButton = By.xpath("//button[normalize-space()='Add']");
//    private By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
//    private By usernameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
//    private By passwordField = By.xpath("(//input[@type='password'])[1]");
//    private By confirmPasswordField = By.xpath("(//input[@type='password'])[2]");
//    private By saveButton = By.xpath("//button[normalize-space()='Save']");
//    private By successToast = By.xpath("//p[contains(text(),'Successfully Saved')]");
//
//    public AdminPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//    }
//
//    public void openAdminModule() {
//        wait.until(ExpectedConditions.elementToBeClickable(adminTab)).click();
//    }
//
//    public void createUser(String username, String employeePartial) throws Exception {
//        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameField)).sendKeys(employeePartial);
//
//        Thread.sleep(1000);
//        driver.findElement(employeeNameField).sendKeys(Keys.ARROW_DOWN);
//        driver.findElement(employeeNameField).sendKeys(Keys.ENTER);
//
//        driver.findElement(usernameField).sendKeys(username);
//        driver.findElement(passwordField).sendKeys("Admin@123");
//        driver.findElement(confirmPasswordField).sendKeys("Admin@123");
//
//        driver.findElement(saveButton).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(successToast));
//        System.out.println("✅ User created successfully: " + username);
//    }
//}

    // -------- Search, Edit, Delete -------- //

//    public void searchUser(String username) throws Exception {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).clear();
//       ((WebElement) usernameField).clear();
//        driver.findElement(usernameField).sendKeys(username);
//        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(table));
//    }
//
//    public void verifyUserDisplayed(String username) {
//        By userRow = By.xpath("//div[@role='row']//div[text()='" + username + "']");
//        if (!driver.findElements(userRow).isEmpty()) {
//            System.out.println("✅ User found: " + username);
//        } else {
//            throw new RuntimeException("❌ User not found: " + username);
//        }
//    }
//
//    public void editUser(String oldUsername, String newUsername) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        try {
//            // Search user
//            searchUser(oldUsername);
//
//            // Wait for table rows
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']//div[@role='row']")));
//
//            // Build dynamic locator (case-insensitive match)
//            By editBtn = By.xpath("//div[@role='row']//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" 
//                                  + oldUsername.toLowerCase() + "')]/ancestor::div[@role='row']//button[contains(@class,'edit')]");
//            wait.until(ExpectedConditions.elementToBeClickable(editBtn)).click();
//
//            // Change username
//            By usernameField = By.xpath("//label[text()='Username']/following::input[1]");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).clear();
//            driver.findElement(usernameField).sendKeys(newUsername);
//
//            // Save
//            By saveBtn = By.xpath("//button[normalize-space()='Save']");
//            wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
//
//            // Wait for success message
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-text--toast-message')]")));
//
//        } catch (Exception e) {
//            throw new RuntimeException("Error while editing user: " + e.getMessage(), e);
//        }
//    }
//
//    public void deleteUser(String username) throws Exception {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        searchUser(username);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='table']//div[@role='row']")));
//
//        By deleteBtn = By.xpath("//div[@role='row']//div[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" 
//                                + username.toLowerCase() + "')]/ancestor::div[@role='row']//button[contains(@class,'delete')]");
//        wait.until(ExpectedConditions.elementToBeClickable(deleteBtn)).click();
//
//        By confirmBtn = By.xpath("//button[normalize-space()='Yes, Delete']");
//        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-text--toast-message')]")));
//    }
//}




































package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AdminPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // --- Locators ---
    private By adminMenu = By.xpath("//span[text()='Admin']");
    private By addButton = By.xpath("//button[normalize-space()='Add']");
    private By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[1]");
    private By userRoleESS = By.xpath("//div[@role='option' and normalize-space()='ESS']");
    private By statusDropdown = By.xpath("//label[text()='Status']/following::div[1]");
    private By statusEnabled = By.xpath("//div[@role='option' and normalize-space()='Enabled']");
    private By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    // note: this is the locator for any suggestion option (we pick the first visible one)
    private By employeeSuggestionAny = By.xpath("//div[@role='option']");
    private By usernameField = By.xpath("//label[text()='Username']/following::input[1]");
    private By passwordField = By.xpath("//label[text()='Password']/following::input[1]");
    private By confirmPasswordField = By.xpath("//label[text()='Confirm Password']/following::input[1]");
    private By saveButton = By.xpath("//button[normalize-space()='Save']");
//
//    private By searchUsernameField = By.xpath("(//label[text()='Username']/following::input)[1]");
//    private By searchButton = By.xpath("//button[normalize-space()='Search']");
//    private By editButton = By.xpath("(//i[contains(@class,'bi-pencil-fill')])[1]");
//    private By deleteButton = By.xpath("(//i[contains(@class,'bi-trash')])[1]");
//    private By confirmDeleteButton = By.xpath("//button[normalize-space()='Yes, Delete']");
//    private By successMessage = By.xpath("//div[contains(@class,'oxd-toast-content')]");
//
    // --- Constructor ---
    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // --- Utility: safe click with JS fallback ---
    private void safeClick(By locator) {
        try {
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
            try {
                el.click();
            } catch (ElementClickInterceptedException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
            }
        } catch (TimeoutException e) {
            throw new RuntimeException("Element not clickable: " + locator, e);
        }
    }

    // --- Page actions ---
    public void navigateToAdminModule() {
        safeClick(adminMenu);
    }

    public void clickAddButton() {
        safeClick(addButton);
    }

    public void selectUserRole(String role) {
        safeClick(userRoleDropdown);
        if (role.equalsIgnoreCase("ESS")) {
            safeClick(userRoleESS);
        }
    }

    public void selectStatus(String status) {
        safeClick(statusDropdown);
        if (status.equalsIgnoreCase("Enabled")) {
            safeClick(statusEnabled);
        }
    }

    /**
     * Type into employee field (shows suggestions).
     * After calling this, call selectEmployeeSuggestion() to pick the first suggestion.
     */
    public void enterEmployeeName(String employee) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameField));
        input.click();
        input.sendKeys(employee);

        // Allow suggestions to load (give enough buffer)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

 // --- Employee suggestion dropdown selection ---
    public void selectEmployeeSuggestion() {
        By firstOption = By.xpath("(//div[@role='option'])[1]");

        try {
            // wait for dropdown to show
            wait.until(ExpectedConditions.visibilityOfElementLocated(firstOption));
            WebElement firstVisible = driver.findElement(firstOption);

            // wait until clickable
            wait.until(ExpectedConditions.elementToBeClickable(firstVisible));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstVisible);

            try {
                firstVisible.click();
            } catch (Exception e) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstVisible);
            }

            Thread.sleep(1000); // small delay to register

        } catch (TimeoutException e) {
            throw new RuntimeException("Employee suggestion did not appear in time.", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }




    public void enterUsername(String username) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        input.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        input.sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordField));
        input.sendKeys(password);
    }

    public void clickSaveButton() throws InterruptedException {
        safeClick(saveButton);
        Thread.sleep(10000);       // verifySuccessMessage();
    }
}
    //
////    public void verifySuccessMessage() {
////        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
////    }
//
//    public void searchUser(String username) throws Exception {
//        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchUsernameField));
//        input.sendKeys(username);
//        Thread.sleep(3000);
//        safeClick(searchButton);
//    }
//
//    public void editUser(String newUsername) throws InterruptedException {
//        safeClick(editButton);
//        enterUsername(newUsername);
//        clickSaveButton();
//    }
//
//    public void deleteUser(String username) throws Exception {
//        searchUser(username);
//        safeClick(deleteButton);
//        safeClick(confirmDeleteButton);
//        //verifySuccessMessage();
//    }
//
//    public void verifyUserDisplayed(String username) {
//        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//div[text()='" + username + "']")));
//        if (!user.isDisplayed()) throw new RuntimeException("User not displayed: " + username);
//    }
//
//    public void verifyUserDeleted(String username) {
//        try {
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(
//                    By.xpath("//div[text()='" + username + "']")));
//        } catch (TimeoutException e) {
//            throw new RuntimeException("User still exists: " + username);
//        }
//    }
//}
