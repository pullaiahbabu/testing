import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		
		WebElement frames=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frames);
		WebElement ele=driver.findElement(By.id("selectnav2"));
		ele.click();
		Select home=new Select(ele);
		home.selectByVisibleText("Contact");
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.id("selectnav1"));
		dropdown.click();
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("- Dot Net");
		
		
		
		
		
		

	}

}
