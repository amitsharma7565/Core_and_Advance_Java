class LabelBreak{
  public static void main(String args[]){
    // label break
    amit:
    for(int i=1;i<4;i++){
      for(int j=1;j<4;j++){
        if(i==2){
          break amit;
        }
        System.out.print("*");

      }
      System.out.println(" ");
    }
  }
}