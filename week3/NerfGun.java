package week3;

public class NerfGun {
   
 
    private  int  displaygunID = 1  ;

    private int ammunition = 0 ;

     public NerfGun(){}


public NerfGun (int ammunition){
    this.ammunition=ammunition ; 
   
}

  
public void DisplaygunID() {
     
    System.out.println("the ID of this gun is  "+displaygunID);
    displaygunID ++ ;
   
  }

public void reload(int reload){ 
    if (reload+ammunition> 15){
        System.out.println("Eror !!! the ammunition is overload ");
    }
    else {
        ammunition= ammunition + reload ;
    }

}
    public void fire (){ 
        if(ammunition== 0){ 
            System.out.println("there is no ammo ");
        }
        else {
            System.out.println("BANG !!! ");
            ammunition-- ;
        }
    }
       public void displayNumOfAmmunition(){
           System.out.println(""+ammunition+" bullet left");
       }


     
     
}	
