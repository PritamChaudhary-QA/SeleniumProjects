package com.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\SelenuimAssignment_mousehover_Dropdown\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		d.findElement(By.xpath("//*[@id=\'Textbox\']/button")).click();
		Alert alt=d.switchTo().alert();
		alt.dismiss();
		//alt.accept();

	}

}
