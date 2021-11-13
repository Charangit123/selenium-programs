package com.myProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement courseElemnt = driver.findElement(By.id("course"));
		Select courseDropdown = new Select(courseElemnt);
		List<WebElement> courseDropdownOption= courseDropdown.getOptions();
		for(WebElement x : courseDropdownOption ) {
			System.out.println("all dropdown elemnts --" +x.getText());
		}
			courseDropdown.selectByIndex(2);
			Thread.sleep(3000);
			courseDropdown.selectByValue("js");
			Thread.sleep(3000);
			courseDropdown.selectByVisibleText("Dot Net");
		
	
		WebElement IdeElemnt =  driver.findElement(By.id("ide"));
		Select multiElemntbox = new Select(IdeElemnt);
		List<WebElement> idboxoptions = multiElemntbox.getOptions();
		for (WebElement g : idboxoptions) {
			System.out.println(g.getText());
		}
		
		multiElemntbox.selectByIndex(0);
		Thread.sleep(3000);
		multiElemntbox.selectByValue("ij");
		Thread.sleep(3000);
		multiElemntbox.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);

		multiElemntbox.deselectByValue("ij");
		List<WebElement> selectdroptions = multiElemntbox.getAllSelectedOptions();
		Thread.sleep(3000);
		for (WebElement txt : selectdroptions) {
			System.out.println("multibox values---" + txt.getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
