import java.util.*;

public class Pig {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String x,y,z;
    System.out.println("");
    while (true){
        System.out.println("WELCOME TO THE PIG GAME! \ntype \"rules\" to learn how to play \ntype \"play\" to play \ntype \"quit\" to quit");
        x = scan.nextLine();

        if(x.equalsIgnoreCase("quit"))
        {
            System.exit(0);
        }
              
        else if(x.equalsIgnoreCase("rules"))
        {
            System.out.println("Players take turns to roll two dice as many times as they wish, \nadding all roll results to a running total, but losing their gained score for the turn if they roll a 1. \nIf the player rolls a \"snake eyes\", they will lose all their points. \nFirst player to 100 points will win.");
        }
        else if(x.equalsIgnoreCase("play")) {
            System.out.println("Enter player 1's name: ");
            y = scan.nextLine();
            System.out.println("Enter player 2's name: ");
            z = scan.nextLine();
        
            Game game = new Game(y,z);
            while (true)
            {             
                 System.out.println("type roll to roll\ntype quit to quit");
                 String play = scan.nextLine();
                 if(play.equalsIgnoreCase("quit"))
                 {
                     System.exit(0);
                 }
                 else if(!play.equalsIgnoreCase("roll"))
                 {
                     game.play();
                 }
                     
            }
            
        }
      
        else if(!x.equalsIgnoreCase("play") ||!x.equalsIgnoreCase("rules") || !x.equalsIgnoreCase("quit") ){
            System.out.println("invalid input");
            System.out.println("");
        }

  
    
    }
}
}
        