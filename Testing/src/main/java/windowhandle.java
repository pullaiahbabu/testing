import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		 String window1=driver.getWindowHandle();
		 
		 System.out.println(window1);
		 
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		// js.executeScript("window.scrollby(0,250)");
		 
		 driver.findElement(By.id("newWindowBtn")).click();
		 
		Set<String>   handles= driver.getWindowHandles();
		
		for(String handle:handles) {
			
			System.out.println(handle);
			
			if(!window1.equals(handle)) {
				
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("pullaiahbabu");
				driver.findElement(By.id("lastName")).sendKeys("kota");
				driver.findElement(By.id("malerb")).click();
				driver.findElement(By.id("englishchbx")).click();
				driver.findElement(By.id("email")).sendKeys("pullaiahbabu2000@gmail.com");
				driver.findElement(By.id("password")).sendKeys("chinna@99");
				
				
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
