package week6;

public class Artist extends Person {
    String genre ;

    public Artist(String name , int age,String gender ,String job ){

        this.name = name ; 
        this.age=age;
        this.gender =gender; 
        this.job =job; 
    }
    public void PlayMusic (){

        System.out.println(name+" is playing "+ genre + " music ");
    }
}
