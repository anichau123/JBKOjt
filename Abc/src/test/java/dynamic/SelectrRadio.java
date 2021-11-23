package dynamic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectrRadio {
	 WebDriver driver = null;

	 public void dynamiicradio(String Text) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		List<WebElement> radios= driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement rad : radios) {
			if (rad.equals(Text)) {
				rad.click();
			} else {
				System.out.println("Please Entter Correct Credientiials");
			}

		}

	}

}
