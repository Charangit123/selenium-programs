package com.myProject;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_load_timer {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant Starttime = Instant.now();
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
		 Instant Endtime = Instant.now();
		 System.out.println("Starttime--" +Starttime);
		 System.out.println("Endtime--" +Endtime);
		 System.out.println(Starttime);
		 System.out.println(Endtime.toString());
		 System.out.println(Duration.between(Starttime,Endtime).toMillis());
		 Duration durtime=Duration.between(Starttime,Endtime);
		 System.out.println("In milli sec---" +durtime.toMillis());
System.out.println(driver.getTitle());
	driver.close();
	}
}
