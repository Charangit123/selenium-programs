package com.myProject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maximize_window_Chromeoptionsclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//driver.manage().window().setSize(new Dimension(500,1200));
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://github.com/login");
	}

}
