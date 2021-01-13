package week4;

public class Testcircle {
    
    public static  void  main (String [] args) {
       
        Encapsulation circle1  = new Encapsulation(1 ,  2.0);
         circle1.getEncapsulation();
       

         Encapsulation circle2  = new Encapsulation(1 , 3.0);
         circle2.getEncapsulation();

         Encapsulation circle3  = new Encapsulation(1 ,  1.0);
         circle3.getEncapsulation();

         Encapsulation circle4  = new Encapsulation(1,   -0);
         circle4.getEncapsulation();
         
         Encapsulation.getintersec(circle1,circle2);
         Encapsulation.getintersect(circle1, circle3);
      
    
    }



	
}
