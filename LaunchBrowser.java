package com.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver driver=new ChromeDriver();
				//launch url or open any web application--pass url
				driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
				//to maximize browser window
				driver.manage().window().maximize();
	}

}
