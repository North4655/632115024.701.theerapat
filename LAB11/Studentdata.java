package LAB11;

public class Studentdata{

     public static void main (String[]args) {
         
     
    Student std01 = new Student("Mark", 18 , 4.00);
    Student std02 = new Student("Jane", 18 , 2.20);
    Student std03 = new Student("Peter", 19 , 4.00);
    Student std04 = new Student("Mark", 22 , 1.75);
    
    
    int a = std01.hashCode();
     int b = std02.hashCode();
     int c = std03.hashCode() ;
     int d = std04.hashCode();
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);

     
    System.out.println(" NAME ");
    System.out.println(" std01 =  std02  "+" is "+ "Mark".equals("Jane"));
    System.out.println(" std01 =  std03  "+" is "+ "Mark".equals("Peter"));
    System.out.println(" std02 =  std04 "+" is "+ "Jane".equals("Mark"));
    System.out.println(" std01 =  std04  "+" is "+ "Mark".equals("Mark"));
   
    System.out.println(" AGE ");
    System.out.println(" std01 =  std02  "+" is "+  std01.equals(std02));
    System.out.println(" std03 =  std04  "+" is "+ std03.equals(std04));
    if(std01. hashCode()!= std03.hashCode()){
         System.out.println(" std01 =  std03   is false  ");
    }else{
     System.out.println(" std01 =  std03   is  true   ");
    }
    
    System.out.println(" GPA ");
    System.out.println(" std01 =  std02  "+" is "+  std01.equals(std03));
    System.out.println(" std01 =  std03  "+" is "+ std02.equals(std04));
    System.out.println(" std02 =  std04 "+" is "+ std02.equals(std03));



     }
    }