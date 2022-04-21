public class stronge
 {
  public static void main(String[] args) {
  
  int num = 145;
  int temp = num;
  int sum = 0;
  while(temp >0){
      int fact =1;
      int rem = temp % 10;
      for(int i=1;i<=rem;i++){
          fact =fact*i;
      }
      sum =sum +fact;
      temp = temp/10;
  }
  if(num == sum){
      System.out.println("it is a stronge number");
  }
  else{
      System.out.println("it is a no stronge number");
  }
}

}
