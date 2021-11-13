package com.myProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().proxy(null).setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
