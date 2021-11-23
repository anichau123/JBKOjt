package skip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dynamic.SelectrRadio;

public class SelectRadioDynamic {
	WebDriver driver=null;
	@Test
public void selectRadio(){
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to("http://demo.automationtesting.in/Register.html");
	 System.out.println("All is Well");
}


}
