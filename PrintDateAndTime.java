import java.util.Date;
import java.text.SimpleDateFormat; 
class PrintDateAndTime{
  public static void main(String args[]){
    Date date= new Date(); 
    SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    System.out.println(simple.format(date));
  }
}