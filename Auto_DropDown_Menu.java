package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_DropDown_Menu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.trivago.in/");
		d.manage().window().maximize();
		//d.findElement(By.xpath("")).click();
		d.findElement(By.name("query")).click();
		d.findElement(By.name("query")).sendKeys("na");
		for(int i=1;i<=3;i++) 
		{
			d.findElement(By.name("query")).sendKeys(Keys.DOWN); 
			Thread.sleep(1000);
		}
		
		d.findElement(By.name("query")).sendKeys(Keys.ENTER);
		

	}

}
