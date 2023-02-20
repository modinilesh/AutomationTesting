package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyUserIsAbleToPurchaseProduct {

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
		d.sendKeys("nileshmodi081@gmail.com");
		
		d = driver.findElement(By.id("pass"));
		d.sendKeys("Sumit@123");
		
		d = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		d.click();
		
		
		//4. Click on my wishlist
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a"));
		d.click();
		
		
		//5. click on Add to Cart 
		d = driver.findElement(By.xpath("//*[@id=\"item_61983\"]/td[5]/div/button"));
		d.click();
	
		
		//6. Click proceed to checkout
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button"));
		d.click();
		
		
//		//Click on ship to another address
//		d = driver.findElement(By.xpath("//*[@id=\"billing:use_for_shipping_no\"]"));
//		d.click();
//		
//		//Click to continue
//		d = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));
//		d.click();
//		
//		//Click on new address
//		d = driver.findElement(By.cssSelector("#shipping-address-select"));
//		Select s = new Select(d);
//		s.selectByVisibleText("New Address");
//		
		
		//7. Entering shipping information
		d = driver.findElement(By.id("billing:street1"));
		d.clear();
		d.sendKeys("Pandit Deendayal Upadhyay Nagar");
		
		d = driver.findElement(By.id("billing:city"));
		d.clear();
		d.sendKeys("Kota");
		
		d = driver.findElement(By.xpath("//*[@id=\"billing:region_id\"]"));
		Select sc_region = new Select(d);
		sc_region.selectByVisibleText("New York");
		
		d = driver.findElement(By.id("billing:postcode"));
		d.clear();
		d.sendKeys("542896");
		
		d = driver.findElement(By.xpath("//*[@id=\"billing:country_id\"]"));
		Select sc_country = new Select(d);
		sc_country.selectByVisibleText("United States");
		
		d = driver.findElement(By.id("billing:telephone"));
		d.clear();
		d.sendKeys("7410973925");
		
		
		//8. Click on continue
		d = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));
		d.click();
		
		
//		//9. Estimation verification msg
//		d = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label/span"));
//		System.out.println("Flat rate shipping is generated with msg : "+ d.getText());
//		
		
		//10. Click on continue
		d = driver.findElement(By.className("button"));
		d.click();
		
		
		//11. Check Money Order
		d = driver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]"));
		d.click();
		
		
		//12. Click on continue
		d = driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button"));
		d.click();
		
		//13. Grand total price afteradding shipping cost verification msg
		d = driver.findElement(By.xpath("//*[@id=\"checkout-review-table\"]/tfoot/tr[2]/td[2]/span"));
		String inp_from_page = d.getText();
		String expected = "$5.00" ;
		
		if(inp_from_page.equals(expected))
			System.out.println("Shipping charges"+expected+" is added");
		
		//14. click on Place order button
		d = driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button"));
		d.click();
		
		// Placed order verification msg
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]"));
		System.out.println("Order is Successfully Placed with message : "+ d.getText());
		
		
		
		
		driver.close();
		

	}

}
