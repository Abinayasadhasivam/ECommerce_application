package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
    private static ExtentReports extent;
    //private static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getExtent() {
        if (extent == null) {
      //      htmlReporter = new ExtentHtmlReporter("extentReport.html");
            extent = new ExtentReports();
          //  extent.attachReporter(htmlReporter);
        }
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        return getExtent().createTest(testName);
    }
}
