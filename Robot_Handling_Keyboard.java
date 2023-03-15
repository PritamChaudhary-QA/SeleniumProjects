package com.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Handling_Keyboard {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://127.0.0.1/orangehrm-2.6/login.php");
		d.manage().window().maximize();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		d.findElement(By.name("txtUserName")).sendKeys("admin");
		r.keyPress(KeyEvent.VK_TAB);
		d.findElement(By.name("txtPassword")).sendKeys("admin");
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
