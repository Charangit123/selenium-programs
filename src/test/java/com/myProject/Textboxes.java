package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textboxes {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email"));
		
		WebElement txtbox= driver.findElement(By.id("email"));
		if (txtbox.isDisplayed())
		{
			if(txtbox.isEnabled()) {
				txtbox.sendKeys("charanraj");				
				Thread.sleep(3000);
				String enterdtext = txtbox.getAttribute("value");
				System.out.println(enterdtext);
				txtbox.clear();
				
				txtbox.sendKeys("My rules");
				Thread.sleep(3000);
				txtbox.clear();
			} else {
				System.err.println("textbox not enabled");
			}
		}
		else {
			System.err.println("text box isnot displayed");
		}
	Thread.sleep(3000);
		driver.close();	


}
	}