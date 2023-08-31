import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://mvnrepository.com/");
		 
		 driver.manage().window().maximize();
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 File source =ts.getScreenshotAs(OutputType.FILE);
		 
		 File target=new File(".//src//babu.png");
		 FileUtils.copyFile(source,target);

		 

	
		
	}

}
