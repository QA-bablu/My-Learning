package TestNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SavingsAccount {

	@Test(dataProvider="getData")
	public void Login(String usernam, String paswd) {
		
		System.out.println(usernam+":"+paswd);
		//System.out.println("Login successful-SavingsAccount");
	}

	@Parameters({ "Url" })
	@Test
	public void logout(String url) {

		System.out.println(url);

		System.out.println("Logout successful-SavingsAccount");
	}

	@Test
	public void accountSummary() {

		System.out.println("Account summary-SavingsAccount");
	}
	
	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "1st Username";
		data[0][1] = "password";
		data[1][0] = "2nd Username";
		data[1][1] = "password";
		data[2][0] = "3rd Username";
		data[2][1] = "password";
		return data;

	}

}
