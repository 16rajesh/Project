package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	static WebDriver driver;
	static FileInputStream file;
	static Properties prop;
	
	public void openbrowser() throws Exception{
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		file = new FileInputStream("D:\\prakash1\\CRMFramework\\src\\objectrepository\\objectrepository.properties");
		prop = new Properties();
		prop.load(file);
		
	}
	public void navigate(String data){
		driver.get(data);
						
	}
	public void input(String data, String objectname){
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
		
	}
	public void click(String objectname){
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
	}
	
	
	

}
