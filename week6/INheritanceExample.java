package week6;
//theerapat jongthong 632115024 
public class INheritanceExample {
    public static void main (String[]args ) {

     Artist art  = new Artist(" ball ", 20 , " Boy "  , "  engineer");
    art.genre=  " hiphop" ;
    art.introduce();
    art.PlayMusic();
    System.out.println(" ");
    Artist art1  = new  Artist(" mike ",  19  , " boy ",  "  gamer");
    art1.genre=  " pop" ;
    art1.introduce();
    art1.PlayMusic();
    System.out.println(" ");
    Artist art2   = new  Artist(" plai  ",  20  , " boy ",  " Doctor ");
    art2.genre=  " R&B " ;
    art2.introduce();
    art2.PlayMusic();
    System.out.println(" ");
    Artist art3   = new  Artist(" konn   ",  20  , " boy ",  " dentist  ");
    art3.genre=  " Rock " ;
    art3.introduce();
    art3.PlayMusic();
    System.out.println(" ");
    Artist art4   = new  Artist("  tata ",  20  , " boy ",  "  driver ");
    art4.genre=  "   jazz " ;
    art4.introduce();
    art4.PlayMusic();
    }
}
