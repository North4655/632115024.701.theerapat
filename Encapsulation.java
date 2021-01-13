package week4;

// theerapat jiongthong 
// 632115024 

public class Encapsulation {
    private static double a;
    private int b = 1;
    private double area ;
    private double redius;
    double x ;
    double y ;


   
    public Encapsulation(double a,  double redius) {
        Encapsulation.a = a;
        // this.c = c ;
        this.redius = redius;
    }

    public Encapsulation( double redius) {
        this(a,  -2.0);

    }

    public double getEncapsulation() {
         
          area = Math.PI * redius * redius;
         System.out.println("The area of circle is: " + "  " + area);

        double circumference = Math.PI * 2 * redius;
        System.out.println("The circumference of the circle is:" + circumference);

        return a;

    }

    public  static boolean getintersec(Encapsulation circle1,Encapsulation circle2){
    
        double dis = 0;
         dis = (circle1.x-circle2.x) * (circle1.x-circle2.x) + (circle1.y-circle2.y)* (circle1.y-circle2.y);

         double sum = 0 ;
        sum= (circle1.redius+circle2.redius) * (circle1.redius+circle2.redius);

        if(dis > sum){
            System.out.println(" is circle 1 intersec circle 3  is fals ");
             return false ;

        }
        else {
            System.out.println(" is circle 1 intersec circle 2  is true");
            return true ;
        }   



        
    }

    public  static boolean getintersect(Encapsulation circle1,Encapsulation circle3){
    
        double dis = 0;
         dis = (circle1.x-circle3.x) * (circle1.x-circle3.x) + (circle1.y-circle3.y)* (circle1.y-circle3.y);

         double sum = 0 ;
        sum= (circle1.redius+circle3.redius) * (circle1.redius+circle3.redius);

        if(dis > sum){
            System.out.println(" is circle 1 intersec circle 3  is fals ");
             return false ;

        }
        else {
            System.out.println(" is circle 1 intersec circle 3  is false");
            return true ;
        }   



        

}

}        

     

