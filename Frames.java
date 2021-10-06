package org.qeagle.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.manage().window().maximize();
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println("You had done it Correct:"+text);
	
}
}
