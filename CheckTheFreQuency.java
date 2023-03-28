class CheckTheFreQuency{
  public static void main(String args[]){
    int arr[]={1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,5};
    int visted[]=new int[arr.length];
    int visit=-1;
    int max=0;
    int min=0;
    int countIndex=0;
    for(int i=0;i<arr.length;i++){
      int count=1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
          visted[j]=visit;
        }
      }
     
      
      if(visted[i]!=visit){
        // System.out.println(arr[i]+" "+count);
         if(max<count){
           max=count;
           countIndex=i;
         }
      }
    }

  System.out.println(max+" "+arr[countIndex]);
  }
}