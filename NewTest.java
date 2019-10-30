package tesNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest 
{
  @Test(invocationCount=5)
  public void login()
  {
	  System.out.println("Code for login");
  }
  
  @Test(groups= {"Sanity","Regression"})
  public void launch()
  {
	  System.out.println("Code for launch");
  }
  
  @Test(groups= {"Sanity"})
  public void registration()
  {
	  System.out.println("Code for registration");
  }
  
  @Test(groups= {"Regression"})
  @Parameters({"Location","DCNO"})
  public void addCart(String Location, String DCNO)
  {
	  System.out.println("Code for addCart");
	  System.out.println(Location);
	  System.out.println(DCNO);
  }
  
  
  @Test(groups= {"Smoke"})
  public void removecart()
  {
	  System.out.println("Code for removecart");
  }
  
  @Test(invocationCount=5, enabled=false)
  public void logout()
  {
	  System.out.println("Code for login");
	  Assert.assertEquals(expected, actual);
  }
}
