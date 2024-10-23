import java.util.Scanner;
public class SortingThreeNumbers{
   public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Please Enter 3 Numbers");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int num3 = scan.nextInt();
   int smallest = 0;
   int middle=0;
   int largest=0;
   if(num1>=num2&&num2>=num3){
      smallest = num3;
      middle = num2;
      largest = num1;
   }
   if(num1>=num3&&num3>=num2){
      smallest = num2;
      middle = num3;
      largest= num1;
   }
   if(num2>=num1&&num1>=num3){
     smallest = num3;
     middle = num1;
     largest = num2;
   }
   if(num2>=num3&&num3>=num1){
      smallest = num1;
      middle = num3;
      largest = num2;
   }
   if(num3>=num2&&num2>=num1){
      smallest = num1;
      middle = num2;
      largest = num3;
   }
   if(num3>=num1&&num1>=num2){
      smallest = num2;
      middle = num1;
      largest = num3;
   }   
       System.out.println("Arranged in Ascending order:"+smallest+""+middle+""+largest);
       }
}