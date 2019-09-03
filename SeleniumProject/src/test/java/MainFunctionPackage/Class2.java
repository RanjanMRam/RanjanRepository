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

public class Class2 {
  @Test
  public void Test2() {
	  System.out.println("@Test2");
  }
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("@beforeMethod2");
  }

  @AfterMethod
  public void afterMethod2() {
	  System.out.println("@afterMethod2");
  }

  @BeforeClass
  public void beforeClass2() {
	  System.out.println("@beforeClass2");
  }

  @AfterClass
  public void afterClass2() {
	  System.out.println("@afterClass2");
  }

  @BeforeTest
  public void beforeTest2() {
	  System.out.println("@beforeTest2");
  }

  @AfterTest
  public void afterTest2() {
	  System.out.println("@afterTest2");
  }

  @BeforeSuite
  public void beforeSuite2() {
	  System.out.println("@beforeSuite2");
  }

  @AfterSuite
  public void afterSuite2() {
	  System.out.println("@afterSuite2");
  }

}
