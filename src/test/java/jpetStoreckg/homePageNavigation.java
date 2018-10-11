package jpetStoreckg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class homePageNavigation extends BaseTest{

	

	@Test
	public void Tc13() throws IOException
	{
		BaseTest.invokeBrowser();		
		/*driver = new FirefoxDriver();
		driver.get("http://10.1.23.186:9080/jpetstore/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);*/
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id='LogoContent']/a/img")).click();
		System.out.println("Home page navigated successfully");
		
		BaseTest.closeBrowser();
	}
}

