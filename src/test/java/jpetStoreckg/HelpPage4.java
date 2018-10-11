package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage4 extends BaseTest {
	
	@Test
	public void Tc21() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[4]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h4[1]")).getText();
		Assert.assertEquals(text, "Browsing the Catalog");
		System.out.println("Help Page for Browsing the Catalog loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
