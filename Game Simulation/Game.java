public class Game {
    
    private Player player1;
    private Player player2;
    private int games = 1;
    
    private int gamesTied;
    
    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void startGame(){
        //System.out.println("");
        System.out.println("Game: " + games);
        //System.out.println("");
        
        Player dummy = new Player("Dummy");
        
        Player currentPlayer = player2;
        int rolledNum;
        
        boolean spot1Taken = false;
        boolean spot2Taken = false;
        boolean spot3Taken = false;
        boolean spot4Taken = false;
        boolean spot5Taken = false;
        boolean spot6Taken = false;
        boolean spot7Taken = false;
        boolean spot8Taken = false;
        boolean spot9Taken = false;
        
        Player spot1Owner = dummy;
        Player spot2Owner = dummy;
        Player spot3Owner = dummy;
        Player spot4Owner = dummy;
        Player spot5Owner = dummy;
        Player spot6Owner = dummy;
        Player spot7Owner = dummy;
        Player spot8Owner = dummy;
        Player spot9Owner = dummy;
        
        outerloop:
        while(!(spot1Taken == true && spot2Taken == true && spot3Taken == true && spot4Taken == true && spot5Taken == true && spot6Taken == true && spot7Taken == true && spot8Taken == true && spot9Taken == true)){
            if(currentPlayer == player1){
            currentPlayer = player2;
            } else if(currentPlayer == player2){
            currentPlayer = player1;
            }
            while(true){
            rolledNum = (int)((Math.random() * 9) + 1);
            if(rolledNum == 1 && spot1Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 1");
                spot1Taken = true;
                spot1Owner = currentPlayer;
                break;
            } else if(rolledNum == 2 && spot2Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 2");
                spot2Taken = true;
                spot2Owner = currentPlayer;
                break;
            } else if(rolledNum == 3 && spot3Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 3");
                spot3Taken = true;
                spot3Owner = currentPlayer;
                break;
            } else if(rolledNum == 4 && spot4Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 4");
                spot4Taken = true;
                spot4Owner = currentPlayer;
                break;
            } else if(rolledNum == 5 && spot5Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 5");
                spot5Taken = true;
                spot5Owner = currentPlayer;
                break;
            } else if(rolledNum == 6 && spot6Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 6");
                spot6Taken = true;
                spot6Owner = currentPlayer;
                break;
            } else if(rolledNum == 7 && spot7Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 7");
                spot7Taken = true;
                spot7Owner = currentPlayer;
                break;
            } else if(rolledNum == 8 && spot8Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 8");
                spot8Taken = true;
                spot8Owner = currentPlayer;
                break;
            } else if(rolledNum == 9 && spot9Taken == false){
                //System.out.println(currentPlayer.getName() + " has claimed Spot 9");
                spot9Taken = true;
                spot9Owner = currentPlayer;
                break;
            } else if((spot1Owner == currentPlayer && spot4Owner == currentPlayer && spot7Owner == currentPlayer) || (spot2Owner == currentPlayer && spot5Owner == currentPlayer && spot8Owner == currentPlayer) || (spot3Owner == currentPlayer && spot6Owner == currentPlayer && spot9Owner == currentPlayer) || (spot1Owner == currentPlayer && spot2Owner == currentPlayer && spot3Owner == currentPlayer) || (spot4Owner == currentPlayer && spot5Owner == currentPlayer && spot6Owner == currentPlayer) || (spot7Owner == currentPlayer && spot8Owner == currentPlayer && spot9Owner == currentPlayer) || (spot1Owner == currentPlayer && spot5Owner == currentPlayer && spot9Owner == currentPlayer) || (spot3Owner == currentPlayer && spot5Owner == currentPlayer && spot7Owner == currentPlayer)){
                games ++;
                currentPlayer.addWin();
                player1.addGamePlayed();
                player2.addGamePlayed();
                //System.out.println(currentPlayer.getName() + " has won!");
                break outerloop;
            }
            }
        }
        if(spot1Taken == true && spot2Taken == true && spot3Taken == true && spot4Taken == true && spot5Taken == true && spot6Taken == true && spot7Taken == true && spot8Taken == true && spot9Taken == true){
            games ++;
            player1.addGamePlayed();
            player2.addGamePlayed();
            gamesTied ++;
            //System.out.println("Game Tied!");
        }
        
        
    }
    
    public void printStats(){
        System.out.println("\n" + player1.getName() + " \nWins: " + player1.getWins() + "\nTies: " + gamesTied + "\nGames Played: " + player1.getGamesPlayed() + "\nWin Rate: " + ((double)player1.getWins() / player1.getGamesPlayed() * 100) + "%");
        System.out.println("\n" + player2.getName() + " \nWins: " + player2.getWins() + "\nTies: " + gamesTied + "\nGames Played: " + player2.getGamesPlayed() + "\nWin Rate: " + ((double)player2.getWins() / player2.getGamesPlayed() * 100) + "% \n");
        System.out.println("Tie Rate: " + (gamesTied / (double)player1.getGamesPlayed() * 100) + "%");
    }
    
    public static void main(String[] args) {
    }
}
