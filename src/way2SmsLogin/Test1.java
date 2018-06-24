package way2SmsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	ChromeDriver driver;
  @Test(priority=0)
  public void launch() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.way2sms.com/content/index.html?");
	  
  }
  
  @Test(priority=1)
  public void validateTitle()
  {
	  String t=driver.getTitle();
	  if(t.contains("Free SMS"))
	  {
		  Assert.assertTrue(true, "Title test was passed");
	  }
	  else
	  {
		  Assert.assertTrue(false, "Title test was failed");
	  }
  }
  
  @Test(dependsOnMethods=("validateTitle"))
  public void login() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("***********");
	  driver.findElement(By.name("password")).sendKeys("***********");
	  driver.findElement(By.id("loginBTN")).click();
	  Thread.sleep(5000);
	  
  }
  
  @Test(priority=3)
  public void closeBrowser() throws Exception
  {
	  driver.close();
	  Thread.sleep(5000);
  }
  
}
