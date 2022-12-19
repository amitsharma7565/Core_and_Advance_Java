import java.util.*;

class Book{
  int id;
  String name,author,publisher;
  int quatity;
  Book(int id, String name, String author, String publisher,int quatity ){
    this.id=id;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.quatity=quatity;
  }
}


class BookLinkdedLink{
  public static void main(String args[]){
    LinkedList<Book>b=new LinkedList<Book>();
    // create the object
    Book b1=new Book(101,"java","Lalitha","BitLabs",1);
    Book b3=new Book(102,"java3","Lalitha2","BitLab2",3);
    b.add(b1);
    b.add(b3);
    // for each loop
    for(Book bok:b){
      System.out.println(bok.author); 
}
}
}