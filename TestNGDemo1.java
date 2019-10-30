package tesNG;

import org.testng.annotations.Test;

public class TestNGDemo1 
{
  @Test(priority=2)
  public void log() {
	  System.out.println("Login for code");
  }
  
  @Test(priority=1)
  public void Registration() {
	  System.out.println("Code  for Regist");
  }
  
  @Test
  public void Logout() {
	  System.out.println("Code  for Logout");
  }
  
  
  
  @Test(enabled=false)  //for blocking test case execution
  public void forgetpassword() {
	  System.out.println("Code  for forgetpassword");
  }
  
  
}
