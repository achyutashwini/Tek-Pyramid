package SelectClassLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleAlertInSbiOnline {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/");
		driver.findElement(By.partialLinkText("Pay Premium")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		//alert.accept();
	}

}
