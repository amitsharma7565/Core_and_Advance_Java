class FindFrequencyInArray{
  public static void main(String args[]){
    // First Array
    int arr[]= {2,3,4,2,4,4,1,2};
    // Second array if value again vist then put -1 that place 
    int vistedArr[]=new int[arr.length];
    // Define visted variable -1;
    int visted=-1;
    // compare the value then we need two loop;
    for(int i=0;i<arr.length;i++){
      // declare count=1 becuase every value can repeat 1 time atlest;
      int count=1;
     for(int j=i+1;j<arr.length;j++){
       // if(first value.....n ====second value...n) then increment count;
       if(arr[i]==arr[j]){
         count++;
         // then that place of j value is -1 we put in the new array
        vistedArr[j]=visted;
       }
     }
      // then second array is visted array if its is not equal to -1 then that that place we put the value in new array 1 ;
      if(vistedArr[i]!=visted){
        vistedArr[i]=count;
      }
    
    }

    for(int i=0;i<vistedArr.length;i++){
      if(vistedArr[i]!=visted){
        System.out.println("Frequnecy "+arr[i]+" "+vistedArr[i]);
      }
    }

  }
}