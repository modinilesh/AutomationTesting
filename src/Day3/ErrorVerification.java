package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launching Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\modin\\Desktop\\Selenium Setup\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		//1 Go To URL
		driver.get("http://live.techpanda.org/");
	
		//2. Click on Mobile Menu
		WebElement d = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
		d.click();
		
		//3. Click on Add to cart for Sony Xperia mobile
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button"));
		d.click();
		
		//4. Change Quantity to 1000 and click on UPDATE
		d = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
		d.click();
		d.clear();
		d.sendKeys(1000+"");
		d = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span"));
		d.click();
		
		
		//5. verify Error Message
		d = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p"));
		System.out.println(d.getText());
		
		
		//6. Click on EMPTY CART
		d = driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span"));
		d.click();
		
		//Empty Message
		d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1"));
		System.out.println(d.getText());
		
		
		
		driver.close();
		

	}

}
