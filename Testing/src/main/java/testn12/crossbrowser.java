package testn12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class crossbrowser {
	WebDriver driver;
	
	@Test
	@org.testng.annotations.Parameters("browser")
	
	public void babu(String babu ) {
		
		if(babu.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(babu.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		else if(babu.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
			
		}
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().window().maximize();
		driver.findElement(By.name("emailid")).sendKeys("poojastore132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
		
	}
	

}
