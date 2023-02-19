package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VarifyItemInMobileListPage {

	public static void main(String[] args) {

		//Launching Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\modin\\Desktop\\Selenium Setup\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1 Go To URL
		driver.get("http://live.techpanda.org/");
		
		
		//2. Verifying title
		System.out.println(driver.getTitle());
		
		
		//3. Click on Mobile Menu
		WebElement d = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
		d.click();
		
		
		//4. Verifying title
		System.out.println(driver.getTitle());
		
		
		//5. Sort by dropdown
		
		//After Selecting Name
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/div[1]/div/select"));
		Select sl = new Select(ele);
		sl.selectByVisibleText("Name");
		
		
		List<WebElement> after_select_name = driver.findElements(By.className("product-name"));
		List<String> values_after_select_name = new ArrayList<>();
		
		for(WebElement a : after_select_name) {
			values_after_select_name.add(a.getText());
		}
		
		
		
		//previous refers to the list of products without sorting
		List<String> previous = new ArrayList<>(values_after_select_name);
		
		//After Sorting the values
		Collections.sort(values_after_select_name);
		
		
		//6. verifying are the product names sorted or not
		if(previous.equals(values_after_select_name))
			System.out.println("All 3 Products are sorted by name.");
		
		
		driver.close();
		
		
	}

}
