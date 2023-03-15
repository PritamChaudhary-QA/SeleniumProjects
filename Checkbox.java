package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.gyrocode.com/projects/jquery-datatables-checkboxes/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1300)");
		List<WebElement> tr=d.findElements(By.xpath("//*[@id=\'example\']/tbody/tr"));
		int row=tr.size();
		System.out.println("Total Row no. is: "+row);
		List<WebElement> td=d.findElements(By.xpath("//*[@id=\'example\']/tbody/tr[1]/td"));
		int col=td.size();
		System.out.println("Total Column no. is: "+col);
		for (int i=1;i<row;i++) 
		{
			if(i%2==1)//try if(i%2==0)
				//if(i%2!=0)
			{
				d.findElement(By.xpath("//*[@id=\'example\']/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}
			
		

	}

}
