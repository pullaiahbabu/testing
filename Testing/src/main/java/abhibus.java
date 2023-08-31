import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class abhibus {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");

        int desiredDate = 15;

        // Find all date elements using findElements method
        List<WebElement> dateElements = driver.findElements(By.cssSelector(".calendar .date"));

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

        // Remember to close the browser after you're done
        driver.quit();
    }
}

