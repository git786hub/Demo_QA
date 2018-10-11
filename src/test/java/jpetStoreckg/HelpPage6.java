package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage6 extends BaseTest{
	
	@Test
	public void Tc23() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[6]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h2[4]")).getText();
		Assert.assertEquals(text, "Working with the Shopping Cart");
		System.out.println("Help Page for Working with the Shopping Cart loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
