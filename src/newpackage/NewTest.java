package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	public	String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\akash\\eclipse\\java-2019-06\\eclipse\\chromedriver.exe";
	public WebDriver driver ; 
   
	
  @Test
  public void verifyHomepageTitle() throws InterruptedException {
	  
  System.out.println("launching Chrome browser on chrome"); 
  
  System.setProperty("webdriver.chrome.driver",driverPath);
  driver= new ChromeDriver();
  driver.get(baseUrl);
  String expectedResult = "Welcome: Mercury Tours";
  String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedResult);
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//a[text()='Agile Project']")).click();;
  Thread.sleep(7000);
 String Text= driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText(); 
 
 Assert.assertTrue(Text.contains(Text), "Text Found");
 
//driver.close();

  }
}
