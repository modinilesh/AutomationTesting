package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launching Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\modin\\Desktop\\Selenium Setup\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
								
						
		//1 Go To URL
		driver.get("http://live.techpanda.org/");
						
		//2. Click on My account link
		WebElement d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[1]/a"));
		d.click();

		

		//3. Loging to existing account
		d = driver.findElement(By.id("email"));
		d.sendKeys("s6267179887@gmail.com");
		
		d = driver.findElement(By.id("pass"));
		d.sendKeys("Sumit@123");
		
		d = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		d.click();
		
		
		//4. Click on Reorder Link
		d = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[2]"));
		d.click();
		
		//Store grand total value
		d.findElement(By.className("cart-price"));
		String gt_before = d.getText();
		
		//Change quantity
		d = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
		d.click();
		d.clear();
		d.sendKeys("10");
		
		//Click on Update
		d = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button"));
		d.click();
		
//		//Store grand total value
//		d.findElement(By.className("product-cart-total"));
//		String gt_after = d.getText();
//		
//		//5. Check Grand Total is changed
//		if(! gt_before.equals(gt_after))
//			System.out.println("Grand total is changed and new value is : "+ gt_after);
//		
		
		//select on fixed radio button
		d = driver.findElement(By.id("s_method_flatrate_flatrate"));
		d.click();
		
		//6. Update the cart
		d = driver.findElement(By.xpath("//*[@id=\"co-shipping-method-form\"]/div/button"));
		d.click();
		
		

		
		
	}

}
