public class Calculator {

  public static int result = 0;


  public static int add(int x, int y) throws InterruptedException {
    result = x + y;
    return result;
  }

  public synchronized static int sy_add(int x, int y) {
    int result = x + y;
    return result;

  }


  public static int subtract(int x,int y) {
    result = x-y;

    return result;
  }

  public synchronized static int sy_subtract(int x,int y) {
   int result = x-y;

    return result;
  }
  public static int multiply(int x,int y){
    result = x * y;
    return result;
  }

  public static int devide(int x,int y){
    result= x/y;
    return result;
  }

  public static int count(int x) throws InterruptedException{
    int i=result;
    Thread.sleep(3000);
    result=i+x;
    return result;
  }
  public synchronized  static int sycount(int x) throws InterruptedException{
    int i=result;
    Thread.sleep(3000);
    result=i+x;
    return result;
  }


  public static void clear(){
    result=0;

  }


}
