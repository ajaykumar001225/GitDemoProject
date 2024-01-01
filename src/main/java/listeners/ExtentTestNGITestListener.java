//package listeners;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//
//public class ExtentTestNGITestListener implements ITestListener{
//	
//	private static ExtentReports extent = ExtentManager.createInstance("extent.html");
//	private static ThreadLocal parentTest = new ThreadLocal();
//    private static ThreadLocal test = new ThreadLocal();
//	
//    @Override
//	public synchronized void onStart(ITestContext context) {
//    	ExtentTest parent = extent.createTest(getClass().getName());
//        parentTest.set(parent);
//	}
//
//	@Override
//	public synchronized void onTestStart(ITestResult result) {
//		//test start
//		ExtentTest child = parentTest.get().createNode(result.getMethod().getMethodName());
//        test.set(child);
//	}
//
//	@Override
//	public synchronized void onTestSuccess(ITestResult result) {
//		// add pass logs
//		test.get().pass("Test passed");
//	}
//
//	@Override
//	public synchronized void onTestFailure(ITestResult result) {
//		//add fail log, exception trace, add screenshot
//		test.get().fail(result.getThrowable());
//	}
//
//	@Override
//	public synchronized void onTestSkipped(ITestResult result) {
//		// add skip log
//		test.get().skip(result.getThrowable());
//	}
//	
//	@Override
//	public synchronized void onFinish(ITestContext context) {
//		//test finish / flush
//		extent.flush();
//	}
//
//}
