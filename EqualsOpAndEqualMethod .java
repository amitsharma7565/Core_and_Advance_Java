public class EqualsOpAndEqualMethod {
    public static void main(String[] args)
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");
 
        System.out.println(t1 == t3);// true
        System.out.println(t1 == t2);//flase
        System.out.println(s1 == s2);//false
 
        System.out.println(t1.equals(t2)); //false
        System.out.println(s1.equals(s2));//true
    }
}