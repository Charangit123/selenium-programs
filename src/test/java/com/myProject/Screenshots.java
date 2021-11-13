package com.myProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.dockerjava.api.model.Driver;
import com.google.common.primitives.Bytes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.india.gov.in/");

		// File
		TakesScreenshot takesss = (TakesScreenshot) driver;
		File sourceFile = takesss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/IMG1.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot printed succesfully");

		// Bytes
//		byte[] bytearry= driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/IMG2.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(bytearry);
//		System.out.println("Screenshot printed succesfully");
//		driver.close();

		// Base64 string format ss
//		String base64 = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] bytearry = Base64.getDecoder().decode(base64);
//		File destFile = new File("./Screenshots/IMG3.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(bytearry);
//		System.out.println("Screenshot printed succesfully");
		driver.close();

	}

}
