package com.Springboot.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignURL {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://github.com/mozilla/geckodriver/releases");
			//driver.navigate().to("");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
