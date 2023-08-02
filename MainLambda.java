public class MainLambda{
  public static void main(String args[]) throws Exception {
    MyInter i = () -> {
      System.out.println("hi this is lambda Expression");
    };

    Sum s = (a, b) -> a + b;
    LengthIntr l = (str) -> str.length();
    Runnable thread1 = () -> {
      for (int i = 0; i <= 10; i++) {
        System.out.println(i);
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println(e);
        }

      }
    };

    Thread thread = new Thread(thread1);
    thread.setName("My");
    thread.start();
    i.sayHello();
    System.out.println(l.getLength("Amit"));
    System.out.println(s.sum(10, 10));
  }
}