import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * 使用软断言进行优先级测试
*/
public class Cal_TestNG_Priority {
@BeforeMethod
public void clearFirst(){
  Calculator.clear();
  System.out.println("执行测试方法前操作清零动作");
}
  @Test(priority = 1)
  public void add_test() throws InterruptedException{
    SoftAssert assertion= new SoftAssert();
    int add_result =Calculator.add(5,3);
    System.out.println(add_result);
   assertion.assertEquals(add_result,8);
    assertion.assertAll();
    }

  @Test(priority = 2)
  public void sub_test() throws InterruptedException{

    SoftAssert sub_assertion = new SoftAssert();
    int sub_result =Calculator.subtract(6,3);
    System.out.println(sub_result);
    sub_assertion.assertEquals(sub_result,2);
  }

  @Test(priority = 3)
  public void count() throws InterruptedException{
SoftAssert count_assertion = new SoftAssert();
    int result =Calculator.count(9);
    result = Calculator.count(1);
    System.out.println(result);
  count_assertion.assertEquals(result,10);
   count_assertion.assertAll();
  }


}
