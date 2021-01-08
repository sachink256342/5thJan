package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	WebDriver driver;
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/JBK/Selenium/Offline%20website/Offline%20website/index.html");
		driver.manage().window().maximize();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log in";
		Assert.assertEquals(actTitle, expTitle);
	}
		}

