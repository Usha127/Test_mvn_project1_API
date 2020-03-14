package Test_FireFox;

import java.util.concurrent.TimeUnit;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_FireFox_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		try {
			System.out.println("Current project path : "+ System.getProperty("user.id"));
			System.setProperty("webdriver.gecko.driver", "D:\\WorkingFolder\\Test_mvn_project1\\Driver_Files\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
					
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("Wait for 10 seconds...");
			System.out.println("Google landing page...");
			//driver.findElement(By.name("q")).sendKeys("Devops");
			driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Devops");
			//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			//driver.findElement(By.name("btnK")).click();
			driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
			//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			System.out.println("Closing browser");
			driver.close();
			
		} catch (Exception e) {
			System.out.println("Exception: "+ e.getMessage());
		}

	}

}
