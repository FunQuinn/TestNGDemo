import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Paraller_MixTest {
  @Test(threadPoolSize = 3,invocationCount = 5)
  public void addTest() throws InterruptedException{
    SoftAssert assertion =new SoftAssert();
    int add_result = Calculator.sy_add(15,5);
    System.out.println("add_result: " + add_result);
    assertion.assertEquals(add_result,25);

  }

  @Test(threadPoolSize = 3,invocationCount = 5)
  public void subtractTest() throws InterruptedException{
    SoftAssert assertion =new SoftAssert();
    int sub_result = Calculator.sy_subtract(15,5);
    System.out.println("sub_result: " + sub_result);
    assertion.assertEquals(sub_result,10);
    assertion.assertAll();
  }
}
