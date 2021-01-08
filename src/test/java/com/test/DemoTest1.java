package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	WebDriver driver;
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/JBK/Selenium/Offline%20website/Offline%20website/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		Assert.assertEquals(actTitle, expTitle);
	}
		}

