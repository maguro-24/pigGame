import java.util.*;

public class Player {
    
   private PairOfDice dice = new PairOfDice();
   private int bank,round;
   private String name;
   private Scanner scan = new Scanner(System.in);
   private boolean Win,turn;
   
   public Player(String n)
   {
       bank = 0;
       round =0;
       name =n;
             
   }
   
   public void Turn()
   {
       dice.roll();
      
      
      
       if (dice.isSnakeEyes())
       {
           bank = 0;
           round = 0;
           System.out.println("UNLUCKY! SNAKE EYES! ALL POINTS CLEARED");
       }
       else if (dice.hasOne())
       {
           round = 0;
           System.out.println(name+ " round score cleared");
       }
           round = dice.getSum();
           System.out.println("player " + name + ": " + dice.getSum());
           System.out.println(bank);
       
   }
   
   public int GetBank()
   {
       return bank;
   }
           
   
   public void CompTurn(Player other)
   {
      Turn();
      if (GetBank() >= bank)
      {
          Turn();
         

      }
      else if (dice.getSum()>= 20)
      {
         store();
         

      }
      else
      {
          Turn();
          System.out.println("player " + name + ": " + dice.getSum());
           System.out.println(bank);

      }
  
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
   
   public void TurnEnd()
   {
       turn = false;
       while (turn = false)
       {
           Turn();
       }
   }
   
   

   
   
 
}
