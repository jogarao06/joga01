package jdbc_Demo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersImplementation1 implements ITestListener {

	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {

		test = reports.createTest(result.getMethod().getMethodName()+" "+"Test PAssed");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());

	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getMethod().getMethodName());
		test.log(Status.FAIL,result.getThrowable());
		try {
			
			String path = ExtensrRepo.Screenshort(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

		test.log(Status.SKIP, result.getMethod().getMethodName() + " Test got Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		reporter = new ExtentHtmlReporter("./ExtentReports/SDET4.html");
		reporter.config().setDocumentTitle("VTigerCRM");
		reporter.config().setTheme(Theme.STANDARD);

		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Name of application", "VTigercRM");
		reports.setSystemInfo("Build.No", "4.2.8");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
