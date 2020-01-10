package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class Homepage extends Base {
	
	Landingpage l ;
	
	
	
	@Test
	public void contactt() throws IOException, InterruptedException {
		
		driver =initialize();
		driver.get("https://www.sprucetech.com/");
		
		l=new Landingpage(driver);
		
		
	l.getAbout().click();
	System.out.println(l.getLogo().isDisplayed());
		
		
	l.getContact().click();
	l.getNeedhelp().isDisplayed();

	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
