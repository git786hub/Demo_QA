package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage7 extends BaseTest{
	
	@Test
	public void Tc23() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[7]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h4[3]")).getText();
		Assert.assertEquals(text, "Adding and Removing Items");
		System.out.println("Help Page for Adding and Removing Items loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
