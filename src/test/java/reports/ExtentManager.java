package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    private static ExtentReports createInstance() {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String reportName = "ExtentReport_" + timestamp + ".html";
        String reportPath = System.getProperty("user.dir") + "/reports/" + reportName;

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setReportName("OrangeHRM Automation Test Results");
        spark.config().setDocumentTitle("Automation Test Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "pradhumn QA");
        extent.setSystemInfo("Environment", "Pradhu Env QA");
        extent.setSystemInfo("Application", "OrangeHRM");

        return extent;
    }
}
