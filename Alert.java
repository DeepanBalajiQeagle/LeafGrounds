package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	driver.switchTo().alert().dismiss();
	String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	driver.switchTo().alert().sendKeys("Hi this is Done");
	driver.switchTo().alert().accept();
	String text2 = driver.findElement(By.xpath("//p[@id='result1']")).getText();
	System.out.println(text2);
}
}
