import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		
		driver. findElement(By.id("first_date_picker")).click();
		
		String day="15";
		
		String month="November";
		
		String year="2000";
		
		while (true) {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String monthandyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String[]  month_year= monthandyear.split(" ");
		
		String mon=month_year[0];
		
		String yr=month_year[1];
		
		if(mon.equals(month)&& (yr.equals(year))) {
			
			break;
			
		}
			
		else {
				
				driver.findElement(By.className("ui-datepicker-prev")).click();
			}
				
			}
	List<WebElement> date= driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		
		for (WebElement dates : date) {
			
			if(dates.getText().equals(day)) {
				
				dates.click();
				
				break;
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
