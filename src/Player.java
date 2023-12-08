import java.util.*;

public class Player {
    
   private PairOfDice dice = new PairOfDice();
   private int bank,round;
   private String name;
   private Scanner scan = new Scanner(System.in);
   private boolean Win;
   
   public Player(String n)
   {
       bank = 0;
       round =0;
       name =n;
             
   }
   
   public void Turn()
   {
       dice.roll();
      
       System.out.println("player " + name + ": " + dice);
      
       if (dice.isSnakeEyes())
       {
           bank = 0;
           round = 0;
           System.out.println("UNLUCKY! SNAKE EYES! ALL POINTS CLEARED");
       }
       else if (dice.hasOne())
       {
           round = 0;
           System.out.println(name+ " score cleared");
       }
           round = dice.getSum();
   }
   
   public void store()
   {
       bank = bank + round;
   }
   
   
   public void win()
   {
       if(bank == 100)
       {
           Win=true;
       }
   }
   
   

   
   
 
}
