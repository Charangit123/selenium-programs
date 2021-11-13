package naveenSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements_All_Links_etc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
List<WebElement> linkslist	=driver.findElements(By.tagName("a"));
	System.out.println(linkslist.size());
	for(WebElement e: linkslist ) {
	System.out.println(e+"--"+e.getText()+"--"+e.getAttribute("href"));
	}
	driver.quit();
	
	}

}
