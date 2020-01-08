package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver initialize() throws IOException {
		
	 pro=new Properties();
	FileInputStream fis=new FileInputStream("C:\\I-Phone\\Sprouce\\src\\main\\java\\resources\\data.properties");
	pro.load(fis);	
	
	String browsername=pro.getProperty("browser");
	
	if (browsername.contains("chrome")) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\seleneum\\downloads\\chromedriver79\\chromedriver_win32\\chromedriver.exe");
		
		 driver =new ChromeDriver();
	}
	else if (browsername.contains("firefox")) {
		
		System.setProperty("webdriver.gecho.driver", "");
	}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
