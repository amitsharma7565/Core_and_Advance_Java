import java.util.*;
class ReverseArrayOfStringInThatPlace{
    public static void main(String[] args) {
       String str="My name is Amit Sharma ";
       String strArray[]= str.split(" ");
       String strArrayReverse[]= new String[strArray.length];
       for(int i=0;i<strArray.length;i++){
         StringBuffer input = new StringBuffer();
           input.append(strArray[i]);
           strArrayReverse[i]=input.reverse().toString()+" ";
       }
       for(int i=0;i<strArrayReverse.length;i++){
           System.out.println(strArrayReverse[i]);
       }
    }
}