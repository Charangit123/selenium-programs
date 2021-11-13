package com.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxButtonLinkRadiobutton {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement checkcheckbox = driver.findElement(By.id("hindichbx"));
		checkcheckbox.click();
		Thread.sleep(3000);
		if (checkcheckbox.isDisplayed())
			checkcheckbox.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("navigateHome")).click();
		Thread.sleep(3000);
		driver.close();

		
	
	} 

}
