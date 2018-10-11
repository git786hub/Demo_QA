package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage1 extends BaseTest {
	
	@Test
	public void Tc18() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[1]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h2[1]")).getText();
		Assert.assertEquals(text, "Signing Up");
		System.out.println("Help Page for Signing up loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
