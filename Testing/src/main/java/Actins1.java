import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actins1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		WebElement loc= driver.findElement(By.xpath("//span[text()='Convert PDF']"));
		
		
		
		Actions ac=new Actions(driver);
		
		ac.doubleClick(loc).build().perform();
		ac.moveToElement(loc).build().perform();
	     ac.contextClick(loc).build().perform();
		
		 
		
		
	
		
		
		
			
	
		
		

	}

}
