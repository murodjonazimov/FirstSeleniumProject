package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/murodjon/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.ebay.com/");

		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.cybertekschool.com/");

		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.amazon.com/");
	}
}
