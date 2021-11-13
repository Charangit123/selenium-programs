package com.myProject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		highlight(driver, driver.findElement(By.id("email")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("pass")));
		//Thread.sleep(4000);
		highlight(driver, driver.findElement(By.className("inputtext")));
		//Thread.sleep(4000);
		highlight(driver, driver.findElement(By.linkText("Forgotten password?")));
		//Thread.sleep(4000);
		highlight(driver, driver.findElement(By.partialLinkText("Create a")));
		//Thread.sleep(4000);
		highlight(driver, driver.findElement(By.tagName("h2")));
		//Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//li[.='English (UK)']")));
		//Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("button[type='submit']")));
	//driver.close();
	}
public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);

}
}
