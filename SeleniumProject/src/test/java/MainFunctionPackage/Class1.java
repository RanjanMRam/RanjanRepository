package MainFunctionPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Class1  {
  @Test
  public void Test1() {
	  System.out.println("@Test1");
  }
  @BeforeMethod
  public void beforeMethod1() {
	  System.out.println("@beforeMethod1");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("@afterMethod1");
  }

  @BeforeClass
  public void beforeClass1() {
	  System.out.println("@beforeClass1");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("@afterClass1");
  }

  @BeforeTest
  public void beforeTest1() {
	  System.out.println("@beforeTest1");
  }

  @AfterTest
  public void afterTest1() {
	  System.out.println("@afterTest1");
  }

  @BeforeSuite
  public void beforeSuite1() {
	  System.out.println("@beforeSuite1");
  }

  @AfterSuite
  public void afterSuite1() {
	  System.out.println("@afterSuite1");
  }

}
