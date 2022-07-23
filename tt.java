package test.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tt {
	@BeforeSuite //1
	public void SetUp() {
		System.out.println("Setup System properly");
	}
	
	@BeforeTest  //2
	public void launchbrowser() {
		System.out.println("lacunch Browser");
		
	}
	@BeforeClass //3
	public void login() {
		System.out.println("Login intothe app");
	}
	@BeforeMethod //4
	public void enterUrl() {
		System.out.println("enter url");
	}
	
	@Test
	public void googletitleTest() {
		System.out.println("Googletitle test");
	}
	
	// Post conditions starting with @After
	
	@AfterMethod //6
	public void logout() {
		System.out.println("logout fromapp");
	}
	@AfterClass //7
	public void closebrowser() {
		System.out.println("closeBrowser");
		
	}
	@AfterTest //8
	public void deleteallcookies() {
		System.out.println("Delete all Cookies");
	}
}
