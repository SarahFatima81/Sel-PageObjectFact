package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginPage;

public class LoginApplication {
	
	
	@Test
	public void Login(){
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("sreffew");;
		rd.Password().sendKeys("dwrdf");;
		rd.Submit().click();
	}
	
		@Test
	public void SearchItem(){
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		RediffHomepage rh = new RediffHomepage(driver);
		rh.Homepage().click();
		rh.SearchItembox().sendKeys("rediff");
		rh.Search().click();
		
		
	}

	}
		
		

	


