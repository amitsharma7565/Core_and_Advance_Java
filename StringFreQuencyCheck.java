class StringFreQuencyCheck{
  public static void main(String args[]){
   String str= "how are youoo";
    String str2= str.replace(" ","");
    String str3[]= str2.split("");
  int visited[]=new int [str3.length];
    int visit=-1;
    for(int i=0;i<str3.length;i++){
      int count=1;
      for(int j=i+1;j<str3.length;j++){
       if(str3[i].equals(str3[j])){
         count++;
         visited[j]=visit;
       }
      }
      if(visited[i]!=visit){
        System.out.println(str3[i]+" "+count);
      }
    
    }
  }
}