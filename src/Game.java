



public class Game {
    
    private Player p1;
    private Player p2;
    
    public Game(String n1, String n2)
    {
        p1 = new Player(n1);
        p2 = new Player(n1);
    }
    
    public void play()
    {
        p1.Turn();
        p2.Turn();
    }
        

}
