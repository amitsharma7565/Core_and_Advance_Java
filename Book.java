// Book

// name
// price
// author

// author

// name
// age
// place

class Book1{
  String name;
  int price;
  Author author;
  // constructor
  Book1(String name,int price,Author author){
    this.name=name;
    this.price=price;
    this.author=author;
  }
}
class Author{
  String name;
  int age;
  String place;
  // constructor
  Author(String name,int age,String place){
    this.name=name;
    this.age=age;
    this.place=place;
  }
}
class Book{
  public static void main(String args[]){
    Author a=new Author("Amit",25,"Himachal");
    Book1 b=new Book1("Math",456,a);
    System.out.println("Book details");
    System.out.println(b.name+" "+b.price+" ");
    System.out.println("Author details");
    System.out.println(a.name+" "+a.age+" "+a.place);
  }
}
