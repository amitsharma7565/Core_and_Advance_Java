import java.util.Scanner;
class Bike {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter sub1 marks");
    int tel=sc.nextInt();
    System.out.println("enter sub2 marks");
    int eng=sc.nextInt();
    System.out.println("enter sub3 marks");
    int hin=sc.nextInt();
    System.out.println("enter sub4 marks");
    int math=sc.nextInt();
    System.out.println("enter sub5 marks");
    int sci=sc.nextInt();
    int total = tel+eng+math+sci+hin;
    int per= (total* 100)/500;
    System.out.println("percentage of subjects:"+per + "%");
    if(per>=90)
    {
       System.out.println("father:how much grade you are expecting in final exam");
    System.out.println("son: dad i got"+per+" %");
      System.out.println(per+" :excellent,i will buy for bike");
    }
    else if(per>=80)
    {
    System.out.println("father:how much grade you are expecting in final exam");
    System.out.println("son: dad i got"+per+" %");
    System.out.println(per+" :very good, I will buy for you mobile");
    }
    else if(per>=70)
    {
    System.out.println("father:how much grade you are expecting in final exam");
    System.out.println("son: dad i got"+per+" %");
    System.out.println(per+" :good,cycle");
    }
    else 
    {
    System.out.println("fater:how much grade you are expecting in final exam");
    System.out.println("son: dad i got"+per+" %");
    System.out.println(per+":worst,belt");
    }
    
  }
}