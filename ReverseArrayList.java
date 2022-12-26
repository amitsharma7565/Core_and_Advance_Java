/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList 
{  

   //Take an arraylist as a parameter and returns a reversed arraylist 
   ArrayList<Integer> reverseArrayList(ArrayList<Integer> list)
   {
       //Arraylist for storing reversed elements
       ArrayList<Integer> revList = new ArrayList<Integer>();
        for( int i=list.size()-1;i>=0;i--)
        {
          //Append the elements in reverse order 
          revList.add(list.get(i));
        }
        //Return the reversed arraylist
        return revList;
   }
   
    //Iterate through all the elements and print
    void printElement(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }

    //main method
    public static void main (String[] args)
    {
    //creat an object of ReverseArrayList class 
    ReverseArrayList obj = new ReverseArrayList();
    //take input from user
    Scanner sc = new Scanner(System.in);
    //creat an object of ArrayList class
    ArrayList<Integer> input = new ArrayList<Integer>();
    System.out.print("enter how many numbers you want :");
    int  size =sc.nextInt();
    for(int i=0;i<size;i++)
    {
       System.out.print("Enter number "+i+" : ");
        input.add(sc.nextInt());
    } 
    //call reverseArrayList method
    input=obj.reverseArrayList(input);
    //call printElement method
    System.out.print("Elements after reversing : ");
    obj.printElement(input);
    }
}
 
