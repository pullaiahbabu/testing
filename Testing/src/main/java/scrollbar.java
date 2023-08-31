import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollbar {
	

	public static void main(String[] args) {
		 
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=11189190146390515520&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10573980&hydadcr=14453_2154373");
   WebElement ele= driver.findElement(By.xpath("//a[text()='Spain']"));
   org.openqa.selenium.Point  sele=ele.getLocation();
	
	
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
   // js.executeScript("window.scrollBy(0,800)");
    
    js.executeScript("window.scrollBy"+sele);
    
    
	}

}
