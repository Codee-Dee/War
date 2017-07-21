package War;

import java.util.*;

/*This class should set and shuffle the deck then split the deck into two. With player one getting a half and player two getting a half.*/
//A = 1
//J = 11
//Q = 12
//K = 13
public class WarDeck{
	
	private List <Integer> cardDeck = new ArrayList<>();
	private List <Integer> playerHand = new ArrayList<>();
	private List <Integer> enemyHand = new ArrayList<>();
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
	
	public List <Integer> getPlayerHand(){
		dealPlayerHand();
		return playerHand;
	}
	
	public void dealEnemyHand(){
		setDeck();
		int i;
		for(int j = 1; j < 27; j++){
			i = r.nextInt(cardDeck.size());
			enemyHand.add(cardDeck.get(i));
		}
	}
	
	public List <Integer> getEnemyHand(){
		dealEnemyHand();
		return enemyHand;
	}
}