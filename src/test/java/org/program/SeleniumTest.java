package org.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws IOException {

		// WebDriver driver = null;

		FileInputStream input = new FileInputStream("config.properties");
		Properties property = new Properties();
		property.load(input);
		String browser = property.getProperty("browser");
		String driverlocation = property.getProperty("driverlocation");

		System.setProperty("webdriver.chrome.driver", driverlocation);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
