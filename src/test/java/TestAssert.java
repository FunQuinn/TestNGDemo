import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssert {
  @Test
  public void testSoftAssert() throws InterruptedException {
    System.out.println("这是一个软断言示例-------->>>>");
    SoftAssert test = new SoftAssert();
    int result = Calculator.add(3, 6);
    SoftAssert sa = new SoftAssert();
    sa.assertEquals(result, 8);
    System.out.println("这是一个验证输出语句");
    sa.assertEquals(result, 9);
  }
}




