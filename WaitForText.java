package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForText {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/TextChange.html");
	driver.manage().window().maximize();
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']")));
	
	WebElement find = driver.findElement(By.xpath("//button[text()='Click ME!']"));
	find.click();
	 driver.switchTo().alert().accept();
}
}
