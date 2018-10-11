package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage8 extends BaseTest{
	
	@Test
	public void Tc24() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[8]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h4[4]")).getText();
		Assert.assertEquals(text, "Updating the Quantity of an Item");
		System.out.println("Help Page for Updating the Quantity of an Item loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
