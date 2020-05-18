package testcase;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class firstTest {

		@Test
		public void validateLayerPropertiesIsPresent(){				
				
			
				System.setProperty("webdriver.chrome.driver", "C:\\selenium-prerequisites\\executables\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//navigation
				driver.get("http://www.facer.io/creator");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElementByXPath("//*[@id=\"newDesign\"]/div[3]/center/div[1]/div[1]/img").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementByXPath("//*[@id=\"editor\"]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/a[1]").click();
				
				//test if element is present
				boolean present = !driver.findElementsByXPath("//*[@id=\"editor\"]/div[3]/div/div[1]/div/div[1]/div[2]/div").isEmpty();
				driver.close();
				Assert.assertEquals(present, true);
		}
}




