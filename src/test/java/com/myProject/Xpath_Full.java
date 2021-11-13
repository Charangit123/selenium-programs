package com.myProject;

import java.util.*;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Full {
private static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/");
		chapter2();
		
	}
		public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);

}
	//Absolute Xpath
		public static void chapter2() {
	//	highlight(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/a")));
	
		//Relative Xpath
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//driver.get("https://www.w3schools.com/");
		//List<WebElement> relativeXpath = (driver.findElements(By.xpath("//button[@class='btn']")));
		//for (WebElement hlight : relativeXpath) {
		//highlight(hlight);

		
		//
//		highlight(driver.findElement(By.xpath("//label[text()='Last Name']/preceding-sibling::input")));
		System.out.println(driver.findElement(By.xpath("//table[@id='contactList']/descendant::*")).getSize());
//		//
//		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>3]")));
//		highlight(driver.findElement(By.xpath("//td[text()='Roland Mendel']/parent::tr")));
		//
		List<WebElement> hlight = driver.findElements(By.xpath("//td[text()=5000]"));
		for (WebElement web : hlight) {
			highlight(web);
		}
		//System.out.println(driver.findElement(By.xpath("//body//a[@class!='facebook']")).getSize());
		//button[@type='submit']
		}	//driver.close();
		}
////*[@id="contactList"]/tbody/tr[6]/td[1]/input



	


