class SumOfEven{
  public static void main(String args[]){
    int num=10;
    int i=0;
    int sum=0;
    // for(int i=1;i<=num;i++){
    //   if(i%2==0){
    //     sum=sum+i;
    //   }
    // }
    // System.out.println(sum);


    // by using while loop

  //   while(num>=i){
  //     if(i%2==0){
  //       sum=sum+i;
  //         }
  //     i++;
  //   }
  //   System.out.println(sum);
  // }


    // by using do while loop

do{
  if(i%2==0){
    sum=sum+i;
  }
  i++;
}while(num>=i);
  System.out.println(sum);
}
}