import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3[text()='PDF to Word']")).click();
		driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		
		Robot rb=new Robot();
		
		StringSelection rc=new StringSelection("file:///C:/Users/SMART/Downloads/java%20april%20team%20assessment.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(rc, null);
		
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
	
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		

	}

}
