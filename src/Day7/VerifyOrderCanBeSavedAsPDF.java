package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyOrderCanBeSavedAsPDF {

	public static void main(String[] args) {
		
		
		//Launching Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\modin\\Desktop\\Selenium Setup\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
						
				
		//1 Go To URL
		driver.get("http://live.techpanda.org/");
				
		//2. Click on My account link
		WebElement d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[1]/a"));
		d.click();
		
		//3. Loging to exixting account
		d = driver.findElement(By.id("email"));
		d.sendKeys("s6267179887@gmail.com");
		
		d = driver.findElement(By.id("pass"));
		d.sendKeys("Sumit@123");
		
		d = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		d.click();
		
		
		//4. Click on my orders
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a"));
		d.click();
		
		
		//5. Click on view order
		d = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[1]"));
		d.click();
		
		
		//6. Printing order Status
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/h1"));
		System.out.println("Order Update : "+ d.getText());
		
		
		//7. Click on print order link
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]"));
		d.click();
		
		
//		//8. click on print button
//		d = driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]"));
//		d.click();
		
		
		//9. verify is PDF saved
		System.out.println("There is not update about PDF is Saved or not on page.");
		
		
		driver.quit();
		

	}

}
