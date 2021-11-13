package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Webelements {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		
		//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//label[normalize-space(text())='Username or email address']")).getAttribute("for"));
		System.out.println(driver.findElement(By.xpath("//input[@id='password']/preceding-sibling::label")).getText());
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
	driver.close();
	}

}
