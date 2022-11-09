class Unique {
   public static void main (String[] args) {
      int arr[] = {1,5,9,1,4,9,6,9,7,15,19};
      int i, j;
      System.out.println("The array is: ");
      for (i = 0; i <arr.length; ++i)
      System.out.println(arr[i] + " ");
      System.out.print("The distinct elements of above array are: ");
      for (i = 0; i <arr.length; i++) {
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
      }
   }
}