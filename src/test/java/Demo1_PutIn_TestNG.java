import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo1_PutIn_TestNG {

  @Test
  public void PutInA() {
    System.out.println("放入坚果A \n");
  }


  @Test
  public void PutInB(){
    System.out.println("放入坚果B \n");
  }

  @Test
  public void PutInC(){
    System.out.println("放入坚果C \n");

  }

  @AfterMethod
  public void PutInAll(){
    System.out.println("统一打包 \n");
  }

}
