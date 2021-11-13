package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_to_broswer {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	
	driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\user1\\Charan\\Downloads\\IJRET20150406058.pdf");
	//type="file" must contain for an id or any other locator
	
	}

}
