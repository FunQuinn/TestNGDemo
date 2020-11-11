import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * 使用Allure报表进行测试结果汇总
 */
@Epic("Epic计算器项目")
@Feature("Feature冒烟测试用例")
public class TestNG_Allure {
  @BeforeMethod
  public void clearFirst() {
    Calculator.clear();
    System.out.println("执行测试方法前操作清零动作");
  }

  @Description("Description加法测试")
  @Story("Story加法测试")
  @Severity(SeverityLevel.CRITICAL)
  @Issue("测试类型")
  @Link(name = "测试社区：", type = "mylink", url = "https://ceshiren.com/t/topic/7718")
  @Test(priority = 1)
  public void add_test() throws InterruptedException {
    SoftAssert assertion = new SoftAssert();

    int result01 = Calculator.add(4, 2);
    System.out.println("完成加法计算，结果为：" + result01);
    assertion.assertEquals(result01, 6);

    int result02 = Calculator.add(4, 2);
    System.out.println("完成加法计算，结果为：" + result02);
    assertion.assertEquals(result02, 6);

    int result03 = Calculator.add(4, 2);
    System.out.println("完成加法计算，结果为：" + result03);
    assertion.assertEquals(result03, 6);
    assertion.assertAll();
    Allure.addAttachment("脚本名称", "加法测试用例");
  }


  @Test(priority = 2)
  @Description("Description减法测试")
  @Story("Story减法测试")
  @Severity(SeverityLevel.CRITICAL)
  @Issue("测试类型")
  @Link(name = "测试社区：", type = "mylink2", url = "https://ceshiren.com/t/topic/7611")
  public void sub_test() throws InterruptedException {

    int sub_result = Calculator.subtract(6, 3);
    System.out.println(sub_result);
    Assert.assertEquals(sub_result,2);
  }

  @Description("Description总和测试")
  @Story("Story总和测试")
  @Severity(SeverityLevel.CRITICAL)
  @Issue("测试类型")
  @Link(name = "测试社区：", type = "mylink3", url = "https://ceshiren.com/t/topic/7611")
  @Test(priority = 3)
  public void count() throws InterruptedException {
    SoftAssert count_assertion = new SoftAssert();
    int result = Calculator.count(9);
    result = Calculator.count(1);
    System.out.println(result);
    count_assertion.assertEquals(result, 10);
    count_assertion.assertAll();
  }


}
