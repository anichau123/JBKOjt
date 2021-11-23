package com.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchb {

	@Test
	void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> all_link = driver.findElements(By.tagName("a"));

		System.out.println("size of all link  =" + all_link.size());

		List<String> urlList = new ArrayList<String>();
		for (WebElement link : all_link) {
			String url = link.getAttribute("href");
			urlList.add(url);
           //checkBrokenLink(url);
     
		}
		long St_Time=System.currentTimeMillis();
		 urlList.parallelStream().forEach(link -> checkBrokenLink(link));
		 long En_Time=System.currentTimeMillis();
		 System.out.println("Total time = "+(En_Time-St_Time));
		 driver.quit();
	}
	
	public static void checkBrokenLink(String url_link) {
	try {	URL url=new URL(url_link);
	HttpURLConnection httpconnection=(HttpURLConnection )url.openConnection();
		httpconnection.setConnectTimeout(5000);
		httpconnection.connect();
		if(httpconnection.getResponseCode()>=400) {
			System.out.println(url_link+"----->"+httpconnection.getResponseMessage()+"this is broken link");
			
		}
		
		else {
			System.out.println(url_link+"------->"+httpconnection.getResponseMessage()+"this is not broken link");
			
			
			
		}
				
		
	}
	catch(Exception e) {
		
		
		
		}
	
	
	
	
	}
	
	
	

}
