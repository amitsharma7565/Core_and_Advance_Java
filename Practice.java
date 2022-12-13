import java.util.*;
class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        // int count2=0;
        for(int i=2;i<=num;i++){
             int count=0;
            for(int j=1;j<num;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                // count2++;
                // if(count2%2!=0)
              {
                System.out.println(i);
                }
           
        }
    }
}
}
