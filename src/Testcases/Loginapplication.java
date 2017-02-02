package Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepagePF;
import objectrepository.RediffLoginpagePF;

public class Loginapplication {
	
	@Test
	public void Login() {
		
		
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpagePF rd=new RediffLoginpagePF(driver);
		RediffHomepagePF hp=new RediffHomepagePF(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("Bye");
		rd.Submit().click();
		rd.Home().click();
		hp.Search().sendKeys("hello");
		hp.Submit().click();
		
		
	}
	

}
