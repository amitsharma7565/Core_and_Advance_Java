class Distance{
  public static void main(String[] args){
    int x1,x2,y1,y2;
    double dis;
    x1=2;
    x2=1;
    y1=2;
    y2=1;
    
		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") "+dis);
  }
}