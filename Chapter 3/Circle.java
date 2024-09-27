public class Circle{
   double rad;
   double dia;
   double area;
   
   Circle(double rad){
   this.rad = rad;
   dia = rad*2;
   area = 3.14*(rad*rad);
   }
   
   public void setRadius(double rad){
      this.rad = rad;
      dia=rad*2;
      area = 3.14*(rad*rad);
   }
   
   public double getRadius(){
    return rad;
   }
   
    public double getDiameter(){
     return dia;
   }
   
   public double getArea(){
      return area;
   }

}