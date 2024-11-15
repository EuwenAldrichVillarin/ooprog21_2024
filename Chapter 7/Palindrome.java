import java.util.Scanner;
public class Palindrome{


public static void main (String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Please Enter a Word: ");
String word = scan.nextLine();
String finalWord = word.replaceAll("[^a-zA-Z0-9]", "");


String reversed = "";
for (int i = word.length()-1; i>=0; i--){
   reversed += word.charAt(i);
   
}
String finalReverse = reversed.replaceAll("[^a-zA-Z0-9]","");
if(finalWord.equalsIgnoreCase(finalReverse)){
   System.out.println("This word is a Palindrome");
}
else
   System.out.println("This word is not a Palindrome");
}
}