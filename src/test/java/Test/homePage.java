package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class homePage extends Base{
	Landingpage m;
	
	@Test
	public void init() throws IOException {
		
		driver = initialize(); 
		
		driver.get("https://www.sprucetech.com/");
		
	}
@Test
public void about() {
	 m=new Landingpage(driver);
	m.getAbout().click();
	
	
}

@Test
public void logo() {
assertEquals(m.getLogo().getText(), "Spruce");	
}
}
