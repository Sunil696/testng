package tesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import demo.MyDrivers;

public class DataProvider 
{
	
	WebDriver driver;
  @Test(dataProvider="dp")
  public void login(String n, String s) 
  {
	driver=MyDrivers.getDriver("CHROME")  ;
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys(n);
	driver.findElement(By.name("password")).sendKeys(s);
	driver.findElement(By.name("login")).click();
	String A_title=driver.getTitle();
	
	String E_title="";
	Assert.assertEquals(A_title, E_title);
	
	
	SoftAssert sft= new SoftAssert();
	sft.assertEquals(A_title, E_title);
	
	System.out.println("login Success");
	
	
		
  }
  
  @DataProvider
	Public Object[][] dp
	{
	  return new Object[][]
			  {
		  
		  new Object[] {"demo", "demo"},
		  new Object[] {"mercury","mercury"}"
		  
			  }
		
	}
  
  
}
