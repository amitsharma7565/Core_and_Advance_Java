// to print 1 to 100 only perfect number

import java.util.*;
class Perfect2{
  public static void main(String args[]){
    int num=100;
    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
      }
    }
  }
}