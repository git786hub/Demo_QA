package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage9 extends BaseTest{
	
	@Test
	public void Tc25() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='Content']/ul/li[9]/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h4[5]")).getText();
		Assert.assertEquals(text, "Ordering Items");
		System.out.println("Help Page for Ordering Items loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
