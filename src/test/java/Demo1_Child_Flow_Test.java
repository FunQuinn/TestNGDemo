import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1_Child_Flow_Test extends Demo1_Flow_Test {
  @Test
  public void child_testA() {
    System.out.println("测试@child_Test");
  }

  @BeforeSuite
  public void child_beforeSuite() {
    System.out.println("@child_beforeSuite");
  }

  @BeforeClass
  public void child_beforeClass() {
    System.out.println("@child_beforeClass");
  }

  @BeforeMethod
  public void child_beforeMethod() {
    System.out.println("@child_beforeMethod");
  }

  @AfterMethod

  public void child_afterMethod() {
    System.out.println("@child_afterMethod");
  }

  @AfterTest
  public void child_afterTest() {
    System.out.println("@child_afterTest");
  }

  @AfterSuite
  public void child_afterSuite() {
    System.out.println("@child_afterSuite");
  }

  @AfterClass

  public void child_afterClass() {
    System.out.println("@child_afterClass");
  }


}
