package com.myProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_in_Selenium {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Text1");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select dropdownbox = new Select(driver.findElement(By.id("course")));
		dropdownbox.selectByValue("java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		Thread.sleep(3000);

		driver.switchTo().frame("frm1");// frame1
		dropdownbox.selectByVisibleText("Dot Net");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();// frame2
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Ramcharan");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();// frame3
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Textinframe3");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");// nested frame 1
		Select dropinNestedframe = new Select(driver.findElement(By.id("selectnav1")));
		dropinNestedframe.selectByVisibleText("- SQL");

		List<WebElement> listofitems = dropinNestedframe.getOptions();
		for (WebElement values : listofitems) {
			System.out.println("All lis of Drop down--" + values.getText());
		}

		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("nextnestedfrme2");
		
		//nested frame2
		driver.switchTo().frame("frm2"); 
		driver.findElement(By.id("lastName")).sendKeys("Ramcharan in nested frame2");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("nextnestedframe3");
		
		//nestedframe3
		driver.switchTo().frame("frm3");
		//back to frame3
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("reverse of text after nested frame3");
		Thread.sleep(3000);
		// back to default page.
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text of last frame");
		Thread.sleep(3000);

		driver.quit();
	}

}
