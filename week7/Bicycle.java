package week7;

public class Bicycle {
     
    private int speed = 0 ;



    public Bicycle(){}

    public   Bicycle(int  speed ){
        this. speed = speed  ;
        
}
  
 public void speedup( ){
      if( speed >99){
          System.out.println("it over 99");
      }else{
        speed  = speed  +5 ;
      }
    }
  
      public void Showspeed() {
        System.out.println(" Show speed now !!  "+  speed  + "");

}

  public void Stop(){
    System.out.println("!!! BREAK !!! ");
    speed  =  speed  -5 ;

  }

 

 
      
  
 









 
}
