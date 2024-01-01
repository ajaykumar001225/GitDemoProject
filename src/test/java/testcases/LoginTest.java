package testcases;
import org.testng.annotations.Test;
import base.BaseClass;
import dataProvider.CustomDatProvider;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test(dataProvider = "loginDetails", dataProviderClass = CustomDatProvider.class)
	public void loginToApplication(String uname, String pass)
	{
		LoginPage login = new LoginPage(driver);
		
		login.loginToApplication(uname, pass);
		
		//	Assert
		
		//	Logout
		
		//	Home
		
	}
}

