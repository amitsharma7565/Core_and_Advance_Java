class FreQuency1{
  public static void main(String args[]){
    String str="welcome to bitlabs";
    String str2= str.replaceAll(" ","");
    int str3[]={1,2,3,3,2,1,3,4};
    int vistedArr[]= new int[str3.length];
    int vist=-1;
    for(int i=0;i<str3.length;i++){
      int count=1;
      for(int j=i+1;j<str3.length;j++){
        if(str3[i]==str3[j]){
          count++;
          vistedArr[j]=vist;
        }
      }
       if(vistedArr[i]!=vist){
         vistedArr[i]=count;
        }
    }
     for(int i=0;i<vistedArr.length;i++){
      if(vistedArr[i]!=vist){
        System.out.println("Frequnecy "+str3[i]+" "+vistedArr[i]);
      }
    }
  }
}