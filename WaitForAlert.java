package org.qeagle.train;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/alertappear.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='Click to get Alert']")).click();
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	System.out.println("Alert is Present");
}
}
