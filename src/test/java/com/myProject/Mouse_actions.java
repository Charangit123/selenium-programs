package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveToOffsetAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_actions {

	private static WebDriver driver;
	public static void main(String[] args){

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
Actions action = new Actions(driver);
//right();
MouseHover();
	}
	
public static void chapt1() {
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();



Actions action = new Actions(driver);
//single click
action
.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
.click().perform();
driver.findElement(By.id("searchLocation_name")).sendKeys("Jharsguda");
//doubleclick
action.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
	}

	//rightclick or context click
public static void right() {

Actions action = new Actions(driver);
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
action.
contextClick(driver.findElement(By.xpath("//span[.='right click me']")))
.
contextClick(driver.findElement(By.xpath("//span[.='Paste']")))
.perform();
//driver.findElement(By.xpath("//span[.='Paste']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
}

//double click

public static void MouseHover(){
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Actions action = new Actions(driver);
	action.moveToElement(
	driver.findElement(By.xpath("//a[.='Insurance Project']"))).click().perform();
	
	
}
}




