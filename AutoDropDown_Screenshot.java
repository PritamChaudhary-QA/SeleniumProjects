package com.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.tops-int.com/it-training-nagpur");
		d.manage().window().maximize();
		TakesScreenshot srcshot=((TakesScreenshot)d);
		File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("D:\\New folder\\Tops1.jpg");
		FileUtils.copyFile(srcfile, destfile);
	}

}
