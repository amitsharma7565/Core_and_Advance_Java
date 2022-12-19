class StringBufferInsertDelete{
  public void StringInsert(){
    String str="Amit";
    StringBuffer sb=new StringBuffer(str);
     sb.insert(1,"v");
    System.out.println(sb);
    StringBuffer sb2=new StringBuffer();
    sb2.append("Amit ");
    sb2.append("hi");
    System.out.println(sb2);
    System.out.println(sb2.length());
    System.out.println(sb2.capacity());
    System.out.println(sb2.reverse());
    System.out.println()
  }



  
  public static void main(String args[]){
    StringBufferInsertDelete s1=new StringBufferInsertDelete();
    s1.StringInsert();
  }
}