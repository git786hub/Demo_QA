package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpPage extends BaseTest{
	
	@Test
	public void Tc17() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).click();
		String text = driver.findElement(By.xpath(".//*[@id='Content']/h1")).getText();
		Assert.assertEquals(text, "JPetStore Demo");
		System.out.println("Help Page loaded successfully");
				
		BaseTest.closeBrowser();
	}

}
