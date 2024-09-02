   import java.util.Scanner;
   public class SammysRentalPrice{
      public static void main(String[]args){
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S  Sammy's makes it fun in the sun.  S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      Scanner scan = new Scanner(System.in);
      System.out.println("\nHow Many Minutes Did You Rent Our Equipment?: ");
      double time = scan.nextInt();
      
      callCalc(time);
      }
      public static void callCalc(double time){
      int hourPrice = 40;
      int minPrice = 1;
      int hour = (int)time/60;
      System.out.println("Hour/s: "+hour+" hrs");
      double min = time%60;
      System.out.println("Minute/s: "+min+" mins");
      double total = (hourPrice*hour)+(minPrice*min);
      System.out.println("Total Price: $"+total);
      }
   }