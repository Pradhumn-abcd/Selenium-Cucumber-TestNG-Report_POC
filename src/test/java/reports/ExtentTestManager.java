package reports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentTestManager {

    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return testThread.get();
    }

    public static void startTest(String testName, String description) {
        ExtentTest test = ExtentManager.getInstance().createTest(testName, description);
        testThread.set(test);
    }

    public static void logInfo(String message) {
        getTest().log(Status.INFO, message);
    }

    public static void logPass(String message) {
        getTest().log(Status.PASS, message);
    }

    public static void logFail(String message) {
        getTest().log(Status.FAIL, message);
    }

    public static void removeTest() {
        testThread.remove();
    }
}
