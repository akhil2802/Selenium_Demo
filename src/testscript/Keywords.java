package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	
	static WebDriver driver;
	static FileInputStream file;
	static Properties prop;
	
	public void openbrowser() throws IOException, InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		file = new FileInputStream("F:\\Work_Spaces\\eclipse_workspace\\CRMSalesforceFramework\\src\\objectrepository\\objectrepository.properties");
		prop = new Properties();
		prop.load(file);
		
	}

	public void navigate(String data) {
		driver.get(data);
	}

	public void input(String data, String objectName) {		
		
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	
	}

	public void click(String objectName) throws InterruptedException {
		
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public String verifyTitle() {
		
		String actualValue = driver.getTitle();
		
		return actualValue;
	}

	public String verifyPageText(String objectName) {
		
		String actualValue = driver.findElement(By.xpath(prop.getProperty(objectName))).getText();
		
		return actualValue;
	}

	public String verifyEditBox(String objectName) {
		
		String actualValue = driver.findElement(By.xpath(prop.getProperty(objectName))).getText();
		
		return actualValue;
	}
}
