package com.automation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {

	
	public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		// TODO Auto-generated method stub
		DesiredCapabilities dCaps = new DesiredCapabilities();
		ChromeOptions chOptions = new ChromeOptions();

		chOptions.merge(dCaps);
		
//		dCaps.setBrowserName("chrome");
//		dCaps.setPlatform(Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.7:4444"), chOptions);
		
		
		driver.get("https://staging-cmspao.wishtree.tech/login");
		
		driver.manage().window().maximize();
		
		
			
	}

}
