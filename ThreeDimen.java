class ThreeDimen{
  public static void main(String args[]){
    int c[][][]=new int[4][4][4];
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        for(int k=0;k<4;k++){
         c[i][j][k]=i+j+k;
        }
        
      }
    }
    for(int s[][]:c){
      for(int n[]:s){
        for(int t:n){
          System.out.print(t);
        }
      }
    }
    // for(int i=0;i<4;i++){
    //   for(int j=0;j<4;j++){
    //     for(int k=0;k<4;k++){
    //       System.out.println(c[i][j][k]);
    //     }
        
    //   }
    // }
  }
}