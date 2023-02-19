package Day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupWindow {

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
			
		
			// Creating an List to contain names of product which we have selected
			List<String> previous = new ArrayList<>();
			
			
			//3. Add To Compare for Sony Xperia & Iphone
			d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a"));
			previous.add(d.getText());
			
			//add to compare
			d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
			d.click();
			
			d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a"));
			previous.add(d.getText());
			
			//add to compare
			d = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"));
			d.click();
			
			System.out.println(previous);
			
			
			
			//4. Click on COMPARE button
//			d = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div[1]/div[2]/div/button"));
//			d.click();
			// Above button is not working because it's a new window pop up so either we have to navigate
			// or we have to use get() method
 			driver.navigate().to("http://live.techpanda.org/index.php/catalog/product_compare/index/items/1,2/uenc/aHR0cDovL2xpdmUudGVjaHBhbmRhLm9yZy9pbmRleC5waHAvbW9iaWxlLmh0bWw,/','compare','top:0,left:0,width=820,height=600,resizable=yes,scrollbars=yes");
			
 			
 			// Creating an List to contain names of product After window popup
 			List<String> after = new ArrayList<>();
 			d = driver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[1]/h2/a"));
			after.add(d.getText());
			
			d = driver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[2]/h2/a"));
			after.add(d.getText());
			
			
			System.out.println(after);
			
			//5. Verifying previous and after
			if(previous.equals(after))
				System.out.println("Yes, all products are there and same as we selected.");
			
			//6. Closing the popup window
			driver.navigate().back();
			driver.close();
			
		

	}

}
