package com.myProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_order {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8", Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys("Ama3@", Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus pro9 128 ram 256gb", Keys.ENTER);
		driver.findElement(By.xpath("//a/span[contains(.,'OnePlus 9 Pro 5G (Pine Green, 8GB RAM, 128GB')]")).click();

		String parentwindow = driver.getWindowHandle();
		Set<String> setofwindows = driver.getWindowHandles();
		for (String window : setofwindows) {
			if (!window.equals(parentwindow)) {
				driver.switchTo().window(window);
			}
		}
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//span[@class='a-button-inner']")).click();
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
		driver.findElement(By.xpath("//a[text()='Add a credit or debit card']")).click();
//		String orderwindow= driver.getWindowHandle();
//		Set<String> storinghandles = driver.getWindowHandles();
//		for (String paymenthandle : storinghandles) {
//			if(!paymenthandle.equals(orderwindow)) {
//				driver.switchTo().window(paymenthandle);
//			}
//		}
		driver.switchTo().frame("ApxSecureIframe");
		driver.findElement(By.name("addCreditCardNumber")).sendKeys("1234 3456 2456 4564", Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Cancel']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
