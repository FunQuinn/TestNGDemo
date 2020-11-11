import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cal_TestNG_Base {
  @Test
  public void addTest() throws InterruptedException{
    SoftAssert assertion =new SoftAssert();
    int add_result01 = Calculator.add(5,5);
    System.out.println(add_result01);
    assertion.assertEquals(add_result01,10);



    int add_result02 = Calculator.add(5,10);
    System.out.println(add_result02);
    assertion.assertEquals(add_result02,10);

    int add_result03 = Calculator.add(5,15);
    System.out.println(add_result03);
    assertion.assertEquals(add_result03,20 );
    assertion.assertAll();
  }

  @Test
  public void subtractTest() throws InterruptedException {
    int result = Calculator.subtract(4,2);
    System.out.println(result);
    assertEquals(result,2);

  }

}
