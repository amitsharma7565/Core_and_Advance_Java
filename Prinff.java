import java.io.*;
import java.util.*;

public class Prinff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            String str=sc.next();
            int num=sc.nextInt();
            System.out.printf("%s%d",str,num);
        }
    }
}