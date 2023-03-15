package com.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Popup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("txtUserName"));
		username.sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		WebElement Admin=driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
		WebElement Skill=driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[4]/a/span"));
		WebElement skill=driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[4]/ul/li[1]/a/span"));
		Actions a=new Actions(driver);
		a.moveToElement(Admin).build().perform();
		a.moveToElement(Skill).build().perform();
		skill.click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
		//to handle alert pop up need to call Alert interface
				Alert alt=driver.switchTo().alert();
				//dismiss to click on cancel button
				Thread.sleep(1000);
				//alt.dismiss();
				//to click on ok button accept method is use
				alt.accept();
				//to fetch text from alert pop up window
				//String text=alt.getText();
				//System.out.println(text);
				//to pass/send input in alert pop up input/text field
				//alt.sendKeys("dfdf");
				//admin----job-----job title---delete
				//admin----skills----skills ---delete

		
	}

}
