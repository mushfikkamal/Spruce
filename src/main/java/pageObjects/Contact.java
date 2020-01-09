package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
	
	WebDriver driver;
	
	private By tittle	 =By.xpath("//nav[@id='site-navigation']/ul/li[5]/a/span");
	private By validation=By.cssSelector("h3[class='elementor-image-box-title']");
	private By social	 =By.xpath("//div[@class=\'elementor-social-icons-wrapper\']");
	private By first		 = By.xpath("//input[@id=\'wpforms-477-field_0\']");
	private By last		 = By.id("wpforms-477-field_0-last");
	private By email	 = By.cssSelector("input[id=\'wpforms-477-field_1\']");
	private By comment	 = By.id("wpforms-477-field_2");
	private By submit	 =By.name("wpforms[submit]");
	
	
	
	
	
	

	public Contact(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getFirst() {
		return driver.findElement(first);
		
	}
	
	public WebElement getLast() {
		return driver.findElement(last);
		
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
		
	}
	
	public WebElement getComment() {
		return driver.findElement(comment);
		
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
		
	}
	
	
	

public WebElement getSocial() {
	return driver.findElement(social);
}


public List<WebElement> getValidation() {
	return driver.findElements(validation);
	
}






	public WebElement getTittle() {
		return driver.findElement(tittle);
		
	}
	
	
	
	
	
	
	
	

}
