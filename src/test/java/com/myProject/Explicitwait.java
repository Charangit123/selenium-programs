package com.myProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(500,1200));
		driver.get("https://testproject.io/");
		driver.findElement(By.linkText("Login")).click();
		
		WebDriverWait waitf = new WebDriverWait(driver,10, 400);
		
		String parentWindow= driver.getWindowHandle();
	Set<String> windowhandles = driver.getWindowHandles();
		for (String handle : windowhandles) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
			}
		};
		Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
					public Boolean apply(WebDriver webdriver) {
						return webdriver.findElement(By.id("username")).isDisplayed();
						
	}	
		};
				waitf.until(f);
				
//				waitf.until(d->d.findElement(By.id("username")).isDisplayed());
//				waitf.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("Charanraj");
	
			}
}
