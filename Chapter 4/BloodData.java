   public class BloodData{
      String bloodType;
      String rhFactor;
      
    
      public void defaultPatient(){
         bloodType = "A";
         rhFactor = "-";
      }
      
      public void displayBloodInfo(){
         System.out.println("Your Blood Type is: " +bloodType);
         System.out.println("Your Rh Factor is: " +rhFactor);
      }
      
      public void setBlood(String bloodType){
      this.bloodType = bloodType;
      }
      public void setRH(String rhFactor){
      this.rhFactor = rhFactor;
      }
      
      public String getBlood(){
      return bloodType;
      }
      public String getRH(){
      return rhFactor;
      }
      
}