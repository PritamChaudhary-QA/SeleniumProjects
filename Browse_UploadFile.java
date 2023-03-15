package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse_UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://127.0.0.1/orangehrm-2.6/login.php");
		d.manage().window().maximize();
		d.findElement(By.name("txtUserName")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		d.switchTo().frame("rightMenu");
		d.findElement(By.xpath("//*[@id=\'standardView\']/div[3]/div[1]/input[1]")).click();
		d.findElement(By.xpath("//*[@id=\'photofile\']")).sendKeys("C:\\Users\\prita\\OneDrive\\Desktop");
		

	}

}
