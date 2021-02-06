package week9;

public class Person {
    String name ; 
    int bornyear ;

    public Person(String name , int bornyear) {
        this.name = name ;
        this.bornyear = bornyear ;

    }
     
    public void introduce(){
       System.out.print(" my name is " + name );
       System.out.println("i was born in  " + bornyear );

    }
    

   

}
   