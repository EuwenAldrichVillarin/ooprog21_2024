import java.util.Scanner;
public class Prelim{
   public static void main(String[]args){
   int k = 0;
   int l = 1;
   for(int i = 0; i<=10;i++){
      System.out.println("fibonacci("+i+")-->"+k);
      int sum = k+l;
      k=l;
      l=sum;
   } 
   
   }
}
