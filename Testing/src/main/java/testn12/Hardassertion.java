package testn12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Hardassertion {
	
	@Test
	
	public void test() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		//SoftAssert sf=new SoftAssert();
		WebElement user= driver.findElement(By.name("emailid"));
		//sf.assertTrue(user.isDisplayed());
	
		
		
		org.testng.Assert.assertTrue(user.isDisplayed());
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		
		WebElement password = driver.findElement(By.name("pword"));
	 	//sf.assertFalse(user.isDisplayed());
		org.testng.Assert.assertTrue(password.isDisplayed());
		driver.findElement(By.name("pword")).sendKeys("1234");
		
		
			
				
	}

}
