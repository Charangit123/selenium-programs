package com.myProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLibraries {

	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	}

}
