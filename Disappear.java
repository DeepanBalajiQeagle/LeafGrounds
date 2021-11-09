package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/disapper.html");
	Thread.sleep(3000);

	WebElement find = driver.findElement(By.id("btn"));
	boolean cs = find.isDisplayed();
	if (cs==false) {
		System.out.println("Its is Not Available");
		WebElement find1 = driver.findElement(By.xpath("//div[@id='show']//strong"));
		String text = find1.getText();
		String text1="I know you can do it! Button is disappeared!";
		if (text.equals(text1)) {
			System.out.println("Both are equals");
		}else {
			System.out.println("Both are not equals");
		}
	}else {
		System.out.println("Its is Available");
	}
}
}
