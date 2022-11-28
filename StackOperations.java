/* JFM1T10_Assignment4:

     Create an interface named MyStack in package MyCollection with following methods- 
     void push(int I) 
     int pop() 
     Create two sub classes inheriting the MyStack interface.  
   1.class FixedStack that can accept a fixed numbers of integers. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, “Stack overflow” message should be displayed. 
   2.class VariableStack that can accept numbers more than its size. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, the stack should automatically grow to accommodate the new element. 
     Make a program that checks the implementation of both the classes. 
     Prompt the user for the  values to be input from the terminal.

     Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5

     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1

*/
import java.util.*;


//Create a interface name MyStack
interface MyStack{
     public int push(String[] str);
     public int pop();
     public void display();
}
//Add a class FixedStack that implements StackOperations and create a methods push and pop
class FixedStack implements MyStack{
     int arr[]=new int[3],top=-1;
     //Performing push() method which is implemented from interface MyStack
     public int push(String[] str){
          //initially result is 0
          int result=0;
          //initially temp is 0
          int temp=0;
          //for loop to go through arrray
          for(int i=0;i<str.length;i++){
               if(temp<arr.length){
                    //increasing top by 1
                    top++;
                    //Parsing every string in String array 'str' into integer and initializing it to arr[top]
                    arr[top]=Integer.parseInt(str[i]);
                    result=0;
               }
               if(temp>=arr.length){
                    result=i;
                    break;
               }
               temp++;
          }
          //returning result
          return result;
     }
     //performing pop() method which is implemented from interface MyStack
     public int pop(){
          //if top is equal to -1 it means stack is empty
          if(top==-1)
               //so return 0
               return 0;
          //if top is pointing something in the stack
          else{
               //initializing that element into new variable 'item'
               int item=arr[top];
               //making arr[top] as 0 which means there's null in that position
               arr[top]=0;
               //reducing top value by 1
               top--;
               //returning that item
               return item;
          }
     }
     //performing display() method which is implemented from interface MyStack
     public void display(){
          //Printing all elements using for loop
          print("Printing all elements of Fixed Stack");
          for(int i=arr.length-1;i>=0;i--)
               System.out.println(arr[i]);
     }
     
     public static void print(String str){System.out.println(str);}
}
//Add a class DynamicStack that implements StackOperations and create a methods push and pop
class DynamicStack implements MyStack{
     int arr[]=new int[3],top=-1;
     //Declaring array newarr[] to increase size
     int newarr[];
     //Performing push() method which is implemented from interface MyStack
     public int push(String[] str){
          Scanner sn=new Scanner(System.in);
          //initially result=0
          int result=0;
          //declaring length of newarr as str.length
          newarr=new int[str.length];
          //initially temp=0
          int temp=0;
          //for loop to go through both thebarrrays
          for(int i=0;i<str.length;i++){
               top++;
               if(temp<arr.length){
                    arr[top]=Integer.parseInt(str[i]);
                    newarr[top]=arr[top];
                    result=0;
               }
               if(temp>=arr.length){
                    newarr[top]=Integer.parseInt(str[i]);
                    result=1;
               }
               temp++;
          }
          //returning result
          return result;
     }
     //performing pop() method which is implemented from interface MyStack
     public int pop(){
          //if top is equal to -1 it means stack is empty
          if(top==-1)
               //so return 0
               return 0;
          //if top is pointing something in the stack
          else{
               //initializing that element into new variable 'item'
               int item=newarr[top];
               //making newarr[top] as 0 which means there's null in that position
               newarr[top]=0;
               //reducing top value by 1
               top--;
               //returning item
               return item;
          }
     }
     //performing display() method which is implemented from interface MyStack
     public void display(){
          //Printing all elements using for loop
          print("Printing all elements of Dynamic Stack");
          for(int i=newarr.length-1;i>=0;i--)
               System.out.println(newarr[i]);
     }
     public static void print(String str){System.out.println(str);}
}
class  StackOperations {

//Add main method here
     public static void main(String[] args){
          //Declaration of Scanner Class object
          Scanner sn=new Scanner(System.in);
          //Integer element for Switch case
          int ch;
          //Creating FixedStack class object
          FixedStack fixed=new FixedStack();
          //Creating DynamicStack class object
          DynamicStack dynamic=new DynamicStack();
          //while Always true so loop repeats until exit is performed
          while(true){
               //Taking user input of their choice
               print("Enter Operation to be performed 1 for push,2 for pop,3 to display,4 to quit:");
               ch=sn.nextInt();
               //Switch according to choice
               switch(ch){
                    //if user enters 1 push operation
                    case 1:
                         //Taking comma separated input from the user
                         print("Enter a  few comma separated integers (Ex: 1,7,4)");
                         String s = sn.next();
                         //Splitting that iput when comma occurs and initializing it to StringArray str
                         String[] str = s.split(",");
                         //passing str to push method of FixedStack class using fixed object and initializing the result into new integer variable result
                         int result=fixed.push(str);
                         //passing str to push method of DynamicStack class using dynamic object and initializing the result into new integer variable dynresult
                         int dynresult=dynamic.push(str);
                         // if both result and dynresult are 0
                         if(result==0 && dynresult==0){
                              //Printing as pushed Successfully for both stacks
                              print("Pushed into Fixed Stack Successfully");
                              print("Pushed into Dynamic Stack Successfully");
                         }
                         //else
                         else{
                              //print as FixedStack as overflow and Dynamic stack as increasing stack length using for loop
                              for(int i=result;i<str.length;i++){
                                   print("Fixed Stack Overflows. Failed to push the integer:"+str[i]);
                                   print("Dynamic Stack Overflow. Increasing the stack length...Done");
                              }
                         }
                         break;
                    //if user Enters 2    
                    case 2:
                         //Calling pop method from FixedStack class using object 'fixed' and initializing result into 'item' variable
                         int item=fixed.pop();
                         if(item==0)
                              print("Fixed Stack is underflow");
                         else
                              System.out.println("Popped elementin Fixed Stack is:"+item);
                         //Calling pop method from DynamicStack class using object 'dynamic' and initializing result into 'dynitem' variable
                         int dynitem=dynamic.pop();
                         if(dynitem==0)
                              print("Dynamic Stack is underflow");
                         else
                              System.out.println("Popped element in Dynamic Stack is:"+dynitem);
                         break;
                     //if usser enters 3    
                    case 3:
                         //calling display method from FixedStack
                         fixed.display();
                         //calling display method from FixedStack
                         dynamic.display();
                         break;
                    //if user enters 4
                    case 4:
                         //exit
                         System.exit(1);
                         break;
                    //if user enters any other input
                    default:
                         print("Invalid choice");
               }
          }
     }
     public static void print(String str){System.out.println(str);}
}