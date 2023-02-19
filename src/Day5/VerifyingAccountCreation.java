package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingAccountCreation {

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
		
		//3. Click on create new account and fill details
		d = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a"));
		d.click();
		
		//firstName
		d = driver.findElement(By.id("firstname"));
		d.sendKeys("Sumit");
		
		//middleName
		d = driver.findElement(By.id("middlename"));
		d.sendKeys("Kumar");
		
		//lastName
		d = driver.findElement(By.id("lastname"));
		d.sendKeys("Modi");
		
		//email
		d = driver.findElement(By.id("email_address"));
		d.sendKeys("s6267179887@gmail.com");
		
		
		//password
		d = driver.findElement(By.id("password"));
		d.sendKeys("Sumit@123");
		
		//password confirmation
		d = driver.findElement(By.id("confirmation"));
		d.sendKeys("Sumit@123");
		
		//4. Click on register
		d = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
		d.click();
		
		//Verify registration is done
		String msg1 = "Thank you for registering with Main Website Store." ;
		
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span"));
		String msg2 = d.getText();
		
		if(msg1.equals(msg2)) System.out.println("Registration completion is succesfull with the message : "+msg1);
		
		
		//5. Go to TV menu
		d = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a"));
		d.click();
		
		
		//6. Add product to wishlist
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a"));
		d.click();
		
		//7. Click on share wishlist
		d = driver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]"));
		d.click();
		
		//8. fill email, messege and share 
		d = driver.findElement(By.id("email_address"));
		d.sendKeys("nileshmodi081@gmail.com");
		
		d = driver.findElement(By.id("message"));
		d.sendKeys("Hey Bro Whats up...");
		
		//share button click
		d = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button"));
		d.click();
		
		
		//9. Verify registration is done
		String share_msg1 = "Your Wishlist has been shared." ;
				
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
		String share_msg2 = d.getText();
				
		if(share_msg1.equals(share_msg2)) System.out.println("Verification is done with the messege : "+ share_msg1);
		
		
		driver.close();
	}

}
