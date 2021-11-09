package org.qeagle.train;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/upload.html");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the File name to Enter with its format:");
	String tag = sc.next();
	WebElement find = driver.findElement(By.xpath("//input[@type='file']"));
	find.sendKeys("C:\\Users\\dell\\Downloads\\"+tag+"");
}
}
