import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.id("pills-rental-tab")).click();
		driver.findElement(By.id("source")).click();
		driver.findElement(By.id("source")).sendKeys("Bapatla");
		driver.findElement(By.id("destination")).click();
		driver.findElement(By.id("destination")).sendKeys("Hyderabad");
		//driver.findElement(By.id("datepicker1")).click();
		List<WebElement> dateElements = driver.findElements(By.cssSelector(".calendar .date"));

        int desiredDate = 2;
		// Use stream() and filter() to find the desired date element
        WebElement desiredDateElement = dateElements.stream()
                .filter(element -> element.getText().equals(String.valueOf(desiredDate)))
                .findFirst()
                .orElse(null);

        if (desiredDateElement != null) {
            // Click on the desired date element to select it
            desiredDateElement.click();
        } else {
            System.out.println("Desired date not found in the calendar.");
        }

		driver.findElement(By.id("datepicker1")).sendKeys("02-08-2023");

	}

}
