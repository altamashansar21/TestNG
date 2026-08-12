package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;	// UI of the report 
	public ExtentReports extent;	// populate common info on the report
	public ExtentTest Test;	// create text case entries in the report and update status of the test method 
	
	 public void onStart(ITestContext context) {
		 
		 sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html"); 
		 sparkReporter.config().setDocumentTitle("Automation Report");	// Tile of Report
		 sparkReporter.config().setReportName("Functional Testing"); 	// Name of the Report 
		 sparkReporter.config().setTheme(Theme.DARK);

		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 extent.setSystemInfo("Computer Name", "LocalHost");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("Tester Name", "Altamash");
		 extent.setSystemInfo("OS", "Window11");
		 extent.setSystemInfo("Browser Name", "Chrome");
		 
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		   Test = extent.createTest(result.getName()); // create a new entry in the report
		   Test.log(Status.PASS, "Test Case PASSED is "+result.getName()); // update status p/f/s
		  }
	 
	 public void onTestFailure(ITestResult result) {
		  Test = extent.createTest(result.getName()); // create a new entry in the report
		  Test.log(Status.FAIL, "Test Case FAILED is "+result.getName()); 
		  Test.log(Status.FAIL, "Test Case FAILED is "+result.getThrowable());
		  }
	 public void onTestSkipped(ITestResult result) {
		 Test = extent.createTest(result.getName()); // create a new entry in the report
		  Test.log(Status.SKIP, "Test Case SKIPPED is "+result.getName()); 
	  }
	 
	 public void onFinish(ITestContext context) {
		   extent.flush();
		  }
	 
}
