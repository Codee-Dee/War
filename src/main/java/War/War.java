package War;

/*This class should handle the actual game play of war*/

import java.util.*;
public class War{
	
	private List <Integer> cardDeck = new ArrayList<>();
	public List <Integer> playerHand = new ArrayList<>();
	public List <Integer> enemyHand = new ArrayList<>();
	Random r = new Random();
	
	
	
	public void setDeck(){
		for (int i = 1; i < 5; i ++){
			for (int j = 1; j < 14; j++){
				cardDeck.add(j);
			}
		}
	}
	
	public List<Integer> getDeck(){
		setDeck();
		return cardDeck;
	}

	public void dealPlayerHand(){
		setDeck();
		int i;
		for(int j = 1; j < 27;j++){
			i = r.nextInt(cardDeck.size());
			playerHand.add(cardDeck.get(i));
		}
	}
	
	
	public void dealEnemyHand(){
		setDeck();
		int i;
		for(int j = 1; j < 27; j++){
			i = r.nextInt(cardDeck.size());
			enemyHand.add(cardDeck.get(i));
		}
	}
	
	
	public int drawFromPlayerHand(){
		return playerHand.get(0);
	}
	
	public int drawFromEnemyHand(){
		return enemyHand.get(0);
	}
	
	public void compareHands(){
		if (playerHand.get(0) > enemyHand.get(0)){
			playerHand.add(enemyHand.get(0));
			enemyHand.remove(enemyHand.get(0));
		}
		else if (enemyHand.get(0) > playerHand.get(0)){
			enemyHand.add(playerHand.get(0));
			playerHand.remove(enemyHand.get(0));
			
		}
		else{
			enemyHand.remove(enemyHand.get(0));
			playerHand.remove(playerHand.get(0));
		}
		
	}
	
	
	public String getWinner(){
		String winner = "";
		if (enemyHand.size() == 0){
			winner = "Player Wins!";
			return winner;
		}
		else if (playerHand.size() == 0){
			winner = "Computer Wins!";
			return winner;
		}
		else{
			winner = "Still going!";
			return winner;
		}
	}
	
	
		
}