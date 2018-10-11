package jpetStoreckg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class baseTestClass extends BaseTest {
	

	
	@Test
	public void Tc1() throws IOException
	{
		
		BaseTest.invokeBrowser();
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		BaseTest.closeBrowser();
	

	}
}
