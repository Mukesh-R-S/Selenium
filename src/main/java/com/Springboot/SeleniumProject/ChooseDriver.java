package com.Springboot.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseDriver {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver web=new ChromeDriver();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
