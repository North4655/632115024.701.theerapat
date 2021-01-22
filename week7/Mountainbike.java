package week7;

public class Mountainbike {
      private  int current =  0 ;  
      //private  int  gear =0  ;
      int B ;

        
    public Mountainbike(){}

    public Mountainbike(int current){
        this.current= current ;
       
    }
   
    public void speed( ){
        if( current >99){
            System.out.println(" it over 99  ");
            System.out.println(" stop and slowdown  ");
        }else{
           current  = current  +5 ;
        }
      }
      
      public void Showspeed() {
        System.out.println(" Show speed now !!  "+ current + "");

      }


    public void Gearup(int Gear ){
        if(current>99){
            System.out.print("  it  over 99 !! ");
        }else {
            current = current*Gear ;
        }
         
      }

      public void Geardown(int down ){
          current= current/down;
          System.out.println(" Speed IS "+current);

      }

	

    }


