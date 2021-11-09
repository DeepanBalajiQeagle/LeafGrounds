package org.qeagle.train;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChange {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/TextChange.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement find = driver.findElement(By.xpath("//button[text()='Click ME!']"));
	Thread.sleep(2000);

	find.click();
	driver.switchTo().alert().accept();
}
}
