package week9;
// theerapat jongthong 
//632115024 


public class Testoverride1 {
 public static void main (String[]args ) {
     Person person1;
     Sheriff person2 ;
     Sheriff person3 ;
     Sheriff person4 ; 
     Sheriff person5 ;
     Sheriff person6 ;


      person1 = new  Person("Mark ",2011);
      person2 =new Sheriff("mateo ",1988 , " california"," teacher ");
      person3 = new Sheriff("Ball",1977, "CMU", "teacher and  teach the student ");
      person4 = new Sheriff("Tu",1954,"Thailand", "prime minister and work");
      person5 = new Sheriff("Messi",1987 , "Barcelona football club","Football player ");
      person6 = new Sheriff("north",2545," CMU"," student in camt" );
      
      
      System.out.println(" !!!!  test !!!!");
      person1.introduce();
      person2.introduce();

      System.out.println("add more object  ");
      person3.introduce();
      System.out.println(" ");
      person4.introduce();
      System.out.println(" ");
      person5.introduce();
      System.out.println(" ");
      person6.introduce();

 }


    
}