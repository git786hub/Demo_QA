package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage10 extends BaseTest{
	
	@Test
	public void Tc26() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[10]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h2[5]")).getText();
		Assert.assertEquals(text, "Reviewing An Order");
		System.out.println("Help Page for Reviewing An Order loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
