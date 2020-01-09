package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Contact;
import resources.Base;

public class Contacttest extends Base {
	
	Contact c;
	
	@Test
	public void brow() throws IOException, InterruptedException {
		
		driver=initialize();
		
		
		driver.get("https://www.sprucetech.com");
		
		
	}
	
	@Test
	public void cons() {
		c=new Contact(driver);
		c.getTittle().click();
		for (int i=0;i<3;i++){
		List<WebElement> name =c.getValidation();
		if(name.contains("office")) {
		Assert.assertEquals(((WebElement) c.getValidation()).getText(), "uu");
		}
		}
		}
	
	
	
	
	@Test
	public void fbsocial() {
	
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement foo=driver.findElement(By.xpath("//div[@class=\"elementor-social-icons-wrapper\"]"));
		//System.out.println(foo.findElements(By.tagName("a")).size());
		for (int i=0; i<foo.findElements(By.tagName("a")).size();i++) {
		String mushi=Keys.chord(Keys.CONTROL,Keys.ENTER);
		foo.findElements(By.tagName("a")).get(i).sendKeys(mushi);
		}
		Set <String> st=driver.getWindowHandles();
		Iterator<String>it= st.iterator();
		while (it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
		}
		}
	
	
	@Test(dataProvider="getdata")
	public void info(String firstname, String lastname, String email, String comment){
		
		driver.get("https://www.sprucetech.com");
		
		c.getTittle().click();
		c.getFirst().sendKeys(firstname);
		c.getLast().sendKeys(lastname);
		c.getEmail().sendKeys(email);
		c.getComment().sendKeys(comment);
		c.getSubmit().click();
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider
	public Object[][] getData(){
		Object [][] data=new Object [2][4];
		
		data [0][0]="firstname";
		data [0][1]="lastname";
		data [0][2]="email";
		data [0][3]="hi";
		
		
		data [1][0]="name";
		data [1][1]="last";
		data [1][2]="email@";
		data [1][3]="hello";
		
		return data;
		
	}
	

	
	
	
	
	
	

}
