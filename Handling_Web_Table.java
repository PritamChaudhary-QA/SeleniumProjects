package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Web_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://qavbox.github.io/demo/webtable/");
		d.manage().window().maximize();
		String text=d.findElement(By.xpath("//*[@id=\'table02\']/tbody/tr[1]/td[1]")).getText();
		System.out.println(text);
		List<WebElement> tr=d.findElements(By.xpath("//*[@id=\'table02\']/tbody/tr"));
		List<WebElement> td=d.findElements(By.xpath("//*[@id=\'table02\']/tbody/tr[1]/td"));
		int row=tr.size();
		int col=td.size();
		System.out.println("Row no. is: "+row+"\n& \nColumn no. is: "+col);
		for(int i=53;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				
				System.out.println(d.findElement(By.xpath("//*[@id=\"table02\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}	  
   }
}


