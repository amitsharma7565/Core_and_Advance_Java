/*  JFM1T6_Assignment5:
    Write a class "MyClass" in package "mypack" and access it from other class outside the package "mypack".

    Sample Output:
    Welcome to Packages
*/

//create a package name mypack, inside a folder called mypack, and create a class MyClass. In that create Display method and  print message

//outside folder  import the mypack  and call Dislay

import mypack.Myclass;
public class MyPackage {
    public static void main(String args []){
    Myclass s=new Myclass();
    s.display();
}
}