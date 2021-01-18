package week7;

public class Animal extends Pets {
     String PB1 ;
    String PB2 ;
    String PB3 ;
    String PB4 ;
      String PB5 ;


    public  Animal(String name , String species , String color ,  int age ){
         this.name= name ;
         this.species = species ;
         this.color = color ; 
         this.age= age ;
    }
   
    public  void  theissize(){
        System.out.println(  "is  " +PB1);
       
}
   public void ishair(){
         System.out.println(" is "+PB2);

   }
  
   public void  isRun() {
    System.out.println("" +PB3 );

}

  public void isBark(){
       System.out.println(" "+PB4);

  }
  public void isAbility(){
        System.out.println(" "+PB5);

  }

}