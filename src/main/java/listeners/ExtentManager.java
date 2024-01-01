package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	
	public static ExtentReports extend;
	
	public static ExtentReports getInstance() {
		if(extend==null)
		{
			extend=createInstance();
			return extend;
			
		}
		else
		{
			return extend;
		}
	}
	
	
	
	public static ExtentReports createInstance() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/Automation.html");
        
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Sprint 1 Report");
        htmlReporter.config().setReportName("Automation Report");
        
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        return extent;
    }
}
