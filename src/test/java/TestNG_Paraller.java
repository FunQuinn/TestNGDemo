import org.testng.annotations.Test;

public class TestNG_Paraller {
  @Test(threadPoolSize = 3,invocationCount = 10,timeOut = 60000)
  public void addTest() throws InterruptedException{
    int add_result =Calculator.add(10,12);
    System.out.println("add_result: " +add_result);
  }

  @Test(threadPoolSize = 3,invocationCount = 10,timeOut = 60000)
  public void countTest() throws InterruptedException{
    int count_result =Calculator.sycount(10);
    System.out.println("count_result: " +count_result);
  }
}
