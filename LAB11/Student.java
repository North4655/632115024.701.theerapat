package LAB11;

public class Student{
 
   private String name;
   private int age;
   private double gpa;

   public Student(String name , int age , double gpa ){
   this.name= name ;
   this.age= age ; 
   this.gpa = gpa ;
  }
    public String getname(){
       return name ;
    }

    public int getage(){
       return age ;
    }
      public double getGpa() {
         return gpa;
     }
   
   @Override
   public boolean  equals(Object obj) {
      if(obj == null ){
       return false ;
   }
     if(obj== this){
        return true ;
     }
   

   return this.getage() == ((Student) obj ).getage() || this.getGpa() == ((Student) obj ).getGpa();

}  
 

}
