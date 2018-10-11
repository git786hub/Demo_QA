package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage2 extends BaseTest {
	
	@Test
	public void Tc19() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[2]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h2[2]")).getText();
		Assert.assertEquals(text, "Signing In");
		System.out.println("Help Page for Signing In loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
