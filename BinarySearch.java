/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/

import java.util.Scanner;

public class BinarySearch
{

      //main method 
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
                 
        System.out.print("Enter array size ");
        int integers = sc.nextInt();
        int arr[]=new int[integers];
        System.out.println("enter the values");
        for(int i=0;i<integers;i++)
        {
            sc.useDelimiter("\\D");
           arr[i]=sc.nextInt();
        }
        int temp;
        //check all elements using for loop
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              //check if first number is greater than the second number or not if true then swap  
              if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        //check and print result
            // for(int i=0;i<arr.length;i++)
            // {
            //     System.out.print(arr[i]);
                
            // }
            //Declare variables
            int l,beg,end;
            System.out.print("\nEnter Number to be search :");
             l=arr.length;
         	int key=sc.nextInt();
         	beg=0;
         	end=l-1;
            //call binarySearch method
            
            binarySearch(arr,0,end,key);
            
      }
            //create a method in that declare a variables and initialize l=a.length, beg=0, end=l-1, mid=(beg+end)/2
            public static  void binarySearch(int arr[],int beg,int end,int key)
            {
              
                int   mid=(beg+end)/2;
                //check each number less than or greater than to the mid element
                while(beg<=end)
                {
                     //if mid element is less than key than it calculates beg and mid
                     if(arr[mid]<key)
                     {
                        beg=mid+1;
                     }
                     //if mid is equal to key than it stops and return mid
                     else if(arr[mid]==key)
                     {
                        mid++;
                        System.out.print("Position of element is at : "+mid);
                        return;
                     }
                     //if mid element is greater than key then it calculates end and mid
                     else
                     {
                        end=mid-1;
                     }
                     mid=(beg+end)/2;
                }
                     //checking beg is greater than end, then mid = 0
                     if(beg>end)
                     {
                        System.out.print("Sorry,Key doesn't exist in the array");
                        
                     }
            }
               
}