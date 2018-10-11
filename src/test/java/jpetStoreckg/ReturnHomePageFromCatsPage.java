package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnHomePageFromCatsPage extends BaseTest{
	
	@Test
	public void Tc30() throws IOException
	{
		BaseTest.invokeBrowser();	
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='SidebarContent']/a[3]/img")).click();
		String expectedText = driver.findElement(By.xpath(".//*[@id='Catalog']/h2")).getText();
		
		Assert.assertEquals(expectedText, "Cats");
		
		System.out.println("Cats Catalogue Details page loaded successfully");
		driver.findElement(By.xpath(".//*[@id='LogoContent']/a/img")).click();
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).getText();
		Assert.assertEquals(text, "Sign In");
		System.out.println("Successfully returned to Home Page from Cats Catalogue Page");
		
			
		BaseTest.closeBrowser();
	

	}

}
