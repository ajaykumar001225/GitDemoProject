package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDatProvider {

	@DataProvider(name="loginDetails")
	public static Object[][] getData()
	{
		Object[][] arr = ExcelReader.getDataFormSHeet("Login");	
		return arr;
	}
}
