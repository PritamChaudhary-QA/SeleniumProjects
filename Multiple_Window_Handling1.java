package com.web;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Handling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://omayo.blogspot.com/2013/05/page-one.html");
		d.manage().window().maximize();
		d.findElement(By.linkText("Open a popup window")).click();
		Set<String> windows=d.getWindowHandles();
		System.out.println("Windows Ids are :"+windows);
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		System.out.println("Parent window is :"+parentwindow);
		System.out.println("Child window is :"+childwindow);
		d.findElement(By.xpath("//*[@id=\'HTML32\']/div[1]/input[1]")).click();
		d.switchTo().window(childwindow);
		d.findElement(By.id("para1")).getText();
		System.out.println("Childwindow text :"+childwindow);
		d.switchTo().window(parentwindow);
		d.findElement(By.id("ta1")).sendKeys("Excellent");
		 
	}

}
