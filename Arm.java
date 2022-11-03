import java.util.*;
public class Arm
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
      int  num=sc.nextInt(); // 160
        for(int i = 1; i <= num; i++) //(i<=160)
        {
            n = i;//n=1,2,3....160
            while(n > 0) 
            {
                b = n % 10;// reminder last digit
                sum = sum + (b * b * b);// sum+(reminder)
                n = n / 10;//remove the last digit
            }
            if(sum == i) // sum=i
            {
                System.out.print(i+",");
            }
            sum = 0;
        }
    }
}