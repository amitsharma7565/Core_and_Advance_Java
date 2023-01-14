class QuickShort1{
  public static void main(String args[]){
    int arr[]={15,9,7,13,12,16,4,8,11};
    int len=arr.length;
    QuickShort1 qs = new QuickShort1();
    qs.quick(arr,0,len-1);
    qs.printArray(arr);
  }
  int partition(int arr[],int low,int high){
    int pivot=arr[(low+high)/2];
    while(low<=high){
      while(arr[low]<pivot){
        low++;
      }
      while(arr[high]>pivot){
        high--;
      }
      if(low<=high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
      }
    }
    return low;
  }
  void quick(int arr[],int low, int high){
    int pi=partition(arr,low,high);
    // left side of the list
    if(low< pi-1){
      quick(arr,low,pi-1);
    }
    // right side of the list
    if(pi<high){
      quick(arr,pi,high);
    }
  }
  // print array
  void printArray(int arr[]){
    // for each loop
    for(int i:arr){
      System.out.print(i+" ");
    }
  }
}