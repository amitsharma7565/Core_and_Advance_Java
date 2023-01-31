import java.io.*;
import java.util.*;

class A {
  public synchronized void d1(B b) {
    System.out.println("Thread 1 start exceution d1 mthod");
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e);
    }
    b.last();
  }

  public synchronized void last() {
    System.out.println("Thread 1 Inside A last method");
  }
}

class B {
  public synchronized void d2(A a) {
    System.out.println("Thread 2 start exceution d2 mthod");
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e);
    }
    a.last();
  }

  public synchronized void last() {
    System.out.println("Thread 2 Inside B last method");
  }
}

class DeadLockCreateSuitation extends Thread {
  A a = new A();
  B b = new B();

  public void m1() {
    this.start();
    a.d1(b);
  }

  public void run() {
    b.d2(a);
  }

  public static void main(String args[]) {
    DeadLockCreateSuitation d = new DeadLockCreateSuitation();
    d.m1();
  }
}