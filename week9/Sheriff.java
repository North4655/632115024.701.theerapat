package week9;

public class Sheriff extends Person{
    String workState ; 
    String work ;   
   
    public Sheriff(String name, int bornyear, String workState,String work) {
        super(name, bornyear);
        this.workState= workState ;
        this.work = work ;
    }

    public void introduce(){
      super.introduce();
      System.out.println("i' m  "+ work +" in " + workState );

    }
    
}

