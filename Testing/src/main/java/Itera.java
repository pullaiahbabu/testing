import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itera {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		//driver.findElement(By.className("nav-link")).click();
		WebElement a= driver.findElement(By.id("name"));
		a.sendKeys("pullaiah babu");
		
		WebElement b=driver.findElement(By.id("phone"));
		b.sendKeys("9959983320");
		
		WebElement c=driver.findElement(By.id("email"));
		c.sendKeys("pullaiahbabu2000@gmail.com");
		
		WebElement d=driver.findElement(By.id("password"));
		d.sendKeys("chinna@99");
		
		WebElement e=driver.findElement(By.id("address"));
		e.sendKeys("3-49, main road chevitikallu, kanchikacherla mandal, ntr dist,ap- 521180");
		
		WebElement f= driver.findElement(By.name("submit"));
		
		System.out.println(f.isEnabled());
		System.out.println(f.isDisplayed());
		System.out.println(f.isSelected());
		
		WebElement g=driver.findElement(By.id("male"));
		g.click();
		
		driver.findElement(By.id("monday")).click();
		
		WebElement dropdownelement=driver.findElement(By.className("custom-select"));
		Select ele=new Select(dropdownelement);
		List<WebElement> option =ele.getOptions();
		for(WebElement h:option)
			
		{
			System.out.println(h.getText());
			
		}
		
		
		ele.selectByVisibleText("Norway");
		
		
		
		
		driver.findElement(By.className("custom-control-label")).click();
		
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
				
		

	}

}
