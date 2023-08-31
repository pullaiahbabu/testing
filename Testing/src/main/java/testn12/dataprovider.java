package testn12;

import static org.testng.Assert.assertEquals;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class dataprovider {

	@Test(dataProvider = "logintest")
	
	
	public void data(String username,String password) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("emailid")).sendKeys(username);
		driver.findElement(By.name("pword")).sendKeys(password);
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		Thread.sleep(30000);
		
		
		 String url=driver.getCurrentUrl();
		 org.testng.Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
		 
	}
	
	@DataProvider(name="logintest")
	
	public Object[][] datatest() throws InterruptedException {
	
	Object [][] data=new Object[5][2];
	data[0][0]="admin@gmail.com";
	data[0][1]="12345";
	data[1][0]="pooja132@mail.com";
	data[1][1]="1234";
	data[2][0]="pullaiahbabu@gmail.com";
	data[2][1]="456789";
	
	return data;
	
	}
	
	
	
	
	
	}
