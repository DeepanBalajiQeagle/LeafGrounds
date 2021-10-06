package org.qeagle.sele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		// To Convert The Row of the WebTable
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int size = row1.size();
		System.out.println("The number of Row in the given WebTable:" + size);
		// To Convert The column of the WebTable
		List<WebElement> col1 = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		int size2 = col1.size();
		System.out.println("The number of Column in the given WebTable" + size2);
		// The Progress value
		WebElement find1 = driver.findElement(By.xpath("//table[@id='table_id']//tr[3]/td[2]"));
		String text = find1.getText();
		System.out.println("The Progress value of the Learn to interact with elements:" + text);
		//
		List<WebElement> find2 = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		List<Integer> web = new ArrayList<Integer>();
		for (int i = 0; i < find2.size(); i++) {
			String text2 = find2.get(i).getText();
			// System.out.println(text2);
			String replaceAll = text2.replaceAll("%", "");
			// System.err.println(replaceAll);
			int wb = Integer.parseInt(replaceAll);
			web.add(wb);
			}
		Integer min = Collections.min(web);
		System.out.println("The minimmum value of the webTable :"+min);

	}

}
/*int minValue=30;
driver.findElement(By.xpath("//td[contains(text(),' "+minValue+"')]"));

driver.findElement(By.xpath("//td[contains(text(),'30')]"));
*/