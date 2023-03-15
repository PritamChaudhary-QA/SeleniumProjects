package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoc_TrTd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\'gb\']/div/div[2]/a")).click();
		d.findElement(By.id("identifierId")).sendKeys("vmus.pritam");
		d.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
		


	}

}
