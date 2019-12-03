package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	
WebDriver driver;
By Home = By.linkText("Home");
By Searchbox = By.cssSelector("#srchword");
By SearchButton = By.className("newsrchbtn");
	
	public RediffHomepage(WebDriver driver){
		this.driver = driver;
	}
	

    
    public WebElement Homepage(){
    	return driver.findElement(Home);
    }

    public WebElement SearchItembox(){
    	
    	return driver.findElement(Searchbox);
    	
    }
    
    public WebElement Search(){
    	
    	return driver.findElement(SearchButton);
    }
    
}
