package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnToMainMenu extends BaseTest{
	
	@Test
	public void Tc27() throws IOException
	{
		BaseTest.invokeBrowser();
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[1]/img")).click();
		driver.findElement(By.xpath(".//*[@id='BackLink']/a")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).getText();
		Assert.assertEquals(text, "Sign In");
		System.out.println("Successfully returned to Home Page");
				
		BaseTest.closeBrowser();
	}

}
