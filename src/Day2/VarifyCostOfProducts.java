package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyCostOfProducts {

	public static void main(String[] args) {
		
		
			//Launching Chrome Driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\modin\\Desktop\\Selenium Setup\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
				
			//1 Go To URL
			driver.get("http://live.techpanda.org/");
		
			//2. Click on Mobile Menu
			WebElement d = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
			d.click();
			
			//3. Lets store price of Sony Xperia
			String price_sony_xperia = driver.findElement(By.id("product-price-1")).getText();
			
			//System.out.println(price_sony_xperia);
			
			//4. Click on Sony Xperia mobile
			d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a"));
			d.click();
			
			//5. Read price of Sony Xperia
			String price_sony_xperia2 = driver.findElement(By.className("price")).getText();
			//System.out.println(price_sony_xperia2);
			
			//6. Verify prices 
			if( price_sony_xperia.equals(price_sony_xperia2) )
				System.out.println("Price of Sony Xperia Mobile is same and equals to : " + price_sony_xperia);
		

			driver.close();
	}

}
