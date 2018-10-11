package jpetStoreckg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartPage extends BaseTest{
	
	

	@Test
	public void Tc2() throws IOException
	{
		BaseTest.invokeBrowser();	
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).click();
		driver.findElement(By.name("username")).sendKeys("testuser");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).clear();
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).sendKeys("testuser");
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[1]/img")).click();
		String text = driver.findElement(By.xpath(".//*[@id='Cart']/h2")).getText();
		Assert.assertEquals(text, "Shopping Cart");
		System.out.println("Cart Page loaded successfully");
				
		
		BaseTest.closeBrowser();	
		
	}
	

}
