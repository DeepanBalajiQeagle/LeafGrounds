package org.qeagle.train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
		driver.findElement(By.xpath("//a[text()='Download PDF']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Download Text']")).click();
	}
}