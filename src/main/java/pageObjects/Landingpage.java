package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	
	
	WebDriver driver;
	
	
	private By about	 =By.xpath("//nav[@id='site-navigation']/ul/li[1]/a/span");
	private By logo 	= By.xpath("//*[@id=\"gallery-1\"]/figure[1]/div/a/img");
	private By contact	 =By.xpath("//nav[@id='site-navigation']/ul/li[5]/a/span");
	private By needhelp =By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[4]/div/div/div/div/div/div[1]/div/h2");
	
	
	
	
	
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}



	public WebElement getAbout() {
		return driver.findElement(about);
		
	}

	public WebElement getLogo() {
		return driver.findElement(logo);
		
	}

	public WebElement getContact() {
		return driver.findElement(contact);
		
	}
	
	public WebElement getNeedhelp() {
		return driver.findElement(needhelp);
		
	}
	
	
	
	
	
	
	
	
	

}
