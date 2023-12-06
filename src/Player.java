import java.util.*;

public class Player {
    
   private PairOfDice dice = new PairOfDice();
   private int bank,round;
   private String name;
   private Scanner scan = new Scanner(System.in);
   
   public Player(String n)
   {
       bank = 0;
       round =0;
       name =n;
             
   }
   
   public void Turn()
   {
       dice.roll();
   }
   

}
