class FreQuency{
  public static void main(String args[]){
    String str="aa bb cc dd  dfffffffffd vdfhfdv f";
    str=str.replaceAll(" ","");
    char ch[]= new char[str.length()];
    
    boolean vist=false;
    int max=0;
    int charIndex=0;
    boolean visited[]=new boolean[str.length()];
    for(int i=0;i<str.length();i++){
      ch[i]=str.charAt(i);
    }

    
  for(int m=0;m<visited.length;m++){
    visited[m]=vist;
  }
int count;
  for(int j=0;j<ch.length;j++){
    count=1;
    for(int k=j+1;k<ch.length;k++){
      if(ch[j]==ch[k]){
        count++;
        visited[k]=true;
      }
    }
    if(visited[j]==false){
      // System.out.println(ch[j]+" "+count);
      if(max<count){
        max=count;
        charIndex=j;
      }
     
    }
  }
    
    System.out.println(str.charAt(charIndex)+" "+max);
    
 

    
  
    
  }
}