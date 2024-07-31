package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingFileUploadPopupInILovePdf {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		String filepath="C:\\Users\\achyu\\Downloads\\ACHYUT CV (1).pdf";
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filepath);
	}
}
