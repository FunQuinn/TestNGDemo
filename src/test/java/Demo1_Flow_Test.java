import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1_Flow_Test {
  @Test
  public void testA() {
    System.out.println("测试@Test");
  }

  @BeforeTest
  public void beforeTest(){
    System.out.println("@beforeTest");
  }

  @BeforeSuite
  public void beforeSuite() {
    System.out.println("@beforeSuite");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("@beforeClass");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("beforeMethod");
  }

  @AfterMethod

  public void afterMethod() {
    System.out.println("@afterMethod");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("@afterTest");
  }

  @AfterSuite
  public void afterSuite() {
    System.out.println("@afterSuite");
  }

  @AfterClass

  public void afterClass() {
    System.out.println("@afterClass");
  }


}
