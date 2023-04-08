package handle_web_element;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC06_Allert extends DriverSetup{
	
	@Test
	public void testAllert() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert alert =  driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert alert1 =  driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert3 =  driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert3.sendKeys("hello");
		alert3.accept();
		Thread.sleep(4000);
	}

}
