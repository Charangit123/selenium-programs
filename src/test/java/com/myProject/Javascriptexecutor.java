package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.india.gov.in/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//WebElement element= (WebElement)
	//ELEMENTFINDING	
//		jsExecutor.executeScript("return document.getElementById('email').value='ID';");
		//element.sendKeys("ID");
						
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.getElementsByName('email')[0].value='Name';");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.getElementsByClassName('inputtext')[0].value='Classname';");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.getElementsByTagName('input')[2].value='tagname';");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.querySelector('#email').value='CSSselector';");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='Xpath';");
//			Thread.sleep(3000);
//	
		//CLICK
//			jsExecutor.executeScript("return document.getElementById('login').click();");
	
		//BORDER COLOR AND BACKGROUND COLOR AND FOREGROUND COLOR
//			jsExecutor.executeScript("return document.getElementById('email').style.border='20px blue dotted';");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.getElementById('email').style.background='yellow'");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("return document.getElementById('email').setAttribute('style','border:10px blue solid;  background:red;  color:white');");
			
		//SCROLLTO, SCROLLBY ,SCROLLINTOVIEW
//			jsExecutor.executeScript("window.scrollBy(0,300);");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("window.scrollBy(0,300);");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("window.scrollTo(0,500);");
//			Thread.sleep(3000);
//			jsExecutor.executeScript("document.getElementById('fotter-bottom').scrollIntoView();");
//			
			
//		javascript using Selenium
WebElement element= driver.findElement(By.id("email"));
element.sendKeys("Text");
WebElement password= driver.findElement(By.id("pass"));
password.sendKeys("hsjsjs");
jsExecutor.executeScript("arguments[0].setAttribute('style','border:10px blue solid;  background:red;  color:white')",element,"arguments[0].setAttribute('style','border:10px blue solid;  background:red;  color:white')",password);
//jsExecutor.executeScript("arguments[0].setAttribute('style','border:10px blue solid;  background:red;  color:white')", element);
//	jsExecutor.executeScript("arguments[0].style.background='yellow'", element );
	}

}
