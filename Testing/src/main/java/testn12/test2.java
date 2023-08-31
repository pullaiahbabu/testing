package testn12;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class test2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setbrower() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 
		 }
	
	@Test
	
	public void homepage() {
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		String url=driver.getCurrentUrl();
		org.testng.Assert.assertEquals("http://poojastore.marolix.com/Authenticate/Login", url);
	}
	@Test
	
	public void login() {
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String urlhomepage=driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/Admin/Dashboard", urlhomepage);
		
	}
	@Test
	
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='/AdminAssets/dist/img/avatar5.png']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		String logouturl=driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/", logouturl);
	}
		
		@AfterClass
		
		public void teardown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
	}

}
