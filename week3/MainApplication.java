package week3;
// theerapat jongthong 
//632115024
public class MainApplication {
    
  public static void main(String[] args) {
   
           NerfGun gun1 = new NerfGun(0);
           gun1.fire();
           gun1.reload(15);
           gun1.fire();
           gun1.fire();
           gun1.displayNumOfAmmunition();
           gun1.reload(2);
           gun1.displayNumOfAmmunition();
           gun1.DisplaygunID();

           NerfGun gun2 = new NerfGun(15);

           gun2.DisplaygunID();
           gun2.fire();
           gun2.displayNumOfAmmunition();
           gun2.reload(2);
           gun2.displayNumOfAmmunition();


    }
  }