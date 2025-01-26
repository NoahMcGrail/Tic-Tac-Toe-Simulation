public class Tester
{
    public static void main(String[] args)
    {
        Player test1 = new Player("Player 1");
        Player test2 = new Player("Player 2");
        
        Game testGame = new Game(test1, test2);
        
        for(int i = 0; i < 1000000; i ++){
            testGame.startGame();
        }
        
        testGame.printStats();
    }
}
