package War;

/*This class should handle the actual game play of war*/

public class War{
	
	private WarDeck wd = new WarDeck();
	private boolean stillPlaying = true;
	
	
	public int drawFromPlayerHand(){
		return wd.getPlayerHand().get(0);
	}
	
	public int drawFromDealerHand(){
		return wd.getEnemyHand().get(0);
	}
	
	public void compareHands(){
		
		
	}
	
	public String getWinner(){
		String winner = "";
		
		while(stillPlaying == true){
			if (wd.getEnemyHand().size() == 0){
				winner = "Player Wins!";
				stillPlaying = false;
				return winner;
			}
			else if (wd.getPlayerHand().size() == 0){
				winner = "Computer Wins!";
				stillPlaying = false;
				return winner;
			}
			else{
				stillPlaying = true;
			}
		}
			
			return winner;
	}
	
	
		
}