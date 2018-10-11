package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnHomePageFromReptilesPage extends BaseTest{

	@Test
	public void Tc31() throws IOException
	{
		BaseTest.invokeBrowser();	
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='SidebarContent']/a[4]/img")).click();
		String expectedText = driver.findElement(By.xpath(".//*[@id='Catalog']/h2")).getText();
		
		Assert.assertEquals(expectedText, "Reptiles");
		
		System.out.println("Reptiles Catalogue Details page loaded successfully");
		driver.findElement(By.xpath(".//*[@id='LogoContent']/a/img")).click();
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).getText();
		Assert.assertEquals(text, "Sign In");
		System.out.println("Successfully returned to Home Page from Reptiles Catalogue Page");
		
			
		BaseTest.closeBrowser();
	

	}
}
