import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;

class CurrentDateAndTimeSample {
  public static void main(String args[]) {
    LocalDate d = LocalDate.now();
    LocalDate d2 = LocalDate.of(1998, Month.JANUARY, 22);
    System.out.println(d2);
    LocalTime t= LocalTime.now();
    LocalTime t1= LocalTime.of(14,00,12,999);
    System.out.println(t1);
  }
}