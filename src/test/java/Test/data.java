package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Contact;
import resources.Base;

public class data extends Base {
	

	//, String email, String comment
	
		
		
		@Test(dataProvider="getData")
		
		public void info(String Username,String Password)throws IOException{
		
		Contact c =new Contact(driver);
		
	driver=	initialize();
	driver.get("https://www.sprucetech.com");
	
	
	c.getTittle().click();
	c.getFirst().sendKeys(Username);
	c.getLast().sendKeys(Password);
	//c.getEmail().sendKeys(email);
	//c.getComment().sendKeys(comment);
	c.getSubmit().click();
	 
	
}













@DataProvider
public Object[][] getData(){
	Object [][] data=new Object [2][2];
	
	data [0][0]="firstname";
	data [0][1]="lastname";
	//data [0][2]="email";
	//data [0][3]="hi";
	
	
	data [1][0]="name";
	data [1][1]="last";
	//data [1][2]="email@";
	//data [1][3]="hello";
	
	return data;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


