package com.myProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		String parentWindow= driver.getWindowHandle();
//		System.out.println("parent windowhandle --" +parentWindow +"--" +driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> listofwindows =driver.getWindowHandles();
//		for (String list : listofwindows) {
//			if(!list.equals(parentWindow)) {
//				driver.switchTo().window(list);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("ramcharan");
//				Thread.sleep(3000);
//				WebElement boxofsecondWindow = driver.findElement(By.id("firstName"));
//				String txtofsecondWindow = boxofsecondWindow.getAttribute("value");
//				System.out.println("Text in the second window--"+txtofsecondWindow);
//			}
//			System.out.println("list of window handles : " +list +"--"+driver.getTitle());
//		}
//		driver.switchTo().window(parentWindow);
//		driver.findElement(By.id("name")).sendKeys("Charanraj");
//		Thread.sleep(3000);
//		WebElement boxofparentWindow = driver.findElement(By.id("name"));
//		String txtofparentWindow = boxofparentWindow.getAttribute("value");
//		System.out.println("Text in theparent window--"+txtofparentWindow);
//	
//		driver.quit();
//		
	
		String parentWindow= driver.getWindowHandle();
		System.out.println("parent windowhandle --" +parentWindow +"--" +driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> listoftabs =driver.getWindowHandles();
		for (String list : listoftabs) {
			if(!list.equals(parentWindow)) {
				driver.switchTo().window(list);
				//driver.manage().window().maximize();
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
			}
			System.out.println("list of window handles : " +list +"--"+driver.getTitle());
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("Charanraj");
		Thread.sleep(3000);
		WebElement boxofparentWindow = driver.findElement(By.id("name"));
		String txtofparentWindow = boxofparentWindow.getAttribute("value");
		System.out.println("Text in theparent window--"+txtofparentWindow);
	
		driver.quit();
	
	}

}
