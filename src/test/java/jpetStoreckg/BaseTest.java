package jpetStoreckg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	public static WebDriver driver;
		
	public static void invokeBrowser() throws IOException 
	
	{
		
		Properties or = new Properties();
		FileInputStream fis = new FileInputStream("C:\\DemoTools\\jpet\\src\\test\\resources\\config.properites");
		or.load(fis);
		
		if((or.getProperty("browser")).equals("firefox")){
		driver = new FirefoxDriver();
		}
		else if ((or.getProperty("browser")).equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\DemoTools\\jpet\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
			
		}
		
		driver.get(or.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
	}
	
	public static void closeBrowser(){
		
		driver.close();
	}
}
