package week7;

public class Pets {
      String name ; 
       String species ;
      String color ;
      int age ;


     public Pets(){}

     
     public Pets(String name , String species , String color ,  int age  ){
         this.name= name ;
         this.species = species ;
         this.color = color ; 
         this.age= age ;
          }
            
          public void intro() {
            System.out.println("Name is "+name+"Species is "+species+"Color is "+color+"Age is  "+age);
           
     }
       
   


    
        




   
}
