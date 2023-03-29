// 123456789 
//  1234567 
//   12345 
//    123 
//     1 

class PascalTriangle3{
  public static void main(String args[]){
    for(int i=5;i>=1;i--){
      for(int k=1;k<=5-i;k++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print(j);
      }
      System.out.println(" ");
    }
  }
}