// Interface find smallest element
//   1.method to find smllest number among 2 numbers
//   2.method to find smallest number among 3 memebers
//   3.method to find smallest number among array of elements
// do this one

interface number {
  public void num1();
  public void num2();
  public void num3();
}

class Find implements number {
  public void num1() {
    int n1 = 20;
    int n2 = 9;
    if (n2 < n1) {
      System.out.println("smllest number among 2 numbers is" + n2);
    } else {
      System.out.println("smllest number among 2 numbers is" + n1);
    }
  }

  public void num2() {
    int nn1 = 6;
    int nn2 = 1;
    int nn3 = 5;
    if (nn1 < nn2 && nn1 < nn3) {
      System.out.println("smallest number among 3 memebers " + nn1);
    } else if (nn2 < nn1 && nn2 < nn3) {
      System.out.println("Smallest number among 3 members " + nn2);
    } else {
      System.out.println("Samllest number among 3 members " + nn3);
    }
  }
  public void num3(){
    int a[]={70,4,5,6,6,2,4};
    int temp=a[0];
    for(int i=1;i<a.length;i++){
      if(a[i]<temp){
        temp=a[i];
      }
      }
     System.out.println(temp);
    }
  }


class SampleInterfaceCal {
  public static void main(String args[]) {
    number r = new Find();
    r.num1();
    r.num2();
    r.num3();
  }
}
