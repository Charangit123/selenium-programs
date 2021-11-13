package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Confirm_Pomptbox {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//alert box
		// System.out.println(driver.findElement(By.id("output")).getText());
		//// Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//// Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());

		// confirm box
		// driver.navigate().refresh();
		driver.findElement(By.id("confirmBox")).click();
		//// Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		//// Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		//// Thread.sleep(3000);

//prompt box
		// driver.navigate().refresh();
		// System.out.println(driver.findElement(By.id("output")).getText());
//	//Thread.sleep(3000);
		driver.findElement(By.id("promptBox")).click();
		// Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("promptBox")).click();
		// Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Charanraj123");
		// Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		// Thread.sleep(3000);

		driver.findElement(By.id("promptBox")).click();
		// Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		/// Thread.sleep(3000);

		driver.quit();
	}

}
