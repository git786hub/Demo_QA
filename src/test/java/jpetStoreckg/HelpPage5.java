package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage5 extends BaseTest{
	
	@Test
	public void Tc22() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[5]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h4[2]")).getText();
		Assert.assertEquals(text, "Searching the Catalog");
		System.out.println("Help Page for Searching the Catalog loaded successfully");
				
		BaseTest.closeBrowser();
	}


}
