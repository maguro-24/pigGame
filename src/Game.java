



public class Game {
    
    private Player p1;
    private Player p2;
    
    public Game(String n1, String n2)
    {
        p1 = new Player(n1);
        p2 = new Player(n2);
    }
    
    public void play()
    {
        p1.Turn();
    
    }
    
    public void store()
    {
        p1.store();
    }
    
    public void computer()
    {
      p2.CompTurn(p1);
        System.out.println("turn");
    }

}
