package week6;

public class Person {
    String name  ;
    int age ; 
    String gender ;
    String job ;
    public Person (){}

    public Person(String name , int  age ,String gender ,String job  ){ 
         this.name =name; 
         this.age = age ;
         this.gender =gender; 
         this.job =job; 


 }

    public void introduce (){
        System.out.println(" my name is "+name);
        System.out.println(" age is  "+age);
        System.out.println(" gender is  "+gender);
        System.out.println(" job  is  "+job);
    }


}
