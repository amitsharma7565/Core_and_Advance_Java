import java.util.Scanner;
public class Dulicates{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=s.nextInt();
    int a[]=new int[n];
     int i,j,k;
    int count;
    int fr1[]=new int[n];
    System.out.println("enter "+n+"values:");
    for(i=0;i<a.length;i++){
      a[i]=s.nextInt();
    }
  
    for(i=0;i<a.length;i++){
      count=1;
      for(j=i+1;j<a.length;j++){
      if( a[i]==a[j]){// 1==1
        count++; // count 2
        fr1[j]=-1; // fr1[4]=-1, fr1[2]=-1, fr1[3]=-1
      }
      }
      if(fr1[i]!=-1){// fr1[1]!=-1
      fr1[i]=count;// fri[0]=3,fr1[1]=2;
    }
    }
   for(i=0;i<n;i++){
     if(fr1[i]!=-1){
       System.out.println(a[i]+" "+fr1[i]);
     }
   }   
    int index=0;
    int min=fr1[0];
    for(k=0;k<n;k++){
      if(fr1[k]!=-1){
        if(min>fr1[k]){
          min=fr1[k];
          index=k;
        }
      }
    }
    System.out.println("minimum frequnecy");
    System.out.println(a[index]+" "+fr1[index]);
}
}