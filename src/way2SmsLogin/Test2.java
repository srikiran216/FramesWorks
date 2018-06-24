package way2SmsLogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 
{
	
  @Test
  public void launchGoogle() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in");
	  Thread.sleep(5000);
	  driver.close();
  }
}
