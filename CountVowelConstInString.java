class CountVowelConstInString{
  public static void main(String args[]){
    String str="amitsharma7565@gmail...com";
    char str2[]=str.toCharArray();
    int vowelCount=0;
    int constCount=0;
    int numCount=0;
    int digitCount=0;
    for(int i=0;i<str2.length;i++){
if(str2[i]=='a'||str2[i]=='e'||str2[i]=='i'||str2[i]=='o'||str2[i]=='u'){
        vowelCount++;
      }
      else if(str2[i]>='a'&&str2[i]<='z'){
        constCount++;
      }
        else if(str2[i]>='0'&&str2[i]<='9'){
          numCount++;
        }
      else{
        digitCount++;
      }
    }
    System.out.println("vowel is"+vowelCount);
    System.out.println("Consutient is"+constCount);
    System.out.println("Number is "+numCount);
    System.out.println("Special Charcter is"+digitCount);
    }
  }
