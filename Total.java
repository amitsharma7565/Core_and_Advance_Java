// Write a JAVA program to count total number of even and odd elements in an array
class Total{
  public static void main(String args[]){
    int a[]={2,4,6,8,10,11,13,17,44,57};
    int count_even=0,count_odd=0;
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        count_even++;
      }
      else{
        count_odd++;
      }
    }
    System.out.println("The even number in list are "+count_even);
    System.out.println("The odd number in list are "+count_odd);
  }
}