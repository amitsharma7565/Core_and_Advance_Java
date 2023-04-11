class CheckFrequency{
  public static void main(String args[]){
    String str="hi my name is amit";
    str=str.replaceAll(" ", "");
    char ch[]=str.toCharArray();
    int visited[]=new int[ch.length];
    int vist=-1;
    for(int i=0;i<ch.length;i++){
      int count=1;
      for(int j=i+1;j<ch.length;j++){
         if(ch[i]==ch[j]){
           count++;
           visited[j]=vist;
         }
      }
      if(visited[i]!=vist){
        System.out.println(count+" "+ch[i]);
      }
    }
      }

  
}