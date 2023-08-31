import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		Thread.sleep(3000);
		driver.get("http://poojastore.marolix.com/");
	//	System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.name("emailid"));
		
		
		driver.getCurrentUrl();
		
		
		
		
	

	}

}
