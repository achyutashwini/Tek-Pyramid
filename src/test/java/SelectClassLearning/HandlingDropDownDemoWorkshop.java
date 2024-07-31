package SelectClassLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownDemoWorkshop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/cell-phones");
		WebElement dropdownElement =driver.findElement(By.id("products-orderby"));
		
		//We can handle dropdown with the help of Select class
		// We need to pass dropdownElement variable
		
		Select select = new Select(dropdownElement);
		
		//selecting the option with index
		//select.selectByIndex(3);
		//Thread.sleep(5000);
		
		//selecting the option with visible text
		//select.selectByVisibleText("Price: High to Low");
		//Thread.sleep(5000);
		
		//selecting the option with value
		select.selectByValue("https://demowebshop.tricentis.com/cell-phones?orderby=10");
		Thread.sleep(5000);
	}
}
		



