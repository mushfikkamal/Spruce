package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	
	private By about=By.xpath("//*[@id=\'menu-item-24\']/a/span");
	private By logo =By.xpath("//img[@class=\'custom-logo\']");
	


	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}


	
		
		
		
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	

	public WebElement getAbout() {
		return driver.findElement(about);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
