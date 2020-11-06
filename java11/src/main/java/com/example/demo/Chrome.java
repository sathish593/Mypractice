package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome {

	public static void main(String[] args) {
		
		String chromeBatPath = "C:\\Users\\uyyalask\\git\\ibpm-test-automation-framework\\ibpm-automation-framework\\Resources\\Tools\\Open_Chrome.bat";
		String psexePath = "C:\\Users\\uyyalask\\git\\ibpm-test-automation-framework\\ibpm-automation-framework\\Resources\\Tools\\PsExec.exe";
		System.out.println("###ENTERED OPEN BROWSER METHOD#####");
		
		
		// To check if using a system user
		 // Is using local machine with logged-in user.
			
			String	strCommandPath = chromeBatPath;
			

	
			String  strCommand = psexePath.split(".exe")[0] + " -u " + "ES\\esbpmqa01" + " -p " + "ADPadp11" + " "
					+ strCommandPath;
		
		System.out.println("Command to execute browser with different user: " + strCommand);
		try {
			Process p=	Runtime.getRuntime().exec(strCommand);
			InputStream in =p.getInputStream();
			for (int i = 0; i < in.available(); i++) {
	            System.out.println("" + in.read());
	         }
			Thread.sleep(30000);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("###BROWSER SHOULD BE RUNNING WITH SPECIFIED USER#####");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\uyyalask\\git\\ibpm-test-automation-framework\\ibpm-automation-framework\\Resources\\BrowserDrivers\\chromedriver.exe");
		    WebDriver  driver = new ChromeDriver();
		    WebDriverWait    wait = new WebDriverWait(driver, 15);
		    driver.manage().window().maximize();

		
	}
}
