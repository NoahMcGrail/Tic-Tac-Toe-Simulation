public class Player {
    
    private String name;
    private int wins;
    private int gamesPlayed;
    
    public Player(String name){
        this.name = name;
    }
    
    public void addWin(){
        wins++;
    }
    
    public void addGamePlayed(){
        gamesPlayed++;
    }
    
    public int getWins(){
        return wins;
    }
    
    public String getName(){
        return name;
    }
    
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    
    public static void main(String[] args) {
    }
}
