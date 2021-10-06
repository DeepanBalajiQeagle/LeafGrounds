package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	Thread.sleep(2000);
	String winhan = driver.getWindowHandle();
	driver.switchTo().window(winhan);
	String text = driver.findElement(By.xpath("//a[contains(@class,'d-block font-weight-bold')]//i")).getText();
	System.out.println(text);
}
}
