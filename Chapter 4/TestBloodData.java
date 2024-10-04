import java.util.Scanner;  
   public class TestBloodData{
      public static void main(String[]args){
      BloodData patientData = new BloodData();
      String a = "A";
      String b = "B";
      String ab = "AB";
      String o = "O";
      String pos = "+";
      String neg = "-";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Blood Type(A,B,AB,O)");
      String bloodType = sc.nextLine();
      System.out.println("Enter Rh Factor(+ , -)");
      String rhFactor = sc.nextLine();
      if (bloodType.equalsIgnoreCase(a)||bloodType.equalsIgnoreCase(b)||bloodType.equalsIgnoreCase(ab)||bloodType.equalsIgnoreCase(o)&&rhFactor.equals(pos)||rhFactor.equals(neg)){
         patientData.setBlood(bloodType);
         patientData.setRH(rhFactor);
      }
           else{
        System.out.println("Invalid Blood Type or Rh Factor, will refer to default");
        patientData.defaultPatient();
      }     
      patientData.displayBloodInfo();
      }
   }
  