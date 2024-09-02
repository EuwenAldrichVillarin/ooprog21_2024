import java.util.Scanner;
public class CarlysEventPrice{
   public static void main(String[]args){
      int price = 35;
      System.out.println("*************************************");
      System.out.println("* Carly's makes the food that makes *");
      System.out.println("*            it a party             *");
      System.out.println("*************************************");
      Scanner scan = new Scanner(System.in);
      System.out.println("\n");
      System.out.println("How Many Guests Are Going To Attend? : ");
      int guests = scan.nextInt();
      callCalc(price,guests);
   }
   public static void callCalc(int price, int guests){
      System.out.println("\nNumber of Guests:"+guests);
      System.out.println("Price per Guest :$"+price);
      int totalPrice = price*guests;
      System.out.println("Total Price:$"+totalPrice);
      jobClass(guests);
   }
   public static void jobClass(int guests){
      if (guests >= 50){
      System.out.println("Large event=True");
      }
      else 
      System.out.println("Large event=False");
   }
}